package com.hribol.spiderman.record;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.hribol.spiderman.replay.config.suppliers.VisibleWebDriverSupplier;
import com.hribol.spiderman.record.settings.ProxyDriverIntegrator;
import com.hribol.spiderman.record.settings.RecordManager;
import com.hribol.spiderman.replay.config.utils.JavascriptInjector;
import net.lightbody.bmp.BrowserMobProxy;
import net.lightbody.bmp.filters.ResponseFilter;
import org.openqa.selenium.WebDriver;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by hvrigazov on 09.03.17.
 */
public abstract class RecordBrowserBase {

    private RecordManager recordManager;
    private String pathToDriverExecutable;
    private String jsInjectionCode;

    public RecordBrowserBase(String pathToDriverExecutable, JavascriptInjector javascriptInjector) throws IOException {
        this.pathToDriverExecutable = pathToDriverExecutable;
        this.jsInjectionCode = javascriptInjector.getInjectionCode();
    }

    public abstract String getSystemProperty();
    public abstract VisibleWebDriverSupplier getVisibleWebDriverSupplier();

    private ResponseFilter responseFilter;
    private RecordRequestFilter recordRequestFilter;
    private ProxyDriverIntegrator proxyDriverIntegrator;

    public void record(String baseURI, int timeout) throws IOException, InterruptedException, URISyntaxException {
        URI uri = new URI(baseURI);
        this.responseFilter = new RecordResponseFilter(uri, jsInjectionCode);
        this.recordRequestFilter = new RecordRequestFilter();
        this.proxyDriverIntegrator = new ProxyDriverIntegrator(recordRequestFilter, responseFilter, getVisibleWebDriverSupplier(), timeout);
        WebDriver driver = proxyDriverIntegrator.getDriver();
        BrowserMobProxy proxy = proxyDriverIntegrator.getProxy();
        this.recordManager = new RecordManager(driver, proxy);
        System.setProperty(getSystemProperty(), pathToDriverExecutable);
        recordManager.prepareRecord();
        recordManager.open(baseURI);
    }

    public void dumpActions(String outputFile) throws IOException {
        Writer writer = new FileWriter(outputFile);
        Gson gson = new GsonBuilder().create();
        gson.toJson(recordRequestFilter.getApplicationSpecificActionList(), writer);
        writer.close();
    }

    public void cleanUp() {
        recordManager.cleanUpRecord();
    }
}
