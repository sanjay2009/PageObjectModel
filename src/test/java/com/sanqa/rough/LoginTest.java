package com.sanqa.rough;

import com.sanqa.base.Page;
import com.sanqa.pages.HomePage;
import com.sanqa.pages.LoginPage;
import com.sanqa.pages.ZohoAppPage;
import com.sanqa.pages.CRM.CRMHomePage;
import com.sanqa.pages.CRM.Accounts.AccountsPage;
import com.sanqa.pages.CRM.Accounts.CreateAccountPage;


public class LoginTest {
	

	public static void main(String[] args) throws Exception {
		
		
		HomePage homep = new HomePage();
		//homep.goToLogin();
		LoginPage lp = homep.goToLogin();
		
		//LoginPage loginp = new LoginPage();
		//loginp.doLoginIn();
		
		ZohoAppPage zp= lp.doLoginIn();
		zp.goToCRM();
		
		//ZohoAppPage zohopage= new ZohoAppPage();
		
		
		//zp.goToCRM();	
		
		AccountsPage acpage = Page.menu.goToAccounts();
		
		//AccountsPage accpage= new AccountsPage();
		CreateAccountPage cap= acpage.goToCreateAccount();
		
		//Thread.sleep(5000);
		//CreateAccountPage cap = new CreateAccountPage();
		cap.createAccount("Selenium Test");
		
		//Thread.sleep(5000);
		//Page.menu.goToLeads();
		//Thread.sleep(5000);
		//Page.menu.goToContacts();
		//Thread.sleep(5000);
				
		//driver.close();
		

	}

}
		