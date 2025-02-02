package org.catchylabs.driver;

import org.openqa.selenium.WebDriver;
import com.thoughtworks.gauge.Logger;

public class BaseTest {
    protected WebDriver driver;

    // Setup the WebDriver for the given browser
    public void setup(String browser) {
        try {
            driver = DriverFactory.getDriver(browser); // Get the driver instance for the specified browser
        } catch (Exception e) {
            Logger.error("Error during setup for browser: " + browser, e); // Log the error during setup
            throw new RuntimeException("Setup failed: " + e.getMessage(), e); // Throw a runtime exception if setup fails
        }
    }

    // Teardown the WebDriver
    public void teardown() {
        try {
            DriverFactory.closeDriver(); // Close the WebDriver and clean up resources
        } catch (Exception e) {
            Logger.error("Error during teardown", e); // Log the error during teardown
        }
    }
}