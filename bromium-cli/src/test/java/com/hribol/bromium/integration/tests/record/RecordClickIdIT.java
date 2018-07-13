package com.hribol.bromium.integration.tests.record;

import org.openqa.selenium.By;

import static com.hribol.bromium.integration.tests.TestUtils.CLICK_ID_TEST;
import static com.hribol.bromium.integration.tests.TestUtils.Events.CLICK_CLICK_ID_TEST;
import static com.hribol.bromium.integration.tests.TestUtils.Pages.CLICK_ID_DEMO_PAGE;

public class RecordClickIdIT extends BaseRecordClickIT {

    public RecordClickIdIT() {
        super(CLICK_ID_DEMO_PAGE, CLICK_CLICK_ID_TEST, By.id(CLICK_ID_TEST));
    }
}
