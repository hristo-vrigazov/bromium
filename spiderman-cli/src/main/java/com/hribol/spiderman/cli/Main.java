package com.hribol.spiderman.cli;

import com.google.common.io.Files;
import com.hribol.spiderman.cli.commands.*;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.IOUtils;
import org.docopt.Docopt;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.util.Map;

/**
 * Created by hvrigazov on 14.03.17.
 */
public class Main {

    public static void main(String[] args) {
        try {
            InputStream inputStream = Main.class.getResourceAsStream("/cli-specification.txt");
            String doc = IOUtils.toString(inputStream);
            Map<String, Object> opts = new Docopt(doc).withVersion("Naval Fate 2.0").parse(args);
            System.out.println(opts);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.exit(0);
    }
}
