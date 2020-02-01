package com.sanqa.rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testnew {

	@Test
	public void zoho()
	{
		
				WebDriver driver;
				System.setProperty("webdriver.chrome.driver", "F:\\PageObjectModel\\src\\test\\resources\\com\\sanqa\\drivers\\chromedriver.exe");
				//driver= new FirefoxDriver();
				driver= new ChromeDriver();
				driver.get("https://www.zoho.com");
				//Thread.sleep(20000);
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
		
		//driver.findElement(By.cssSelector("input[id='login_id']")).sendKeys("ramesh.sanjay@gmail.com");
				driver.findElement(By.xpath("//*[@class=\"zh-login\"]")).click();
				driver.findElement(By.xpath("//*[@id='login_id']")).sendKeys("ramesh.sanjay@gmail.com");
				//driver.findElement(By.name("LOGIN_ID")).sendKeys("ramesh.sanjay@gmail.com");
				//driver.findElement(By.xpath("//*[@class='textbox']")).sendKeys("ramesh.sanjay@gmail.com");
				//driver.findElement(By.cssSelector("#login_id")).sendKeys("ramesh.sanjay@gmail.com");
				driver.findElement(By.xpath("//*[@id=\"nextbtn\"]/span")).click();
				driver.findElement(By.cssSelector("input[name='PASSWORD']")).sendKeys("Selenium@1234");
				driver.findElement(By.xpath("//*[@id=\"nextbtn\"]/span")).click();
				driver.findElement(By.xpath("//*[@id=\"zl-myapps\"]/div[1]/div[7]/div/a/div")).click();
				//driver.close();
	}

}
