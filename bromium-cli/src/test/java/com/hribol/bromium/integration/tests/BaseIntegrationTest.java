package com.hribol.bromium.integration.tests;

import com.google.common.io.Files;
import com.hribol.bromium.cli.Main;
import com.hribol.bromium.demo.app.DemoApp;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

/**
 * Created by hvrigazov on 18.07.17.
 */
public abstract class BaseIntegrationTest {

    protected final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    protected final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    protected final String screen;

    protected File testResourcesDirectory;
    protected File demoAppResourcesDirectory;
    protected File chromedriverFile;
    protected File configurationFile;
    protected File testCaseFile;
    protected File measurementsFile;
    protected DemoApp demoApp;

    protected String resourceConfigurationPath;
    protected String resouceCasePath;

    public BaseIntegrationTest(String resourceConfigurationPath, String resouceCasePath, String screen) {
        this.resourceConfigurationPath = resourceConfigurationPath;
        this.resouceCasePath = resouceCasePath;
        this.screen = screen;
    }

    @Before
    public void prepare() throws Exception {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
        System.setProperty("java.awt.headless", "true");

        testResourcesDirectory = Files.createTempDir();
        demoAppResourcesDirectory = Files.createTempDir();

        chromedriverFile = extractResource("chromedriver");
        if (!chromedriverFile.setExecutable(true)) {
            throw new IllegalStateException("Cannot set chrome driver file to executable");
        }
        configurationFile = extractResource(resourceConfigurationPath);
        testCaseFile = extractResource(resouceCasePath);
        measurementsFile = createTempFile("measurements.csv");

        demoApp = new DemoApp(demoAppResourcesDirectory);
        demoApp.runOnSeparateThread();
    }

    @Test
    abstract public void runTest();

    @After
    public void cleanUp() throws Exception {
        FileUtils.deleteDirectory(testResourcesDirectory);
        System.setOut(null);
        System.setErr(null);
        demoApp.dispose();
    }

    protected String getOutput() {
        return outContent.toString();
    }

    protected File extractResource(String resource) throws IOException {
        File tempFile = File.createTempFile(resource, "", testResourcesDirectory);
        InputStream chromeDriverStream = getClass().getResourceAsStream("/" + resource);
        OutputStream fileOutputStream = new FileOutputStream(tempFile);
        IOUtils.copy(chromeDriverStream, fileOutputStream);
        chromeDriverStream.close();
        fileOutputStream.close();
        return tempFile;
    }

    protected File createTempFile(String filename) throws IOException {
        return File.createTempFile(filename, "", testResourcesDirectory);
    }
}
