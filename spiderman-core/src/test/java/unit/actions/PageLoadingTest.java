package unit.actions;

import com.hribol.spiderman.core.actions.PageLoading;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by hvrigazov on 21.04.17.
 */
public class PageLoadingTest {

    @Test
    public void pageLoadingExecutionInvokesDriverGet() {
        String url = "http://www.someurl.com";
        String pageLoadingEventName = "PAGE_LOADING";

        PageLoading pageLoading = new PageLoading(url, pageLoadingEventName);
        WebDriver webDriver = mock(WebDriver.class);
        pageLoading.execute(webDriver);

        verify(webDriver).get(url);
        assertEquals(pageLoadingEventName, pageLoading.getName());
        assertEquals(true, pageLoading.expectsHttpRequest());
    }
}
