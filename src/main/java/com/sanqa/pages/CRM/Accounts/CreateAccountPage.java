package com.sanqa.pages.CRM.Accounts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.sanqa.base.Page;

public class CreateAccountPage extends Page{

	public void createAccount(String AccountName)
	{
		driver.findElement(By.xpath("//*[@id=\"Crm_Accounts_ACCOUNTNAME\"]")).sendKeys(AccountName);
		driver.findElement(By.xpath("//*[@id=\"Crm_Accounts_ACCOUNTSITE\"]")).sendKeys("Bangalore");
		
		WebElement dp = driver.findElement(By.xpath("//*[@id=\"Crm_Accounts_PARENTACCOUNTID\"]"));
		dp.getAttribute("King (Sample)");
		
	}
}
