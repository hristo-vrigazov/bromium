package browser;

import record.RecordBrowser;

import java.io.IOException;

/**
 * Created by hvrigazov on 14.03.17.
 */
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        RecordBrowser recordBrowser = new RecordBrowser("chromedriver");
        recordBrowser.record("http://www.tenniskafe.com/");
        System.out.println("Press Enter when finished recording");
        System.in.read();
        recordBrowser.dumpActions("output.json");
        recordBrowser.quit();
        System.exit(0);
    }
}
