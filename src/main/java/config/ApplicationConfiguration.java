package config;

/**
 * Created by hvrigazov on 15.03.17.
 */
public class ApplicationConfiguration {
    private String applicationName;
    private String version;

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
