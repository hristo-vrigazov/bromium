package record;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.netty.handler.codec.http.HttpRequest;
import net.lightbody.bmp.BrowserMobProxy;
import net.lightbody.bmp.BrowserMobProxyServer;
import net.lightbody.bmp.client.ClientUtil;
import net.lightbody.bmp.proxy.CaptureType;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import utils.Utils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by hvrigazov on 09.03.17.
 */
public class RecordBrowser {

    private WebDriver driver;
    private BrowserMobProxy proxy;
    private DesiredCapabilities capabilities;
    private Proxy seleniumProxy;
    private String pathToChromeDriver;
    private String pathToJsInjectonFile;
    private URI baseURI;
    private JavascriptInjector javascriptInjector;
    private List<Map<String, String>> domainSpecificActionList;

    public RecordBrowser(String pathToChromeDriver, String pathToJsInjectionFile) {
        this.pathToChromeDriver = pathToChromeDriver;
        this.pathToJsInjectonFile = pathToJsInjectionFile;
        this.domainSpecificActionList = new ArrayList<>();
    }

    public void record(String baseUrl) throws IOException, InterruptedException, URISyntaxException {
        this.baseURI = new URI(baseUrl);
        this.javascriptInjector = new JavascriptInjector(pathToJsInjectonFile);
        init();
        initializeWebDriver();
        maximize();
        driver.navigate().to(baseUrl);
    }

    public void dumpActions(String outputFile) throws IOException {
        System.out.println("Dumping the test case to " + outputFile);
        Writer writer = new FileWriter(outputFile);
        Gson gson = new GsonBuilder().create();
        gson.toJson(domainSpecificActionList, writer);
        writer.close();
        System.out.println("Done");
    }

    public void quit() {
        this.driver.quit();
        this.proxy.stop();
    }

    private void init() {
        System.setProperty("webdriver.chrome.driver", pathToChromeDriver);

        initializeProxyServer();
        initializeSeleniumProxy();
        initializeProxyFilters();
        initializeDesiredCapabilities();
    }

    private void initializeProxyServer() {
        this.proxy = new BrowserMobProxyServer();
        this.proxy.start(0);
    }

    private void initializeSeleniumProxy() {
        seleniumProxy = ClientUtil.createSeleniumProxy(proxy);
    }

    private void initializeProxyFilters() {
        proxy.enableHarCaptureTypes(CaptureType.REQUEST_CONTENT, CaptureType.RESPONSE_CONTENT);

        proxy.addRequestFilter((httpRequest, httpMessageContents, httpMessageInfo) -> {
            if (httpRequest.getUri().contains("http://working-selenium.com/submit-event")) {
                Map<String, String> map = null;
                try {
                    map = Utils.splitQuery(new URL(httpRequest.getUri()));
                } catch (UnsupportedEncodingException | MalformedURLException e) {
                    e.printStackTrace();
                }
                System.out.println(map);
                domainSpecificActionList.add(map);
            }
            return null;
        });

        proxy.addResponseFilter((httpResponse, httpMessageContents, httpMessageInfo) -> {
            if (isUrlChangingRequest(httpMessageInfo.getOriginalRequest())) {
                String baseContent = javascriptInjector.getInjectionCode();
                baseContent += httpMessageContents.getTextContents();
                httpMessageContents.setTextContents(baseContent);
            }
        });

        proxy.newHar(baseURI.getHost());
    }

    private boolean isUrlChangingRequest(HttpRequest httpRequest) {
        boolean expectsHtmlContent = httpRequest.headers().get("Accept").contains("html");
        boolean isFromCurrentBaseUrl = httpRequest.getUri().contains(baseURI.getHost());
        return expectsHtmlContent && isFromCurrentBaseUrl;
    }

    private void initializeDesiredCapabilities() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-popup-blocking");

        capabilities = new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        capabilities.setCapability(CapabilityType.PROXY, seleniumProxy);
    }

    private void initializeWebDriver() {
        this.driver = new ChromeDriver(capabilities);
    }

    private void maximize() {
        driver.manage().window().maximize();
    }
}
