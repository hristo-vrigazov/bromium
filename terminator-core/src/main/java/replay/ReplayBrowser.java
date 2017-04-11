package replay;

import execution.application.ApplicationAction;
import execution.application.ApplicationActionFactory;
import execution.executor.AutomationResult;
import execution.executor.WebDriverActionExecutor;
import execution.webdriver.WebdriverAction;
import utils.ConfigurationUtils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * Created by hvrigazov on 15.03.17.
 */
public class ReplayBrowser {

    private WebDriverActionExecutor executor;
    private ApplicationActionFactory applicationActionFactory;

    public ReplayBrowser(WebDriverActionExecutor executor,
                         ApplicationActionFactory applicationActionFactory) {
        this.executor = executor;
        this.applicationActionFactory = applicationActionFactory;
    }

    public AutomationResult replay(String pathToSerializedTest) throws IOException, InterruptedException, URISyntaxException {
        WebDriverActionExecutor executor = getTestScenario(pathToSerializedTest);
        executor.execute();
        return executor.getAutomationResult();
    }

    public AutomationResult replayOnScreen(String pathToSerializedTest, String screen) throws IOException, InterruptedException, URISyntaxException {
        WebDriverActionExecutor executor = getTestScenario(pathToSerializedTest);
        executor.executeOnScreen(screen);
        return executor.getAutomationResult();
    }

    public WebDriverActionExecutor getTestScenario(String pathToTestScenario) throws IOException {
        List<Map<String, String>> testCaseSteps = ConfigurationUtils.readSteps(pathToTestScenario);
        return getTestScenario(testCaseSteps);
    }

    public WebDriverActionExecutor getTestScenario(List<Map<String, String>> testCaseSteps) {
        Optional<WebdriverAction> initialPageLoading = applicationActionFactory.getInitialPageLoading().getWebdriverAction();
        addWebdriverAction(initialPageLoading);

        for (Map<String, String> testCaseStep: testCaseSteps) {
            ApplicationAction domainSpecificAction =
                    applicationActionFactory.create(testCaseStep);

            Optional<WebdriverAction> precondition = domainSpecificAction.getPrecondition();
            addWebdriverAction(precondition);

            Optional<WebdriverAction> webdriverAction = domainSpecificAction.getWebdriverAction();
            addWebdriverAction(webdriverAction);

            Optional<WebdriverAction> postcondition = domainSpecificAction.getPostcondition();
            addWebdriverAction(postcondition);
        }

        return executor;
    }

    private void addWebdriverAction(Optional<WebdriverAction> postcondition) {
        if (postcondition.isPresent()) {
            executor.addWebdriverAction(postcondition.get());
        }
    }

    public void dumpAllMetrics(String harFile, String csvFile) throws IOException {
        dumpHarMetrics(harFile);
        dumpLoadingTimes(csvFile);
    }

    public void dumpHarMetrics(String fileNameToDump) throws IOException {
        executor.dumpHarMetrics(fileNameToDump);
    }

    public void dumpLoadingTimes(String fileNameToDump) throws UnsupportedEncodingException, FileNotFoundException {
        executor.dumpLoadingTimes(fileNameToDump);
    }


}
