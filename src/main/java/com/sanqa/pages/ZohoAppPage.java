package com.sanqa.pages;

import org.openqa.selenium.By;
import com.sanqa.base.Page;

public class ZohoAppPage  extends Page
{
	
	
	public void goToCRM()
	{
		driver.findElement(By.xpath("//*[@id=\"zl-myapps\"]/div[1]/div[7]/div/a/div")).click();
		
		
	}
	
	public void goToBooks()
	{
		
	}
	
	public void goToCalendar()
	{
		
	}
	
}
