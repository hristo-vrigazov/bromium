package basic;

import org.junit.Test;
import com.hribol.automation.record.ChromeRecordBrowser;
import com.hribol.automation.record.RecordBrowserBase;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Created by hvrigazov on 11.04.17.
 */
public class RecordBrowserExample {

    @Test
    public void record() throws InterruptedException, IOException, URISyntaxException {
        String pathToChromedriver = "/home/hvrigazov/github/selenium-edu.hvrigazov.automation.record-edu.hvrigazov.automation.replay/chromedriver";
        String pathToJsInjection = "/home/hvrigazov/github/selenium-edu.hvrigazov.automation.record-edu.hvrigazov.automation.replay/terminator-core/src/main/resources/javascriptInjection/eventsRecorder.js";
        RecordBrowserBase recordBrowserBase = new ChromeRecordBrowser(pathToChromedriver, pathToJsInjection);
        recordBrowserBase.record("http://tenniskafe.com");
        System.in.read();
    }
}
