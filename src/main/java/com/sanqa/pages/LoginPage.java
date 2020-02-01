package com.sanqa.pages;

import org.openqa.selenium.By;
import com.sanqa.base.Page;
import com.sanqa.base.TopMenus;

public class LoginPage extends Page {
	
	
	public ZohoAppPage doLoginIn()
	{
		
		driver.findElement(By.xpath("//*[@id='login_id']")).sendKeys("ramesh.sanjay@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"nextbtn\"]/span")).click();
		driver.findElement(By.cssSelector("input[name='PASSWORD']")).sendKeys("Selenium@1234");
		driver.findElement(By.xpath("//*[@id=\"nextbtn\"]/span")).click();
		return new ZohoAppPage();
	}

}
	