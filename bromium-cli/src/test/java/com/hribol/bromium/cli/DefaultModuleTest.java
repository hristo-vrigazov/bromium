package com.hribol.bromium.cli;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.hribol.bromium.cli.commands.InitCommand;
import com.hribol.bromium.cli.commands.RecordCommand;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static com.hribol.bromium.cli.ParsedOptions.*;
import static org.openqa.selenium.remote.BrowserType.CHROME;

/**
 * Created by hvrigazov on 09.07.17.
 */
public class DefaultModuleTest {

    @Test
    public void canCreateInitCommand() {
        Map<String, Object> opts = new HashMap<>();

        Injector injector = Guice.createInjector(new DefaultModule(opts));

        injector.getInstance(InitCommand.class);
    }

    @Test
    public void canCreateRecordCommand() {
        Map<String, Object> opts = new HashMap<>();
        opts.put(DRIVER, "chromedriver");
        opts.put(APPLICATION, "/home/hvrigazov/bromium-data/demo-app/configurations/demo.json");
        opts.put(URL, "http://localhost:3000");
        opts.put(OUTPUT, "bromium-core/src/test/resources/dynamic-testCase.json");
        opts.put(BROWSER, CHROME);
        opts.put(TIMEOUT, "5");

        Injector injector = Guice.createInjector(new DefaultModule(opts));

        injector.getInstance(RecordCommand.class);
    }
}
