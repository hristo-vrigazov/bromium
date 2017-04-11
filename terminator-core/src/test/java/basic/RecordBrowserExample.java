package basic;

import org.junit.Test;
import record.ChromeRecordBrowser;
import record.RecordBrowserBase;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Created by hvrigazov on 11.04.17.
 */
public class RecordBrowserExample {

    @Test
    public void record() throws InterruptedException, IOException, URISyntaxException {
        String pathToChromedriver = "/home/hvrigazov/github/selenium-record-replay/chromedriver";
        String pathToJsInjection = "/home/hvrigazov/github/selenium-record-replay/terminator-core/src/main/resources/javascriptInjection/eventsRecorder.js";
        RecordBrowserBase recordBrowserBase = new ChromeRecordBrowser(pathToChromedriver, pathToJsInjection);
        recordBrowserBase.record("http://tenniskafe.com");
        System.in.read();
    }
}
