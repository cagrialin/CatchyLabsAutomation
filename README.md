# CatchyLabs UI Test Automation Project

This project is a Web UI Test Automation framework built using **Java 11**, **Selenium 4.28.1**, **Maven 3.9.5**, and **Gauge 1.6.7**. It provides a robust structure to write, manage, and execute automated tests for web applications.

---

## Prerequisites

To run this project, ensure the following tools and software are installed on your system:

1. **Java Development Kit (JDK) 11**
   - Verify installation:
     ```bash
     java -version
     ```

2. **Apache Maven 3.9.5**
   - Verify installation:
     ```bash
     mvn -v
     ```

3. **Gauge CLI (Version 1.6.7)**
   - Install Gauge from [Gauge Downloads](https://gauge.org/download/).
   - Verify installation:
     ```bash
     gauge -v
     ```

4. **Integrated Development Environment (IDE)**
   - Recommended: [IntelliJ IDEA](https://www.jetbrains.com/idea/).

5. **Chrome Browser**
   - Ensure the latest version is installed.

6. **ChromeDriver**
   - Download the version matching your Chrome browser from [ChromeDriver Downloads](https://sites.google.com/chromium.org/driver/).
   - Add it to your system's PATH.

7. **Firefox Browser**
   - Ensure the latest version is installed.

8. **GeckoDriver**
   - Download the version matching your Firefox browser from [GeckoDriver Releases](https://github.com/mozilla/geckodriver/releases).
   - Add it to your system's PATH.

---

## Installation

Follow these steps to set up and run the project:

1. **Clone the Repository**
   ```bash
   git clone <repository_url>
   cd <repository_folder>
   ```

2. **Install Dependencies**
   Use Maven to download and install all required dependencies:
   ```bash
   mvn clean install
   ```

3. **Configure Gauge**
   Ensure the Gauge Java plugin is installed:
   ```bash
   gauge install java
   ```

4. **Set Up Project Properties**
   Update the `env/default` properties file with your desired configurations, such as:
   - Base URL of the application under test.
   - Path to the ChromeDriver or GeckoDriver executable.

---

## Running Tests

### Execute All Tests
Run all the test specifications:
```bash
mvn gauge:execute
```

### Execute Specific Test
Run a specific test specification:
```bash
gauge run specs/<spec_name>.spec
```

---

## Project Structure

- **`specs/`**: Contains Gauge specification files written in Markdown.
- **`src/test/java/`**: Stores Java test methods and helper classes.
- **`env/`**: Environment-specific configuration files.
- **`logs/`**: Logs generated during test execution.
- **`reports/`**: Contains HTML reports generated after test execution.

---

## Additional Notes

- Ensure your system PATH includes Java, Maven, Gauge, ChromeDriver, and GeckoDriver.
- Regularly update dependencies to their latest stable versions.
- For troubleshooting, check the `logs` directory for detailed execution logs.
- HTML reports of test executions can be found in the `reports/` directory.

---

## Resources

- [Gauge Documentation](https://docs.gauge.org/)
- [Selenium Documentation](https://www.selenium.dev/documentation/)
- [Maven Documentation](https://maven.apache.org/)

---

Happy Testing! 🎉
