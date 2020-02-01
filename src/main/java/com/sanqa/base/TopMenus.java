package com.sanqa.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.sanqa.pages.CRM.Accounts.AccountsPage;

public class TopMenus {
	
	WebDriver driver;
	public TopMenus(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void goToHomePage()
	{
		
	}
	
	public AccountsPage goToAccounts()
	{
		driver.findElement(By.xpath("//*[@id=\"mainMenuTabDiv\"]/crm-menu/div[1]/crm-tab/div[2]/div[4]/a")).click();
		return new AccountsPage();
	}
	
	public void goToDeals()
	{
		
	}
	
	public void goToLeads()
	{
		driver.findElement(By.xpath("//*[@id=\"mainMenuTabDiv\"]/crm-menu/div[1]/crm-tab/div[2]/div[2]/a")).click();
	}
	
	public void goToFeeds()
	{
		
	}
	
	public void goToContacts()
	{
		driver.findElement(By.xpath("//*[@id=\"mainMenuTabDiv\"]/crm-menu/div[1]/crm-tab/div[2]/div[3]/a")).click();
	}

}
	