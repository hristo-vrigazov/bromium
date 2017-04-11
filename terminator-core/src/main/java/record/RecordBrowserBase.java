package record;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import execution.settings.ExecutionSettings;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponse;
import net.lightbody.bmp.util.HttpMessageContents;
import net.lightbody.bmp.util.HttpMessageInfo;
import utils.ConfigurationUtils;

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
public abstract class RecordBrowserBase {

    private ExecutionSettings executionSettings;
    private String pathToDriverExecutable;
    private String pathToJsInjectonFile;
    private JavascriptInjector javascriptInjector;
    private List<Map<String, String>> domainSpecificActionList;
    private int timeout;

    protected URI baseURI;

    public RecordBrowserBase(String pathToDriverExecutable, String pathToJsInjectionFile) {
        this.pathToDriverExecutable = pathToDriverExecutable;
        this.pathToJsInjectonFile = pathToJsInjectionFile;
        this.domainSpecificActionList = new ArrayList<>();
    }

    protected abstract ExecutionSettings createExecutionSettings();
    protected abstract String getSystemProperty();

    public void record(String baseURI) throws IOException, InterruptedException, URISyntaxException {
        this.baseURI = new URI(baseURI);
        this.javascriptInjector = new JavascriptInjector(pathToJsInjectonFile);
        this.timeout = 15;
        this.executionSettings = createExecutionSettings();
        init();
        executionSettings.openBaseUrl();
    }

    public void dumpActions(String outputFile) throws IOException {
        System.out.println("Dumping the test case to " + outputFile);
        Writer writer = new FileWriter(outputFile);
        Gson gson = new GsonBuilder().create();
        gson.toJson(domainSpecificActionList, writer);
        writer.close();
        System.out.println("Done");
    }

    public void cleanUp() {
        executionSettings.cleanUpRecord();
    }

    private void init() throws IOException {
        System.setProperty(getSystemProperty(), pathToDriverExecutable);

        executionSettings.initRecord(timeout);
    }

    protected HttpResponse filterRequest(HttpRequest request, HttpMessageContents contents, HttpMessageInfo messageInfo) {
        if (request.getUri().contains("http://working-selenium.com/submit-event")) {
            Map<String, String> map = null;
            try {
                map = ConfigurationUtils.splitQuery(new URL(request.getUri()));
            } catch (UnsupportedEncodingException | MalformedURLException e) {
                e.printStackTrace();
            }
            System.out.println(map);
            domainSpecificActionList.add(map);
        }
        return null;
    }

    protected void filterResponse(HttpResponse response, HttpMessageContents contents, HttpMessageInfo messageInfo) {
        if (isUrlChangingRequest(messageInfo.getOriginalRequest())) {
            String baseContent = javascriptInjector.getInjectionCode();
            baseContent += contents.getTextContents();
            contents.setTextContents(baseContent);
        }
    }

    private boolean isUrlChangingRequest(HttpRequest httpRequest) {
        boolean expectsHtmlContent = httpRequest.headers().get("Accept").contains("html");
        boolean isFromCurrentBaseUrl = httpRequest.getUri().contains(baseURI.getHost());
        return expectsHtmlContent && isFromCurrentBaseUrl;
    }
}
