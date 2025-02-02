package org.catchylabs.steps;

import com.thoughtworks.gauge.Step;
import org.catchylabs.methods.Methods;
import org.openqa.selenium.By;

public class Steps {

    private Methods methods = new Methods();

    @Step("Launch the browser <browser>")
    public void launchBrowser(String browser) {
        methods.launchBrowser(browser); // Launch the browser with the specified name (browser)
    }

    @Step("Verify the page title contains <title>")
    public void verifyTitle(String title) {
        methods.verifyTitle(title); // Verify that the page title contains the given 'title' string
    }

    @Step("Close the browser")
    public void closeBrowser() {
        methods.closeBrowser(); // Close the browser instance after the test completes
    }

    @Step("Wait for 1 second before performing action")
    public void waitBeforeActionStep() {
        methods.waitBeforeAction(); // Call the waitBeforeAction method from the Methods class to pause execution for 1 second
    }

    @Step("Wait for 3 second before upload page")
    public void waitBeforeUploadStep() {
        methods.waitBeforeUpload(); // Call the waitBeforeAction method from the Methods class to pause execution for 1 second
    }

    @Step("Send text to the element with locator <locator>, text: <text>")
    public void sendText(String locator, String text) {
        methods.sendText(By.xpath(locator), text); // Send the 'text' value to the input element located by the provided XPath 'locator'
    }

    @Step("Click the element with locator <locator>")
    public void clickElement(String locator) {
        methods.clickElement(By.xpath(locator)); // Verify that the element is displayed based on the XPath 'locator'
    }

    @Step("Verify the element with locator <locator> is displayed")
    public void verifyElementDisplayedStep(String locator) {
        methods.verifyElementDisplayed(By.xpath(locator)); // Verify that the element is displayed based on the XPath 'locator'
    }

    @Step("Click the element with locator <clickLocator> and verify element with locator <verifyLocator> is displayed")
    public void clickAndVerifyElement(String clickLocator, String verifyLocator) {
        methods.clickAndVerifyElement(By.xpath(clickLocator), By.xpath(verifyLocator)); // Click the element located by 'clickLocator' and verify that the element with 'verifyLocator' appears
    }

    @Step("Select option by text <optionText> from dropdown with locator <locator> and wait before action")
    public void selectOptionByText(String locator, String optionText) {
        methods.selectOptionByText(By.xpath(locator), optionText); // Select the option by text from the dropdown located by 'locator'
    }

    @Step("Select option by index <index> from dropdown with locator <locator> and wait before action")
    public void selectOptionByIndex(String locator, int index) {
        methods.selectOptionByIndex(By.xpath(locator), index); // Select the option by index from the dropdown located by 'locator'
    }

    @Step("Select option by value <value> from dropdown with locator <locator> and wait before action")
    public void selectOptionByValue(String locator, String value) {
        methods.selectOptionByValue(By.xpath(locator), value); // Select the option by value from the dropdown located by 'locator'
    }

}
