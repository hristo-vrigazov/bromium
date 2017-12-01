package com.hribol.bromium.demo.app;

import java.io.File;

/**
 * Entrypoint to the demo app as a standalone application
 */
public class App {

    public static void main(String[] args) throws Exception {
        File tempDir = new File("/tmp/debug");
        DemoApp demoApp = new DemoApp(tempDir);
        demoApp.runOnSeparateThread();
    }

}
