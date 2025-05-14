package com.orangehrmlive.demo.test;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdminTest extends BaseTest {

    @Test
    public void testnavigatetoAdminPage() {
        // Exception Handling
        try {
            click(adminLoc);
        } catch (NoSuchElementException e) {
            pause(3);

            click(adminLocAss);
        }
        String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers";
        String currentUrl = driver.getCurrentUrl();
        // boolean Admin = driver.findElement(adminLoc).isDisplayed();
        // Assert.assertTrue(Admin, "Admin is displayed or not");
        pause(3);
        Assert.assertTrue(currentUrl.contains("admin"), "Validate admin is visible");
        Assert.assertEquals(currentUrl, expectedUrl);

    }


}


