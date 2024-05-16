package sit707_week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import java.io.IOException;
import java.io.File;

public class SeleniumOperations {

    public static void sleep(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void takeScreenshot(WebDriver driver, String filename) {
        // Capture screenshot
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            // Save the screenshot to a file
            FileUtils.copyFile(scrFile, new File(filename));
            System.out.println("Screenshot saved successfully.");
        } catch (IOException e) {
            System.out.println("Failed to save Screenshot.");
            e.printStackTrace();
        }
    }

    public static void officeworks_registration_page(String url) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");

        System.out.println("Fire up chrome browser.");
        WebDriver driver = new ChromeDriver();

        System.out.println("Driver info: " + driver);

        sleep(2);

        driver.get(url);

        WebElement firstNameField = driver.findElement(By.id("firstname"));
        System.out.println("Found element: " + firstNameField);
        firstNameField.sendKeys("Azmah");

        WebElement lastNameField = driver.findElement(By.id("lastname"));
        lastNameField.sendKeys("Kitchilan");

        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("azmah@example.com");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("123"); // Ensure this fails the password policy

        WebElement createAccountButton = driver.findElement(By.id("createAccount"));
        createAccountButton.click();

        takeScreenshot(driver, "C:\\Users\\hp\\Desktop\\SIT-707\\Task 2\\officeworks_registration_fail.png");

        sleep(2);

        driver.quit();
    }

    public static void alternative_registration_page(String url) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");

        System.out.println("Fire up chrome browser.");
        WebDriver driver = new ChromeDriver();

        System.out.println("Driver info: " + driver);

        sleep(2);

        driver.get(url);

        WebElement firstNameField = driver.findElement(By.id("ap_customer_name"));
        System.out.println("Found element: " + firstNameField);
        firstNameField.sendKeys("Azmah");

        WebElement emailField = driver.findElement(By.id("ap_email"));
        emailField.sendKeys("azmah@example.com");

        WebElement passwordField = driver.findElement(By.id("ap_password"));
        passwordField.sendKeys("123"); // Ensure this fails the password policy

        WebElement rePasswordField = driver.findElement(By.id("ap_password_check"));
        rePasswordField.sendKeys("123");

        WebElement createAccountButton = driver.findElement(By.id("continue"));
        createAccountButton.click();

        takeScreenshot(driver, "C:\\Users\\hp\\Desktop\\SIT-707\\Task 2\\amazon_registration_fail.png");

        sleep(2);

        driver.quit();
    }


public static void bunnings_registration_page(String url) {
    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");

    System.out.println("Fire up chrome browser.");
    WebDriver driver = new ChromeDriver();

    System.out.println("Driver info: " + driver);

    sleep(2);

    driver.get(url);

    WebElement emailField = driver.findElement(By.id("Email"));
    emailField.sendKeys("azmah@example.com");

    WebElement passwordField = driver.findElement(By.id("Password"));
    passwordField.sendKeys("123"); // Ensure this fails the password policy

    WebElement rePasswordField = driver.findElement(By.id("ConfirmPassword"));
    rePasswordField.sendKeys("123");
    
    WebElement firstNameField = driver.findElement(By.id("FirstName"));
    System.out.println("Found element: " + firstNameField);
    firstNameField.sendKeys("Azmah");

    WebElement createAccountButton = driver.findElement(By.id("register-button"));
    createAccountButton.click();

    // Wait for the validation error to appear
    sleep(2);

    // Take screenshot after clicking the 'Create account' button
    takeScreenshot(driver, "C:\\Users\\hp\\Desktop\\SIT-707\\Task 2\\bunnings_registration_fail.png");

    sleep(2);

    driver.quit();
	}
}


