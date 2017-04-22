package com.hribol.automation.record.settings;

/**
 * Created by hvrigazov on 22.04.17.
 */
public interface RecordSettings {
    void cleanUpRecord();
    void prepareRecord(int timeout);
    void openBaseUrl();
}
