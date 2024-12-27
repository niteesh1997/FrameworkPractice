package com.app.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.app.qa.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath = "//div[@class='MuiBox-root mui-18l9bu3']//*[name()='svg']")
	WebElement logo;
	
	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 mui-29kb32']")
	WebElement language;
	
	@FindBy(xpath = "@FindBy(xpath = \"//p[@class='MuiTypography-root MuiTypography-body1 mui-29kb32']\")\r\n"
			+ "	WebElement language;")
	WebElement languageDropDown;
	
	@FindBy(xpath = "//li[@class='mui-1wb0tra']")
	WebElement Home_Link;
	
	@FindBy(xpath = "//li[@class='mui-1wb0tra']")
	WebElement industries_link;
	
	@FindBy(xpath = "//li[normalize-space()='Features']")
	WebElement feature_link;
	
	@FindBy(xpath = "//li[normalize-space()='Pricing']")
	WebElement pricing_link;
	
	@FindBy(xpath = "//li[normalize-space()='Support']")
	WebElement support_link;
	
	@FindBy(xpath = "//li[normalize-space()='About']")
	WebElement about_link;
	
	@FindBy(xpath = "//a[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeLarge MuiButton-containedSizeLarge MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeLarge MuiButton-containedSizeLarge MuiButton-colorPrimary mui-1cxo7uq']")
	WebElement signup_link;
	
	@FindBy(xpath = "//a[normalize-space()='Login']")
	WebElement compare_link;
	
	public String validateHomePageTitle() {
		return driver.getTitle();
	}
	
}
