package com.hribol.bromium.integration.tests;

import com.google.common.io.Files;
import com.hribol.bromium.cli.Main;
import com.hribol.bromium.demo.app.DemoApp;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.*;

import static com.hribol.bromium.replay.report.AutomationResult.SUCCESS;
import static org.junit.Assert.assertEquals;

/**
 * Created by hvrigazov on 09.07.17.
 */
public class ReplayAjaxIT {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    private File testResourcesDirectory;
    private File demoAppResourcesDirectory;
    private File chromedriverFile;
    private File configurationFile;
    private File testCaseFile;
    private File measurementsFile;
    private DemoApp demoApp;

    @Before
    public void prepare() throws Exception {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));

        testResourcesDirectory = Files.createTempDir();
        demoAppResourcesDirectory = Files.createTempDir();

        chromedriverFile = extractResource("chromedriver");
        if (!chromedriverFile.setExecutable(true)) {
            throw new IllegalStateException("Cannot set chrome driver file to executable");
        }
        configurationFile = extractResource("demo.json");
        testCaseFile = extractResource("ajax.json");
        measurementsFile = createTempFile("measurements.csv");

        demoApp = new DemoApp(demoAppResourcesDirectory);
        demoApp.runOnSeparateThread();
    }

    @Test
    public void something() {
        String[] args = {
                "replay",
                "-d", "/usr/bin/chromedriver",
                "-a", configurationFile.getAbsolutePath(),
                "-u", "http://localhost:" + demoApp.getPort() + "/",
                "-c", testCaseFile.getAbsolutePath(),
                "-m", measurementsFile.getAbsolutePath()
        };

        Main.main(args);
        assertEquals(SUCCESS.toString(), getLastLine());
    }

    @After
    public void cleanUp() throws Exception {
        FileUtils.deleteDirectory(testResourcesDirectory);
        System.setOut(null);
        System.setErr(null);
        demoApp.dispose();
    }

    private String getLastLine() {
        String[] lines = outContent.toString().split(System.lineSeparator());
        return lines[lines.length - 1];
    }

    private File extractResource(String resource) throws IOException {
        File tempFile = File.createTempFile(resource, "", testResourcesDirectory);
        InputStream chromeDriverStream = getClass().getResourceAsStream("/" + resource);
        OutputStream fileOutputStream = new FileOutputStream(tempFile);
        IOUtils.copy(chromeDriverStream, fileOutputStream);
        return tempFile;
    }

    private File createTempFile(String filename) throws IOException {
        return File.createTempFile(filename, "", testResourcesDirectory);
    }
}
