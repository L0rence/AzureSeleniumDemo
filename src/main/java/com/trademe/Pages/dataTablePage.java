package com.trademe.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class dataTablePage
{
	private WebDriver driver;

	//1. By Locator

	private By AdminTxt = By.xpath("//input[@id='txtUsername']");
	private By PassTxt = By.xpath("//input[@id='txtPassword']");
	private By LoginBtn = By.xpath("//input[@id='btnLogin']");
	private By WelcomeName = By.xpath("(//a[normalize-space()='Welcome sheshu'])[1]");
	
	//2. Constructor of the page class

	public dataTablePage(WebDriver driver)
	{
		this.driver =driver;
	}
	//3. Page Actions: Feature (Behavior) of the Page

	public void Login(String user, String pass)
	{
	driver.findElement(AdminTxt).sendKeys(user);
	driver.findElement(PassTxt).sendKeys(pass);
	}
	public void clickLoginBtn()
	{
		driver.findElement(LoginBtn).click();
	}
	public boolean verifyLogin()
	{
		return driver.findElement(WelcomeName).isDisplayed();
	}
 
		 
	 
}
