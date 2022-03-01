package com.trademe.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JobDetailPage
{
	private WebDriver driver;
	
	//1. By Locator
		private By JobTitleTxt = By.xpath("//h1[normalize-space()='Plumber']");
		private By companyNameTxt = By.xpath("//td[normalize-space()='Halo Industries']");
		private By JobLocationTxt = By.xpath("//td[@itemprop='jobLocation']");
	//2. Constructor of the page class
	
		public JobDetailPage(WebDriver driver)
		{
			this.driver = driver;
		}
		
	//3. Action Methods 
		
		public String getJobDetailsPageTite()
		{
			return driver.getTitle();
		}
		
		public String getJobTitleTxt() 
		{
			WebDriverWait wait = new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(JobTitleTxt));
			return driver.findElement(JobTitleTxt).getText();
			
		}
		public String companyNameIsDisplayed()
		{
			return driver.findElement(companyNameTxt).getText();
			
		}
		public String jobLocation()
		{
			return driver.findElement(JobLocationTxt).getText();
		}
		
}
