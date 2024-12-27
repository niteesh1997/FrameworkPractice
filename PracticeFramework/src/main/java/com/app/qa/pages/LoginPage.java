package com.app.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.qa.base.TestBase;

import net.bytebuddy.asm.Advice.This;

public class LoginPage extends TestBase{
	
	//PageFactory -OR:
	@FindBy(xpath = "//input[@placeholder='Email']")
	WebElement email;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement Password;
	
	@FindBy(xpath = "//div[@class='ui fluid large blue submit button']")
	WebElement loginbtn;
	
	@FindBy(xpath = "//a[normalize-space()='Sign Up']")
	WebElement signUp;
	
	public LoginPage() {
		PageFactory.initElements(driver , this );
	}
	
	//action
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	public void login(String email, String Password) {
		this.email.sendKeys(email);
		this.Password.sendKeys(Password);
		this.loginbtn.click();
		
	}
}
