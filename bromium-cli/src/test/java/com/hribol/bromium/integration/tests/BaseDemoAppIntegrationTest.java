package com.hribol.bromium.integration.tests;

import com.google.common.io.Files;
import com.hribol.bromium.demo.app.DemoApp;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static com.hribol.bromium.integration.tests.TestUtils.*;

import java.io.*;

/**
 * Created by hvrigazov on 18.07.17.
 */
public abstract class BaseDemoAppIntegrationTest {

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
    protected String pathToTestCase;

    public BaseDemoAppIntegrationTest(String resourceConfigurationPath, String pathToTestCase, String screen) {
        this.resourceConfigurationPath = resourceConfigurationPath;
        this.pathToTestCase = pathToTestCase;
        this.screen = screen;
    }

    @Before
    public void prepare() throws Exception {
        prepareSystem();
        prepareTestResources();
        prepareDemoApp();
    }

    private void prepareDemoApp() throws Exception {
        demoAppResourcesDirectory = Files.createTempDir();
        demoApp = new DemoApp(demoAppResourcesDirectory);
        demoApp.runOnSeparateThread();
    }

    private void prepareTestResources() throws IOException {
        testResourcesDirectory = Files.createTempDir();

        chromedriverFile = extractResource("chromedriver", testResourcesDirectory);
        if (!chromedriverFile.setExecutable(true)) {
            throw new IllegalStateException("Cannot set chrome driver file to executable");
        }
        configurationFile = extractResource(resourceConfigurationPath, testResourcesDirectory);
        measurementsFile = createTempFile("measurements.csv");
    }

    private void prepareSystem() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
        System.setProperty("java.awt.headless", "true");
    }

    @Test
    abstract public void runTest() throws IOException;

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

    protected File createTempFile(String filename) throws IOException {
        return File.createTempFile(filename, "", testResourcesDirectory);
    }
}
