package com.hribol.bromium.integration.tests;

import com.google.common.io.Files;
import com.hribol.bromium.cli.Main;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

/**
 * Created by hvrigazov on 09.07.17.
 */
public class ReplayAjaxIT {

    private File testResourcesDirectory;
    private File chromedriverFile;
    private File configurationFile;
    private File testCaseFile;
    private File measurementsFile;

    @Before
    public void prepare() throws IOException {
        testResourcesDirectory = Files.createTempDir();
        chromedriverFile = extractResource("chromedriver");
        if (!chromedriverFile.setExecutable(true)) {
            throw new IllegalStateException("Cannot set chrome driver file to executable");
        }
        configurationFile = extractResource("demo.json");
        testCaseFile = extractResource("ajax.json");
        measurementsFile = createTempFile("measurements.csv");
    }

    @Test
    public void something() {
        String[] args = {
                "replay",
                "-d", chromedriverFile.getAbsolutePath(),
                "-a", configurationFile.getAbsolutePath(),
                "-u", "http://localhost:3000/",
                "-c", testCaseFile.getAbsolutePath(),
                "-m", measurementsFile.getAbsolutePath()
        };

        Main.main(args);
    }

    @After
    public void cleanUp() throws IOException {
        FileUtils.deleteDirectory(testResourcesDirectory);
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
