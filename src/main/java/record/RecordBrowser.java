package record;

import com.google.common.base.Splitter;
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

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
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
    private String baseUrl;
    private JavascriptInjector javascriptInjector;
    private List<Map<String, String>> domainSpecificActionList;

    public RecordBrowser(String pathToChromeDriver) {
        this.pathToChromeDriver = pathToChromeDriver;
        this.domainSpecificActionList = new ArrayList<>();
    }

    public void record(String baseUrl) throws IOException, InterruptedException {
        this.baseUrl = baseUrl;
        this.javascriptInjector = new JavascriptInjector();
        init();
        initializeWebDriver();
        maximize();
        driver.navigate().to(baseUrl);
    }

    public void dumpActions(String outputFile) throws IOException {
        Writer writer = new FileWriter(outputFile);

        Gson gson = new GsonBuilder().create();
        gson.toJson(domainSpecificActionList, writer);
        writer.close();
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
                String query = httpRequest.getUri().split("\\?")[1];
                Map<String, String> map = Splitter.on('&').trimResults().withKeyValueSeparator("=").split(query);
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

        proxy.newHar(baseUrl);
    }

    private boolean isUrlChangingRequest(HttpRequest httpRequest) {
        boolean expectsHtmlContent = httpRequest.headers().get("Accept").contains("html");
        boolean isFromCurrentBaseUrl = httpRequest.getUri().contains(baseUrl);
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
