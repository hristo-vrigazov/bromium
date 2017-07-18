//package com.hribol.bromium.integration.tests.record;
//
//import com.hribol.bromium.cli.Main;
//import com.hribol.bromium.integration.tests.BaseDemoAppIntegrationTest;
//
///**
// * Created by hvrigazov on 18.07.17.
// */
//public class BaseRecordIntegrationTest extends BaseDemoAppIntegrationTest {
//    public BaseRecordIntegrationTest(String resourceConfigurationPath, String pathToTestCase, String screen) {
//        super(resourceConfigurationPath, pathToTestCase, screen);
//    }
//
//    @Override
//    public void runTest() {
//        /**
//         * record
//         -d
//         ./bromium-chrome/bromium-chrome-base/src/test/resources/chromedriver
//         -a
//         /home/hvrigazov/bromium-data/demo-app/configurations/demo.json
//         -u
//         http://localhost:3000
//         -o
//         bromium-core/src/test/resources/dynamic-testCase.json
//         */
//        String[] args = {
//                "record",
//                "-d", chromedriverFile.getAbsolutePath(),
//                "-a", configurationFile.getAbsolutePath(),
//                "-u", "http://localhost:" + demoApp.getPort() + "/",
//                "-o", testCaseFile.getAbsolutePath(),
//                "-s", screen
//        };
//
//        Main.main(args);
//        String output = getOutput();
//    }
//}
