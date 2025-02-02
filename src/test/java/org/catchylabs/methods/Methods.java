package org.catchylabs.methods;

import org.catchylabs.driver.BaseTest;
import com.thoughtworks.gauge.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertTrue;

public class Methods extends BaseTest {

    // Launch the browser and perform setup
    public void launchBrowser(String browser) {
        try {
            setup(browser);
            Logger.info("Browser launched successfully: " + browser);
        } catch (Exception e) {
            Logger.error("Error launching browser: " + e.getMessage());
            throw e;
        }
    }

    // Close the browser and perform teardown
    public void closeBrowser() {
        try {
            teardown();
            Logger.info("Browser closed successfully.");
        } catch (Exception e) {
            Logger.error("Error closing browser: " + e.getMessage());
            throw e;
        }
    }

    // Wait for a specific period before performing the next action (1 second)
    public void waitBeforeAction() {
        try {
            Thread.sleep(1000); // Wait for 1 second
            Logger.info("Waited for 1 second before the action.");
        } catch (InterruptedException e) {
            Logger.error("Error during wait: " + e.getMessage());
            Thread.currentThread().interrupt(); // Interrupt call to correct the thread's state
        }
    }

    // Wait for a specific period before uploading (3 seconds)
    public void waitBeforeUpload() {
        try {
            Thread.sleep(3000); // Wait for 3 seconds
            Logger.info("Waited for 3 seconds before the upload.");
        } catch (InterruptedException e) {
            Logger.error("Error during wait: " + e.getMessage());
            Thread.currentThread().interrupt(); // Interrupt call to correct the thread's state
        }
    }

    // Verify if the page title contains the expected text
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

    // Combined method: Click an element and verify if another element is displayed
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

    // Combined method: Send text to an element and verify the entered text
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

    // Select an option by its visible text
    public void selectOptionByText(By locator, String optionText) {
        try {
            waitBeforeAction(); // Wait
            WebElement selectElement = findElement(locator); // Find the select element
            Select select = new Select(selectElement); // Start working with the Select class
            select.selectByVisibleText(optionText); // Select by visible text
            Logger.info("Option with text '" + optionText + "' selected for element: " + locator);
        } catch (Exception e) {
            Logger.error("Error selecting option by text for element " + locator + ": " + e.getMessage());
            throw e;
        }
    }

    // Select option by index from the select element
    public void selectOptionByIndex(By locator, int index) {
        try {
            waitBeforeAction(); // Wait
            WebElement selectElement = findElement(locator); // Find the select element
            Select select = new Select(selectElement); // Start working with the Select class
            select.selectByIndex(index); // Select by index
            Logger.info("Option with index '" + index + "' selected for element: " + locator);
        } catch (Exception e) {
            Logger.error("Error selecting option by index for element " + locator + ": " + e.getMessage());
            throw e;
        }
    }

    // Select option by value from the select element
    public void selectOptionByValue(By locator, String value) {
        try {
            waitBeforeAction(); // Wait
            WebElement selectElement = findElement(locator); // Find the select element
            Select select = new Select(selectElement); // Start working with the Select class
            select.selectByValue(value); // Select by value
            Logger.info("Option with value '" + value + "' selected for element: " + locator);
        } catch (Exception e) {
            Logger.error("Error selecting option by value for element " + locator + ": " + e.getMessage());
            throw e;
        }
    }
}
