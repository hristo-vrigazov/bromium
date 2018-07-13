package com.hribol.bromium.integration.tests.record;

import org.openqa.selenium.By;

import static com.hribol.bromium.integration.tests.TestUtils.CLICK_NAME_TEST;
import static com.hribol.bromium.integration.tests.TestUtils.Events.CLICK_CLICK_NAME_TEST;
import static com.hribol.bromium.integration.tests.TestUtils.Pages.CLICK_NAME_DEMO_PAGE;

public class RecordClickNameIT extends BaseRecordClickIT {

    public RecordClickNameIT() {
        super(CLICK_NAME_DEMO_PAGE, CLICK_CLICK_NAME_TEST, By.name(CLICK_NAME_TEST));
    }

}
