package com.hribol.bromium.integration.tests;

import com.google.common.collect.ImmutableMap;
import com.hribol.bromium.core.TestScenarioSteps;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

import static com.hribol.bromium.core.utils.Constants.EVENT;

/**
 * Created by hvrigazov on 29.07.17.
 */
public class TestUtils {

    public static class Events {
        public static final String PAGE_LOAD_INDEX = "loadIndexPage";
        public static final String PAGE_LOAD_AJAX = "loadAjaxPage";
        public static final String PAGE_LOAD = "loadPage";
        public static final String CLICK_LINK_TO_AJAX_DEMO_PAGE = "clickLinkToAjaxDemoPage";
        public static final String CLICK_DYNAMIC_BUTTON = "clickDynamicButton";
        public static final String TYPE_TEXT_IN_NAME_INPUT = "typeTextInNameInput";
        public static final String CLICK_AJAX_DEMO_BUTTON = "clickAjaxDemoButton";
        public static final String CLICK_DESTROY_AJAX_CREATED_BUTTON = "clickDestroyAjaxCreatedButton";
        public static final String CLICK_ON_LISTED_ITEM = "clickOnListedItem";

    }

    public static class Pages {
        public static final String DYNAMIC_DEMO_PAGE = "dynamic.html";
        public static final String TYPE_TEXT_DEMO_PAGE = "text-field.html";
        public static final String CLICK_CLASS_BY_TEXT_DEMO_PAGE = "click-class-by-text.html";

    }

    public static class Resources {
        public static final String DEMO_CONFIGURATION = "integration-tests/demo.json";
        public static final String DYNAMIC_TEST_CASE = "integration-tests/dynamic.json";
        public static final String AJAX_TEST_CASE = "integration-tests/ajax.json";
        public static final String RACE_HTTP_TEST_CASE = "integration-tests/race-http.json";
        public static final String TYPE_TEXT_TEST_CASE = "integration-tests/text-field.json";
        public static final String ELEMENT_PRESENCE_TEST_CASE = "integration-tests/presence.json";
        public static final String TEXT_TO_BE_TEST_CASE = "integration-tests/text-to-be.json";
        public static final String CLICK_CLASS_BY_TEXT_TEST_CASE = "integration-tests/click-class-by-text.txt";

    }

    public static final String SCREEN_SYSTEM_PROPERTY = "screenNumber";
    public static final String CHROMEDRIVER = "chromedriver";


    public static final String AJAX_DEMO_ID = "ajax-demo";
    public static final String AJAX_DEMO_LINK = "ajax-demo-link";
    public static final String CREATE_DYNAMIC_ID = "create-dynamic";
    public static final String LATE_CREATION_ID = "late-creation";
    public static final String TEXT_FIELD_ID = "name-input";
    public static final String DONE_ID = "done";
    public static final String SUBPAGE = "subpage";
    public static final String USERNAME = "username";
    public static final String ITEM_NAME = "itemName";
    public static final String TARGET = "Target";


    public static String generateRandomJsonFilename() {
        return UUID.randomUUID().toString() +".json";
    }

    public static TestScenarioSteps exampleTestScenarioSteps() {
        TestScenarioSteps steps = new TestScenarioSteps();
        steps.add(ImmutableMap.of(
                EVENT, Events.PAGE_LOAD_AJAX));

        steps.add(ImmutableMap.of(
                EVENT, Events.CLICK_AJAX_DEMO_BUTTON));

        steps.add(ImmutableMap.of(
                EVENT, Events.CLICK_DESTROY_AJAX_CREATED_BUTTON));

        return steps;
    }

    public static File extractResource(String resource, File testResourcesDirectory) throws IOException {
        return extractResource(resource, "", testResourcesDirectory);
    }

    public static File extractResource(String resource, String suffix, File testResourcesDirectory) throws IOException {
        File tempFile = File.createTempFile(resource, suffix, testResourcesDirectory);
        InputStream resourceAsStream = TestUtils.class.getResourceAsStream("/" + resource);
        OutputStream fileOutputStream = new FileOutputStream(tempFile);
        IOUtils.copy(resourceAsStream, fileOutputStream);
        resourceAsStream.close();
        fileOutputStream.close();
        return tempFile;
    }
}
