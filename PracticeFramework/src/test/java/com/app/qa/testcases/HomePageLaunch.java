package com.app.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.app.qa.base.TestBase;
import com.app.qa.pages.HomePage;

public class HomePageLaunch extends TestBase{
	HomePage homePage;
	public HomePageLaunch() {
		super();
	}
	@BeforeMethod
	public void setup() {
		initialization();
		homePage = new HomePage();
	}
	@Test
	public void homePageTitleTest() {
		String title=homePage.validateHomePageTitle();
		Assert.assertEquals(title, "Cogmento Free CRM with AI Customer Relationship Management");
	}
	
}
