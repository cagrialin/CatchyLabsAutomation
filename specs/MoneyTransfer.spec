# Money Transfer
* Launch the browser "chrome"

## Scenario: Launch Browser and Verify Login Page Title
* Verify the page title contains "login"
*  Wait for 3 second before upload page

## Scenario: Fill in Login Form and Submit
* Click the element with locator "//input[@placeholder='Username']" and verify element with locator "//input[@placeholder='Username']" is displayed
* Send text to the element with locator "//input[@placeholder='Username']", text: "omercagri.alin"
* Click the element with locator "//input[@placeholder='Password']" and verify element with locator "//input[@placeholder='Password']" is displayed
* Send text to the element with locator "//input[@placeholder='Password']", text: "Catchy123"
* Wait for 1 second before performing action
* Click the element with locator "//div[@class='css-146c3p1 r-jwli3a r-1b43r93']" and verify element with locator "//div[@class='css-146c3p1 r-jwli3a r-1b43r93']" is displayed
* Wait for 3 second before upload page

## Scenario: Verify Navigation After Successful Login
* Click the element with locator "//div[@class='css-146c3p1 r-jwli3a r-1b43r93']" and verify element with locator "//div[@class='css-146c3p1 r-jwli3a r-1b43r93']" is displayed
* Wait for 3 second before upload page

## Scenario: Contiune for money transfer page
* Verify the element with locator "//div[normalize-space()='My account']" is displayed
* Verify the element with locator "//div[text()='CHECKING']" is displayed
* Verify the element with locator "//div[text()='10,000,000.00']" is displayed
* Wait for 1 second before performing action

## Scenario: Fill for money transfer form
* Click the element with locator "//div[text()='Transfer money']" and verify element with locator "//div[text()='Transfer money']" is displayed
* Wait for 1 second before performing action
* Verify the element with locator "//div[text()='Transfer money']" is displayed
* Select option by text "Test Account" from dropdown with locator "//option[text()='Test Account']" and wait before action
* Select option by text "Testinium-1" from dropdown with locator "//option[text()='Testinium-1']" and wait before action
* Wait for 1 second before performing action
* Send text to the element with locator "//input[contains(@class, 'css-11aywtz')]", text: "5000"
* Wait for 1 second before performing action
* Click the element with locator "//div[text()='Send']" and verify element with locator "//div[text()='Send']" is displayed
* Wait for 3 second before upload page

## Scenaeio: Money transfer verification
* Verify the element with locator "//div[normalize-space()='My account']" is displayed
* Verify the element with locator "//div[text()='CHECKING']" is displayed
* Verify the element with locator "//div[text()='9,994,900.00']" is displayed
* Wait for 1 second before performing action
* Verify the element with locator "//div[text()='Transactions']" is displayed
* Verify the element with locator "//div[text()='Test Account']" is displayed
* Verify the element with locator "//div[text()='Testinium-1']" is displayed
* Verify the element with locator "//div[text()='02-02-2025 17:03:36']" is displayed
* Verify the element with locator "//div[text()='5,100.00']" is displayed
* Wait for 3 second before upload page

## Go back and logut
* Click the element with locator "//div[text()='Back']" and verify element with locator "//div[text()='Back']" is displayed
* Wait for 3 second before upload page
* Click the element with locator "//div[text()='Logout']" and verify element with locator "//div[text()='Logout']" is displayed
* Wait for 3 second before upload page
* Verify the element with locator "//div[text()='Login']" is displayed

## Close Browser
* Wait for 1 second before performing action
* Close the browser