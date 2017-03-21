package suite;

import execution.executor.AutomationResult;
import execution.executor.WebDriverActionExecutor;
import utils.Utils;

import java.io.IOException;
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

    public AutomationManager() {
        automationScenarios = new ArrayList<>();
        fileNames = new ArrayList<>();
        harFileNames = new ArrayList<>();
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

        System.out.println("Elapsed time in seconds: " + Utils.toSeconds(System.nanoTime() - startTime));
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

        System.out.println("Elapsed time in seconds: " + Utils.toSeconds(System.nanoTime() - startTime));
        return automationResults;
    }

    private Process createXvfbProcess(int i) throws IOException {
        // 0 is the main screen
        String screen = getScreen(i);

        String[] command = {
                "Xvfb", screen, "-screen", "0", "1360x1024x24 &"
        };

        Process process = new ProcessBuilder(command).start();
        return process;
    }

    private String getScreen(int i) {
        return ":" + (i + 1);
    }

    private AutomationResult executeScenario(int i) {
        Process process;
        String screen = getScreen(i);
        try {
            process = createXvfbProcess(i);
        } catch (IOException e) {
            return AutomationResult.NO_VIRTUAL_SCREEN;
        }

        try {
            WebDriverActionExecutor executor = automationScenarios.get(i);
            executor.executeOnScreen(screen);
            executor.quit();
            executor.getLoadingTimes().dump(fileNames.get(i));
            executor.dumpHarMetrics(harFileNames.get(i));
            process.destroy();
            return executor.getAutomationResult();
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
            process.destroy();
            return AutomationResult.FAILED;
        }

    }
}
