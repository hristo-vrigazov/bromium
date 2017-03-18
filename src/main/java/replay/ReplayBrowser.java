package replay;

import config.ApplicationConfiguration;
import execution.ApplicationAction;
import execution.ApplicationActionFactory;
import execution.WebdriverAction;
import execution.WebdriverActionExecutor;
import utils.Utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * Created by hvrigazov on 15.03.17.
 */
public class ReplayBrowser {

    private WebdriverActionExecutor executor;
    private ApplicationConfiguration applicationConfiguration;
    private ApplicationActionFactory applicationActionFactory;

    public ReplayBrowser(WebdriverActionExecutor executor, ApplicationConfiguration applicationConfiguration,
                         ApplicationActionFactory applicationActionFactory) {
        this.executor = executor;
        this.applicationConfiguration = applicationConfiguration;
        this.applicationActionFactory = applicationActionFactory;
    }

    public void replay(String pathToSerializedTest) throws IOException, InterruptedException {
        List<Map<String, String>> testCaseSteps = Utils.readSteps(pathToSerializedTest);

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

        executor.execute();
        executor.quit();
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
