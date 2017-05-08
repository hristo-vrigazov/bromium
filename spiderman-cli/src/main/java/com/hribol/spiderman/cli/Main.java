package com.hribol.spiderman.cli;

import com.hribol.spiderman.cli.commands.Command;
import com.hribol.spiderman.cli.commands.InitCommand;
import com.hribol.spiderman.cli.commands.PromptUtils;
import com.hribol.spiderman.cli.commands.RecordCommand;
import org.apache.commons.io.IOUtils;
import org.docopt.Docopt;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/**
 * Created by hvrigazov on 14.03.17.
 */
public class Main {

    public static final String INIT = "init";
    public static final String RECORD = "record";

    public static void main(String[] args) {
        try {
            InputStream inputStream = Main.class.getResourceAsStream("/cli-specification.txt");
            String doc = IOUtils.toString(inputStream);
            Docopt docopt = new Docopt(doc);
            Map<String, Object> opts = docopt.withVersion("Spiderman 0.1").parse(args);

            System.out.println(opts);

            PromptUtils promptUtils = new PromptUtils();

            if (opts.get(INIT).equals(true)) {
                Command command = new InitCommand(promptUtils);
                command.run();
            }

            if (opts.get(RECORD).equals(true)) {
                String pathToDriver = (String) opts.get("--driver");
                String pathToJsInjectionFile = (String) opts.get("--js");
                String baseUrl = (String) opts.get("--url");
                String outputFile = (String) opts.get("--output");
                String browserType = (String) opts.get("--browser");
                int timeout = Integer.valueOf((String) opts.get("--timeout"));
                Command command = new RecordCommand(pathToDriver, pathToJsInjectionFile, baseUrl, outputFile, browserType, promptUtils, timeout);
                command.run();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.exit(0);
    }
}
