package com.hribol.spiderman.replay.execution;

import java.util.concurrent.ExecutionException;

/**
 * Created by hvrigazov on 20.05.17.
 */
public class WebDriverActionExecutionException extends ExecutionException {

    public WebDriverActionExecutionException(String message, Throwable cause) {
        super(message, cause);
    }

}
