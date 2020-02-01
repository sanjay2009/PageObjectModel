package com.sanqa.base;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Page {
	
	public static WebDriver driver;
	public static TopMenus menu;
	
	public Page()
		{
			if(driver==null)
			{
		//System.setProperty("webdriver.gecko.driver", "F:\\PageObjectModel\\src\\test\\resources\\com\\sanqa\\drivers\\geckodriver.exe");
		//driver= new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "F:\\PageObjectModel\\src\\test\\resources\\com\\sanqa\\drivers\\chromedriver.exe");
		
		Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values.notifications", 2);
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", (Object)prefs);
        options.addArguments(new String[] { "--disable-extensions" });
        options.addArguments(new String[] { "--disable-infobars" });
        Page.driver = (WebDriver)new ChromeDriver(options);
		
		
		//driver= new ChromeDriver(options);
		driver.get("https://www.zoho.com");
		driver.manage().deleteAllCookies();
		//Thread.sleep(20000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		menu= new TopMenus(driver);
		
			}
		
		}

}
