package test.chrome.replay;

import com.hribol.spiderman.browsers.chrome.replay.ChromeDriverActionExecution;
import com.hribol.spiderman.replay.execution.WebDriverActionExecutor;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.io.IOException;
import java.net.URISyntaxException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 08.05.17.
 */
public class ChromeDriverActionExecutionTest {

    @Test
    public void creatingExecution() throws IOException, URISyntaxException {
        WebDriverActionExecutor webDriverActionExecutor = mock(WebDriverActionExecutor.class);
        when(webDriverActionExecutor.getBaseURL()).thenReturn("http://tenniskafe.com");

        ChromeDriverActionExecution chromeDriverActionExecution = new ChromeDriverActionExecution(webDriverActionExecutor);
        assertNotNull(chromeDriverActionExecution);
        assertEquals(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, chromeDriverActionExecution.getSystemProperty());
    }
}
