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
    public static final String DRIVER = "--driver";
    public static final String JS = "--js";
    public static final String URL = "--url";
    public static final String BROWSER = "--browser";
    public static final String OUTPUT = "--output";
    public static final String TIMEOUT = "--timeout";

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
                String pathToDriver = getPathToDriver(opts);
                String pathToJsInjectionFile = getPathToJS(opts);
                String baseUrl = getBaseUrl(opts);
                String outputFile = getOutputFile(opts);
                String browserType = getBrowserType(opts);
                int timeout = getTimeout(opts);
                Command command = new RecordCommand(pathToDriver, pathToJsInjectionFile, baseUrl, outputFile, browserType, promptUtils, timeout);
                command.run();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.exit(0);
    }

    private static String getPathToDriver(Map<String, Object> opts) {
        return getString(opts, DRIVER);
    }

    private static String getPathToJS(Map<String, Object> opts) {
        return getString(opts, JS);
    }

    private static String getBaseUrl(Map<String, Object> opts) {
        return getString(opts, URL);
    }

    private static String getBrowserType(Map<String, Object> opts) {
        return getString(opts, BROWSER);
    }

    private static String getOutputFile(Map<String, Object> opts) {
        return getString(opts, OUTPUT);
    }

    private static Integer getTimeout(Map<String, Object> opts) {
        return getInt(opts, TIMEOUT);
    }

    private static Integer getInt(Map<String, Object> opts, String key) {
        return Integer.valueOf(getString(opts, key));
    }

    private static String getString(Map<String, Object> opts, String key) {
        return (String) opts.get(key);
    }
}
