package com.hribol.bromium.cli;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.hribol.bromium.cli.commands.*;
import org.apache.commons.io.IOUtils;
import org.docopt.Docopt;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

import static com.hribol.bromium.cli.Main.Commands.*;

/**
 * Created by hvrigazov on 14.03.17.
 */
public class Main {

    public static class Commands {
        static final String INIT = "init";
        static final String RECORD = "record";
        static final String REPLAY = "replay";
        static final String UPDATE = "update";
        static final String VERSION = "version";
    }

    private static Injector injector;

    public static void main(String[] args) {
        try {
            InputStream inputStream = Main.class.getResourceAsStream("/cli-specification.txt");
            String doc = IOUtils.toString(inputStream);
            Docopt docopt = new Docopt(doc);
            Map<String, Object> opts = docopt.withVersion("bromium 0.1").parse(args);

            System.out.println(opts);
            injector = Guice.createInjector(new DefaultModule(opts));

            Map<String, Supplier<Command>> commandToHandler = getCommands();
            Optional<String> optionalSelectedCommand = commandToHandler
                    .keySet()
                    .stream()
                    .filter(command -> opts.get(command).equals(true))
                    .findAny();

            optionalSelectedCommand.ifPresent(command -> commandToHandler.get(command).get().run());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static Map<String, Supplier<Command>> getCommands() {
        Map<String, Supplier<Command>> map = new HashMap<>();
        map.put(INIT, () -> injector.getInstance(InitCommand.class));
        map.put(RECORD, () -> injector.getInstance(RecordCommand.class));
        map.put(REPLAY, () -> injector.getInstance(ReplayCommand.class));
        map.put(UPDATE, () -> injector.getInstance(UpdateCommand.class));
        map.put(VERSION, () -> injector.getInstance(VersionCommand.class));
        return map;
    }

}
