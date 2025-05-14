package com.orangehrmlive.demo.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {

    public WebDriver driver;

    private String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";


    public By username = By.name("username");
    public By password = By.name("password");
    public By loginButton = By.tagName("button");
    public By dashBoard = By.xpath("//h6[text()='Dashboard']");
    public By invalidCredentials = By.xpath("//p[text()='Invalid credentials']");
    public By adminLoc = By.xpath("//span[text()='Admin1234']");
    public By adminLocAss = By.xpath("//span[text()='Admin']");


    @BeforeMethod(alwaysRun = true)
    public void beforeMethod() {

        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        login("Admin", "admin123");

    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod() {

        driver.quit();

    }

    public void login(String usernameVal, String passwordVal) {

        // driver.findElement(username).sendKeys(usernameVal);
        find(username).sendKeys(usernameVal);
        //  driver.findElement(password).sendKeys(passwordVal);
        type(username, usernameVal);
        type(password, passwordVal);
        // driver.findElement(loginButton).click();
        click(loginButton);


    }

    public WebElement find(By locator) {

        return driver.findElement(locator);
    }

    public void type(By locator, String text) {

        driver.findElement(locator).sendKeys(text);
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void pause(int timeInSeconds) {

        try {
            Thread.sleep(timeInSeconds * 1000);

        } catch (Exception e) {

        }

    }
}

