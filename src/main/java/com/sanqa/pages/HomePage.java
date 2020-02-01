package com.sanqa.pages;

import org.openqa.selenium.By;
import com.sanqa.base.Page;

public class HomePage extends Page{
	
	
	
	public void goToSignUp()
	{
		driver.findElement(By.cssSelector(".zh-signup")).click();
	}
	
	public LoginPage goToLogin()
	{
		driver.findElement(By.xpath("//*[@class=\"zh-login\"]")).click();
		return new LoginPage();
	}
	
	public void goToSupport()
	{
		driver.findElement(By.linkText(".zh-support")).click();
	}
	
	public void gotoLearnMore()
	{
		driver.findElement(By.linkText("Learn more")).click();
	}
	
	public void validateFooterLinks()
	{
		
	}
}
