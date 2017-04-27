package com.hribol.spiderman.record;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.hribol.spiderman.record.settings.RecordSettings;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by hvrigazov on 09.03.17.
 */
public abstract class RecordBrowserBase {

    private RecordSettings recordSettings;
    private String pathToDriverExecutable;
    private String pathToJsInjectonFile;
    private int timeout;

    protected JavascriptInjector javascriptInjector;
    protected List<Map<String, String>> domainSpecificActionList;

    public RecordBrowserBase(String pathToDriverExecutable, String pathToJsInjectionFile) {
        this.pathToDriverExecutable = pathToDriverExecutable;
        this.pathToJsInjectonFile = pathToJsInjectionFile;
        this.domainSpecificActionList = new ArrayList<>();
    }

    protected abstract RecordSettings createRecordSettings(URI baseURI);
    protected abstract String getSystemProperty();

    protected RecordResponseFilter recordResponseFilter;
    protected RecordRequestFilter recordRequestFilter;

    public void record(String baseURI) throws IOException, InterruptedException, URISyntaxException {
        URI uri = new URI(baseURI);
        this.javascriptInjector = new JavascriptInjector(pathToJsInjectonFile);
        this.timeout = 15;
        this.recordResponseFilter = new RecordResponseFilter(uri, javascriptInjector.getInjectionCode());
        this.recordRequestFilter = new RecordRequestFilter(domainSpecificActionList);
        this.recordSettings = createRecordSettings(uri);
        System.setProperty(getSystemProperty(), pathToDriverExecutable);
        recordSettings.prepareRecord(timeout);
        recordSettings.openBaseUrl();
    }

    public void dumpActions(String outputFile) throws IOException {
        Writer writer = new FileWriter(outputFile);
        Gson gson = new GsonBuilder().create();
        gson.toJson(domainSpecificActionList, writer);
        writer.close();
    }

    public void cleanUp() {
        recordSettings.cleanUpRecord();
    }
}
