package com.hribol.spiderman.cli.handlers;

import java.io.FileNotFoundException;
import java.util.Map;

/**
 * Created by hvrigazov on 09.05.17.
 */
public interface CommandHandler {
    void handle(Map<String, Object> opts) throws FileNotFoundException;
}
