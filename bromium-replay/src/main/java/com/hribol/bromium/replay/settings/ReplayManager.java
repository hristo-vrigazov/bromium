package com.hribol.bromium.replay.settings;

import net.lightbody.bmp.core.har.Har;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.service.DriverService;

import java.io.IOException;

/**
 * Created by hvrigazov on 21.03.17.
 */
public interface ReplayManager {
    void cleanUpReplay();

    WebDriver getWebDriver();

    Har getHar();

    void prepareReplay(String pathToDriver) throws IOException;

}