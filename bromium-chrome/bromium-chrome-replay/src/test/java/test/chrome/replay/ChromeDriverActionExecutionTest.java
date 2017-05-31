package test.chrome.replay;

import com.hribol.spiderman.browsers.chrome.replay.ChromeDriverActionExecution;
import com.hribol.spiderman.replay.execution.ExecutorBuilder;
import com.hribol.spiderman.replay.filters.ProxyFacade;
import com.hribol.spiderman.replay.filters.ProxyFacadeSupplier;
import com.hribol.spiderman.replay.settings.ReplaySettings;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.io.IOException;
import java.net.URISyntaxException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 08.05.17.
 */
public class ChromeDriverActionExecutionTest {

    @Test
    public void creatingExecution() throws IOException, URISyntaxException {
        ProxyFacade proxyFacade = mock(ProxyFacade.class);
        ProxyFacadeSupplier proxyFacadeSupplier = mock(ProxyFacadeSupplier.class);
        when(proxyFacadeSupplier.get(anyString(), anyString())).thenReturn(proxyFacade);
        ExecutorBuilder executorBuilder = mock(ExecutorBuilder.class);
        when(executorBuilder.getProxyFacadeSupplier()).thenReturn(proxyFacadeSupplier);
        when(executorBuilder.getBaseURL()).thenReturn("http://tenniskafe.com");

        ChromeDriverActionExecution chromeDriverActionExecution = new ChromeDriverActionExecution(executorBuilder);
        assertNotNull(chromeDriverActionExecution);
        assertEquals(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, chromeDriverActionExecution.getSystemProperty());
        assertNotNull(chromeDriverActionExecution.createReplaySettings());
    }
}
