package com.automation.base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	protected WebDriver driver;
	protected WebDriverWait wait;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public WebElement waitForElement(By locator) {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public void click(By locator) {
		waitForElement(locator).click();
	}

	public void type(By locator, String value) {
		WebElement element = waitForElement(locator);
		element.clear();
		element.sendKeys(value);
	}
	
	public boolean isDisplayed(By locator) {
		try {
			return waitForElement(locator).isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

}
