package com.orangehrmlive.demo.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest extends BaseTest {


    @Test(priority = 0)
    public void testLoginPositive() throws InterruptedException {


        boolean Dashboard = find(dashBoard).isDisplayed();
        Assert.assertTrue(Dashboard, "Validate is Dashboard header displayed");

    }

    @Test(priority = 1)
    public void testLogNegative() throws InterruptedException {


        boolean invalid = find(invalidCredentials).isDisplayed();
        Assert.assertTrue(invalid, "Validate invalidCredentials header displayed");


    }


}
