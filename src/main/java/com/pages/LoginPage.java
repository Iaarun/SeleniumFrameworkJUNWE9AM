package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	By useremail = By.id("email");
	By userpass = By.id("pass");
	By lgn_btn = By.xpath("//span[contains(text(),'Login')]");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getTitle() {
		return driver.getTitle();
	}

	public void setUsername(String username) {
		driver.findElement(useremail).sendKeys(username);
	}
	
	public void setUserPassword(String userpassword) {
		driver.findElement(userpass).sendKeys(userpassword);
	}
	
	
	public void clickOnLogin() {
		driver.findElement(lgn_btn).click();
	}

}
