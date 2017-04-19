package com.hribol.automation.suite;

import com.hribol.automation.execution.executor.AutomationResult;
import com.hribol.automation.execution.executor.WebDriverActionExecutor;
import com.hribol.automation.utils.ConfigurationUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

/**
 * Created by hvrigazov on 19.03.17.
 */
public class AutomationManager {

    private List<WebDriverActionExecutor> automationScenarios;
    private List<String> fileNames;
    private List<String> harFileNames;
    private VirtualScreenProcessCreator virtualScreenProcessCreator;

    public AutomationManager() {
        automationScenarios = new ArrayList<>();
        fileNames = new ArrayList<>();
        harFileNames = new ArrayList<>();
        virtualScreenProcessCreator = new VirtualScreenProcessCreator();
    }

    public void addTestScenario(WebDriverActionExecutor automationScenario, String fileNameToDumpMeasurements, String fileNameToDumpHar) {
        automationScenarios.add(automationScenario);
        fileNames.add(fileNameToDumpMeasurements);
        harFileNames.add(fileNameToDumpHar);
    }

    public List<AutomationResult> runSequentially() {
        List<AutomationResult> automationResults = new ArrayList<>();

        long startTime = System.nanoTime();

        for (int i = 0; i < automationScenarios.size(); i++) {
            automationResults.add(executeScenario(i));
        }

        System.out.println("Elapsed time in seconds: " + ConfigurationUtils.toSeconds(System.nanoTime() - startTime));
        return automationResults;
    }

    public List<AutomationResult> runInParallel() {
        ExecutorService executor = Executors.newFixedThreadPool(automationScenarios.size());

        List<Future<AutomationResult>> automationResultsFutures = new ArrayList<>();

        long startTime = System.nanoTime();

        for (int i = 0; i < automationScenarios.size(); i++) {
            final int index = i;
            automationResultsFutures.add(executor.submit(() -> executeScenario(index)));
        }

        List<AutomationResult> automationResults = automationResultsFutures
                .stream()
                .map(automationResultFuture -> {
                    try {
                        return automationResultFuture.get();
                    } catch (InterruptedException e) {
                        return AutomationResult.INTERRUPTED_ERROR;
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                        return AutomationResult.EXECUTION_ERROR;
                    }
                })
                .collect(Collectors.toList());

        System.out.println("Elapsed time in seconds: " + ConfigurationUtils.toSeconds(System.nanoTime() - startTime));
        return automationResults;
    }

    private AutomationResult executeScenario(int i) {
        return automationScenarios.get(i).executeOnScreen(i, virtualScreenProcessCreator, fileNames.get(i), harFileNames.get(i));
    }
}
