package com.hribol.bromium.common.record.settings;

import net.lightbody.bmp.BrowserMobProxy;
import org.openqa.selenium.WebDriver;

/**
 * Created by hvrigazov on 22.04.17.
 */
public class RecordManager {

    private WebDriver driver;
    private BrowserMobProxy proxy;

    public RecordManager(WebDriver driver,
                         BrowserMobProxy proxy) {
        this.driver = driver;
        this.proxy = proxy;
    }

    public void cleanUpRecord() {
        driver.quit();
        proxy.stop();
    }

    public void prepareRecord() {
        this.driver.manage().window().maximize();
    }

    public void open(String baseURI) {
        driver.get(baseURI);
    }
}
