package com.automation.pages;

import com.automation.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
	private By signpLoginButtonByte = By.xpath("//a[text()=' Signup / Login']");
	private By logo = By.xpath("//img[@alt='Website for automation practice']");

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void openUrl(String url) {
		driver.get(url);
	}

	public boolean isHomePageVisible() {
		return isDisplayed(logo);
	}

	public void clickSignupLogin() {
		click(signpLoginButtonByte);
	}

}
