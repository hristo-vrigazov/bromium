package basic;

import com.hribol.automation.core.actions.ClickClassByText;
import com.hribol.automation.core.execution.executor.ChromeDriverActionExecution;
import com.hribol.automation.core.execution.executor.TestScenario;
import com.hribol.automation.core.execution.executor.WebDriverActionExecution;
import com.hribol.automation.core.execution.executor.WebDriverActionExecutor;
import com.hribol.automation.core.execution.webdriver.WebDriverAction;
import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Created by hvrigazov on 11.04.17.
 */
public class RecordBrowserExample {

    @Test
    public void record() throws InterruptedException, IOException, URISyntaxException {
        WebDriverAction clickClassByText =
                new ClickClassByText("a",
                        "a",
                        "a",
                        false);

        TestScenario testScenario = new TestScenario();
        testScenario.addWebDriverAction(clickClassByText);

        WebDriverActionExecutor webDriverActionExecutor =
                new WebDriverActionExecutor()
                .baseURI("http://someurl")
                .timeoutInSeconds(20)
                .pathToDriverExecutable("asd");

        WebDriverActionExecution execution = new ChromeDriverActionExecution(webDriverActionExecutor);

        execution.execute(testScenario);
    }
}
