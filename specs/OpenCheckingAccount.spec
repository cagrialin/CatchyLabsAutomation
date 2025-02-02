# Open Checking Account
* Launch the browser "chrome"
  // Opens the Chrome browser to start the automation process.

## Scenario: Launch Browser and Verify Login Page Title
  // This scenario verifies that the login page is correctly loaded and displays the expected title.
* Verify the page title contains "login"
* Wait for 3 second before upload page

## Scenario: Fill in Login Form and Submit
  // This scenario simulates filling in the login form with a username and password, then submitting the form.
* Click the element with locator "//input[@placeholder='Username']" and verify element with locator "//input[@placeholder='Username']" is displayed
* Send text to the element with locator "//input[@placeholder='Username']", text: "omercagri.alin"
* Click the element with locator "//input[@placeholder='Password']" and verify element with locator "//input[@placeholder='Password']" is displayed
* Send text to the element with locator "//input[@placeholder='Password']", text: "Catchy123"
* Wait for 1 second before performing action
* Click the element with locator "//div[@class='css-146c3p1 r-jwli3a r-1b43r93']" and verify element with locator "//div[@class='css-146c3p1 r-jwli3a r-1b43r93']" is displayed
* Wait for 3 second before upload page

## Scenario: Verify Navigation After Successful Login
  // This scenario verifies that, after a successful login, the user is properly navigated to the dashboard or homepage.
* Click the element with locator "//div[@class='css-146c3p1 r-jwli3a r-1b43r93']" and verify element with locator "//div[@class='css-146c3p1 r-jwli3a r-1b43r93']" is displayed
* Wait for 3 second before upload page

## Scenario: Continue for Money Transfer Page
  // This scenario verifies that the user can continue to the money transfer page by creating an account.
* Verify the element with locator "//div[contains(text(),'You don't have any account yet!')]" is displayed
* Click the element with locator "//div[contains(text(),'Create an account')]" and verify element with locator "//div[contains(text(),'Create an account')]" is displayed
* Wait for 3 second before upload page

## Scenario: Create Account Form
  // This scenario ensures that the user can successfully create an account with required details like account type and account name.
* Wait for 3 second before upload page
* Verify the element with locator "//div[contains(text(),'Create account')]" is displayed
* Wait for 1 second before performing action
* Select option by value "CHECKING" from dropdown with locator "//div[@class='css-175oi2r r-1777fci']//select" and wait before action
* Wait for 1 second before performing action
* Click the element with locator "//input[@class='css-11aywtz r-6taxm2 r-1eh6qqt r-z2wwpe r-rs99b7 r-h3s6tt r-1qhn6m8']" and verify element with locator "//input[@class='css-11aywtz r-6taxm2 r-1eh6qqt r-z2wwpe r-rs99b7 r-h3s6tt r-1qhn6m8']" is displayed
* Send text to the element with locator "//input[@class='css-11aywtz r-6taxm2 r-1eh6qqt r-z2wwpe r-rs99b7 r-h3s6tt r-1qhn6m8']", text: "Test Account"
* Wait for 1 second before performing action
* Click the element with locator "//div[@class='css-146c3p1 r-jwli3a r-1b43r93'][normalize-space()='Create']" and verify element with locator "//div[@class='css-146c3p1 r-jwli3a r-1b43r93'][normalize-space()='Create']" is displayed
* Wait for 3 second before upload page
* Verify the element with locator "//div[normalize-space()='My account']" is displayed
* Verify the element with locator "//div[text()='CHECKING']" is displayed
* Wait for 3 second before upload page

## Scenario: Close Browser
  // This scenario ensures that the browser is properly closed after the test is completed.
* Wait for 1 second before performing action
* Close the browser
