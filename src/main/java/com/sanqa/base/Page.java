package com.sanqa.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Page {
	
	public WebDriver driver;
	
	public Page()
		{
				
		//System.setProperty("webdriver.gecko.driver", "F:\\PageObjectModel\\src\\test\\resources\\com\\sanqa\\drivers\\geckodriver.exe");
		//driver= new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "F:\\PageObjectModel\\src\\test\\resources\\com\\sanqa\\drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.zoho.com");
		driver.manage().deleteAllCookies();
		//Thread.sleep(20000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		}

}
