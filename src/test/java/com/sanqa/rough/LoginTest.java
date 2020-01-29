package com.sanqa.rough;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sanqa.base.Page;
import com.sanqa.pages.HomePage;
import com.sanqa.pages.LoginPage;
import com.sanqa.pages.ZohoAppPage;

public class LoginTest {

	public static void main(String[] args) {
		
		
		HomePage homep = new HomePage();
		homep.goToLogin();
		
		LoginPage loginp = new LoginPage();
		loginp.enterloginCredentials();
		
		ZohoAppPage zohopage= new ZohoAppPage();
		zohopage.goToCRM();		
				
		//driver.close();
		

	}

}
		