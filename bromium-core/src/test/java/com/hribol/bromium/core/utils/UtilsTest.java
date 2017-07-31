package com.hribol.bromium.core.utils;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by hvrigazov on 23.04.17.
 */
public class UtilsTest {

    @Test
    public void correctlyConvertsNanoSecondsToSeconds() {
        double expected = 0.123456789;
        long nanoseconds = 123456789;

        double actual = Utils.toSeconds(nanoseconds);
        assertEquals(expected, actual);
    }
}
