package org.catchylabs.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import java.nio.file.Paths;
import com.thoughtworks.gauge.Logger;

public class DriverFactory {
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    private static final String BASE_URL = "https://catchylabs-webclient.testinium.com/";

    // Start the browser and open the base URL
    public static WebDriver getDriver(String browser) {
        if (driver.get() == null) {
            try {
                if ("chrome".equalsIgnoreCase(browser)) {
                    System.setProperty("webdriver.chrome.driver", Paths.get("drivers/chromedriver.exe").toAbsolutePath().toString());
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--start-maximized");
                    options.addArguments("--disable-notifications");
                    options.addArguments("--disable-popup-blocking");
                    options.addArguments("--incognito");
                    options.setExperimentalOption("prefs", getDefaultChromePreferences());
                    driver.set(new ChromeDriver(options));
                } else if ("firefox".equalsIgnoreCase(browser)) {
                    System.setProperty("webdriver.gecko.driver", Paths.get("drivers/geckodriver.exe").toAbsolutePath().toString());
                    FirefoxOptions options = new FirefoxOptions();
                    options.addArguments("-private");
                    options.addPreference("dom.webnotifications.enabled", false);
                    options.addPreference("network.cookie.cookieBehavior", 0);
                    driver.set(new FirefoxDriver(options));
                } else {
                    throw new IllegalArgumentException("Unsupported browser: " + browser);
                }

                // After starting the browser, maximize the window and clear cookies
                driver.get().manage().window().maximize();  // Set the browser window size
                driver.get().manage().deleteAllCookies(); // Clear cookies (clean start)

            } catch (Exception e) {
                Logger.error("Error while initializing the WebDriver for browser: " + browser, e);
                throw new RuntimeException("Failed to initialize the WebDriver: " + e.getMessage(), e);
            }
        }

        // Open the base URL
        driver.get().get(BASE_URL);
        return driver.get();
    }

    // Close the WebDriver
    public static void closeDriver() {
        try {
            if (driver.get() != null) {
                driver.get().quit();
                driver.remove();
            }
        } catch (Exception e) {
            Logger.error("Error while closing the WebDriver", e);
        }
    }

    // Default Chrome preferences
    private static java.util.Map<String, Object> getDefaultChromePreferences() {
        java.util.Map<String, Object> prefs = new java.util.HashMap<>();
        prefs.put("profile.default_content_setting_values.notifications", 2); // Block notifications
        prefs.put("profile.default_content_setting_values.cookies", 1); // Allow cookies
        return prefs;
    }
}
