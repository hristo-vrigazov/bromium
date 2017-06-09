package com.hribol.bromium.cli;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.hribol.bromium.cli.commands.VersionCommand;
import com.hribol.bromium.cli.handlers.*;
import org.apache.commons.io.IOUtils;
import org.docopt.Docopt;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Created by hvrigazov on 14.03.17.
 */
public class Main {

    static class Commands {
        static final String INIT = "init";
        static final String RECORD = "record";
        static final String REPLAY = "replay";
        static final String UPDATE = "update";
        static final String VERSION = "version";
    }

    private static Injector injector;

    public static void main(String[] args) {
        try {
            injector = Guice.createInjector(new RecordingInjectionModule());
            InputStream inputStream = Main.class.getResourceAsStream("/cli-specification.txt");
            String doc = IOUtils.toString(inputStream);
            Docopt docopt = new Docopt(doc);
            Map<String, Object> opts = docopt.withVersion("bromium 0.1").parse(args);

            System.out.println(opts);

            Map<String, CommandHandler> commandToHandler = getCommands();
            Optional<String> optionalSelectedCommand = commandToHandler
                    .keySet()
                    .stream()
                    .filter(command -> opts.get(command).equals(true))
                    .findAny();

            optionalSelectedCommand.ifPresent(command -> {
                try {
                    commandToHandler.get(command).handle(opts);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static Map<String, CommandHandler> getCommands() {
        Map<String, CommandHandler> map = new HashMap<>();
        map.put(Commands.INIT, injector.getInstance(InitCommandHandler.class));
        map.put(Commands.RECORD, injector.getInstance(RecordCommandHandler.class));
        map.put(Commands.REPLAY, injector.getInstance(ReplayCommandHandler.class));
        map.put(Commands.UPDATE, injector.getInstance(UpdateCommandHandler.class));
        map.put(Commands.VERSION, injector.getInstance(VersionCommandHandler.class));
        return map;
    }
}
