package com.hribol.bromium.cli;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.hribol.bromium.cli.commands.Command;
import com.hribol.bromium.cli.commands.InitCommand;
import com.hribol.bromium.cli.commands.RecordCommand;
import com.hribol.bromium.cli.commands.ReplayCommandRewrite;
import com.hribol.bromium.cli.handlers.*;
import org.apache.commons.io.IOUtils;
import org.docopt.Docopt;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import static com.hribol.bromium.cli.Main.Commands.INIT;
import static com.hribol.bromium.cli.Main.Commands.RECORD;
import static com.hribol.bromium.cli.Main.Commands.REPLAY;

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
            InputStream inputStream = Main.class.getResourceAsStream("/cli-specification.txt");
            String doc = IOUtils.toString(inputStream);
            Docopt docopt = new Docopt(doc);
            Map<String, Object> opts = docopt.withVersion("bromium 0.1").parse(args);

            System.out.println(opts);
            injector = Guice.createInjector(new DefaultModule(opts));

            Map<String, Command> commandToHandler = getCommands();
            Optional<String> optionalSelectedCommand = commandToHandler
                    .keySet()
                    .stream()
                    .filter(command -> opts.get(command).equals(true))
                    .findAny();

            optionalSelectedCommand.ifPresent(command -> commandToHandler.get(command).run());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static Map<String, Command> getCommands() {
        Map<String, Command> map = new HashMap<>();
        map.put(INIT, injector.getInstance(InitCommand.class));
        map.put(RECORD, injector.getInstance(RecordCommand.class));
        map.put(REPLAY, injector.getInstance(ReplayCommandRewrite.class));
        return map;
    }

    private static Map<String, CommandHandler> getCommandHandlers() {
        Map<String, CommandHandler> map = new HashMap<>();
        map.put(INIT, injector.getInstance(InitCommandHandler.class));
        map.put(RECORD, injector.getInstance(RecordCommandHandler.class));
        map.put(Commands.UPDATE, injector.getInstance(UpdateCommandHandler.class));
        map.put(Commands.VERSION, injector.getInstance(VersionCommandHandler.class));
        return map;
    }
}
