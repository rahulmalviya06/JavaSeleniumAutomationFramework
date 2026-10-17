package com.automation.tests;

import com.automation.pages.HomePage;
import com.automation.utils.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterUserTest {

    WebDriver driver;
    HomePage homePage;

    @BeforeMethod
    public void setUp() {
        driver = BrowserFactory.getDriver();
        homePage = new HomePage(driver);
    }

    @Test
    public void registerUser() {
        homePage.openUrl("http://automationexercise.com");

        Assert.assertTrue(homePage.isHomePageVisible(), "Home page is not visible");

        homePage.clickSignupLogin();
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
