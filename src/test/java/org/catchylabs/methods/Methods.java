package org.catchylabs.methods;

import org.catchylabs.driver.BaseTest;
import com.thoughtworks.gauge.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertTrue;

public class Methods extends BaseTest {


    public void launchBrowser(String browser) {
        try {
            setup(browser);
            Logger.info("Browser launched successfully: " + browser);
        } catch (Exception e) {
            Logger.error("Error launching browser: " + e.getMessage());
            throw e;
        }
    }

    public void closeBrowser() {
        try {
            teardown();
            Logger.info("Browser closed successfully.");
        } catch (Exception e) {
            Logger.error("Error closing browser: " + e.getMessage());
            throw e;
        }
    }

    public void waitBeforeAction() {
        try {
            Thread.sleep(1000); // 1 saniye bekleme
            Logger.info("Waited for 1 second before the action.");
        } catch (InterruptedException e) {
            Logger.error("Error during wait: " + e.getMessage());
            Thread.currentThread().interrupt(); // Thread'in durumunu düzeltmek için interrupt çağrılır
        }
    }

    public void waitBeforeUpload() {
        try {
            Thread.sleep(3000); // 1 saniye bekleme
            Logger.info("Waited for 1 second before the action.");
        } catch (InterruptedException e) {
            Logger.error("Error during wait: " + e.getMessage());
            Thread.currentThread().interrupt(); // Thread'in durumunu düzeltmek için interrupt çağrılır
        }
    }

    public void verifyTitle(String title) {
        try {
            String pageTitle = driver.getTitle();
            assertTrue("Title does not contain expected text", pageTitle.contains(title));
            Logger.info("Page title verified successfully. Title: " + pageTitle);
        } catch (Exception e) {
            Logger.error("Error verifying title: " + e.getMessage());
            throw e;
        }
    }

    // Method to find an element by locator and wait for its visibility
    public WebElement findElement(By locator) {
        try {
            WebElement element = driver.findElement(locator);
            Logger.info("Element found: " + locator);
            return element;
        } catch (Exception e) {
            Logger.error("Error finding element with locator " + locator + ": " + e.getMessage());
            throw e;
        }
    }

    // Method to click an element and wait for its visibility
    public void clickElement(By locator) {
        try {
            WebElement element = findElement(locator);
            element.click();
            Logger.info("Element clicked: " + locator);
        } catch (Exception e) {
            Logger.error("Error clicking element with locator " + locator + ": " + e.getMessage());
            throw e;
        }
    }

    // Method to send text to an input field and wait for its visibility
    public void sendText(By locator, String text) {
        try {
            WebElement element = findElement(locator);
            element.clear();
            element.sendKeys(text);
            Logger.info("Text '" + text + "' sent to element: " + locator);
        } catch (Exception e) {
            Logger.error("Error sending text to element with locator " + locator + ": " + e.getMessage());
            throw e;
        }
    }

    // Method to verify if an element is displayed and wait for its visibility
    public void verifyElementDisplayed(By locator) {
        try {
            WebElement element = findElement(locator);
            assertTrue("Element not displayed: " + locator, element.isDisplayed());
            Logger.info("Element is displayed: " + locator);
        } catch (Exception e) {
            Logger.error("Error verifying element display with locator " + locator + ": " + e.getMessage());
            throw e;
        }
    }

    // Combined method: Click and verify element, with visibility checks
    public void clickAndVerifyElement(By clickLocator, By verifyLocator) {
        try {
            clickElement(clickLocator);
            verifyElementDisplayed(verifyLocator);
            Logger.info("Clicked element " + clickLocator + " and verified element " + verifyLocator + " is displayed.");
        } catch (Exception e) {
            Logger.error("Error in click-and-verify operation: " + e.getMessage());
            throw e;
        }
    }

    // Combined method: Send text and verify, with visibility checks
    public void sendTextAndVerify(By locator, String text) {
        try {
            sendText(locator, text);
            String enteredText = findElement(locator).getAttribute("value");
            assertTrue("Entered text does not match expected value", enteredText.equals(text));
            Logger.info("Text '" + text + "' successfully sent and verified for element: " + locator);
        } catch (Exception e) {
            Logger.error("Error in send-text-and-verify operation: " + e.getMessage());
            throw e;
        }
    }

    public void selectOptionByText(By locator, String optionText) {
        try {
            waitBeforeAction(); // Bekleme
            WebElement selectElement = findElement(locator); // Select elementini buluyoruz
            Select select = new Select(selectElement); // Select sınıfı ile işleme başlıyoruz
            select.selectByVisibleText(optionText); // Görünür metne göre seçimi yapıyoruz
            Logger.info("Option with text '" + optionText + "' selected for element: " + locator);
        } catch (Exception e) {
            Logger.error("Error selecting option by text for element " + locator + ": " + e.getMessage());
            throw e;
        }
    }

    // Select element içindeki option'u index ile seçme
    public void selectOptionByIndex(By locator, int index) {
        try {
            waitBeforeAction(); // Bekleme
            WebElement selectElement = findElement(locator); // Select elementini buluyoruz
            Select select = new Select(selectElement); // Select sınıfı ile işleme başlıyoruz
            select.selectByIndex(index); // Index'e göre seçimi yapıyoruz
            Logger.info("Option with index '" + index + "' selected for element: " + locator);
        } catch (Exception e) {
            Logger.error("Error selecting option by index for element " + locator + ": " + e.getMessage());
            throw e;
        }
    }

    // Select element içindeki option'u value ile seçme
    public void selectOptionByValue(By locator, String value) {
        try {
            waitBeforeAction(); // Bekleme
            WebElement selectElement = findElement(locator); // Select elementini buluyoruz
            Select select = new Select(selectElement); // Select sınıfı ile işleme başlıyoruz
            select.selectByValue(value); // Value'ya göre seçimi yapıyoruz
            Logger.info("Option with value '" + value + "' selected for element: " + locator);
        } catch (Exception e) {
            Logger.error("Error selecting option by value for element " + locator + ": " + e.getMessage());
            throw e;
        }
    }
}



