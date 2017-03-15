package replay;

import com.google.common.base.Charsets;
import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import config.ApplicationConfiguration;
import execution.ApplicationAction;
import execution.ApplicationActionFactory;
import execution.WebdriverAction;
import execution.WebdriverActionExecutor;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created by hvrigazov on 15.03.17.
 */
public class ReplayBrowser {

    private WebdriverActionExecutor executor;
    private ApplicationConfiguration applicationConfiguration;
    private ApplicationActionFactory applicationActionFactory;
    private Gson gson;


    public ReplayBrowser(WebdriverActionExecutor executor, ApplicationConfiguration applicationConfiguration,
                         ApplicationActionFactory applicationActionFactory) {
        this.executor = executor;
        this.applicationConfiguration = applicationConfiguration;
        this.applicationActionFactory = applicationActionFactory;
        this.gson = new GsonBuilder().create();
    }

    public void replay(String pathToSerializedTest) throws IOException {
        List<Map<String, String>> testCaseSteps = readSteps(pathToSerializedTest);

        WebdriverAction initialPageLoading = applicationActionFactory.getInitialPageLoading().getWebdriverAction();
        executor.addWebdriverAction(initialPageLoading);

        for (Map<String, String> testCaseStep: testCaseSteps) {
            ApplicationAction domainSpecificAction =
                    applicationActionFactory.create(applicationConfiguration, testCaseStep);
            executor.addWebdriverAction(domainSpecificAction.getPrecondition());
            executor.addWebdriverAction(domainSpecificAction.getWebdriverAction());
            executor.addWebdriverAction(domainSpecificAction.getPostcondition());
        }

        executor.execute();
        executor.quit();
    }

    private List<Map<String, String>> readSteps(String pathToSerializedTest) throws IOException {
        String testCase = Files.toString(new File(pathToSerializedTest), Charsets.UTF_8);
        return gson.fromJson(testCase, List.class);
    }

}
