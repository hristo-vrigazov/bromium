package com.hribol.automation.core.record;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.hribol.automation.core.execution.settings.ExecutionSettings;
import com.hribol.automation.core.record.settings.RecordSettings;
import com.hribol.automation.core.utils.ConfigurationUtils;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponse;
import net.lightbody.bmp.util.HttpMessageContents;
import net.lightbody.bmp.util.HttpMessageInfo;

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

    private RecordSettings executionSettings;
    private String pathToDriverExecutable;
    private String pathToJsInjectonFile;
    private int timeout;

    protected JavascriptInjector javascriptInjector;
    protected List<Map<String, String>> domainSpecificActionList;
    protected URI baseURI;

    public RecordBrowserBase(String pathToDriverExecutable, String pathToJsInjectionFile) {
        this.pathToDriverExecutable = pathToDriverExecutable;
        this.pathToJsInjectonFile = pathToJsInjectionFile;
        this.domainSpecificActionList = new ArrayList<>();
    }

    protected abstract RecordSettings createExecutionSettings();
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

        executionSettings.prepareRecord(timeout);
    }
}
