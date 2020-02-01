package com.sanqa.pages.CRM.Accounts;

import org.openqa.selenium.By;

import com.sanqa.base.Page;

public class AccountsPage extends Page{
	
	public CreateAccountPage goToCreateAccount() {
	
	driver.findElement(By.xpath("//*[@id=\"topRightIcons\"]/span[1]/link-to/button")).click();
	return new CreateAccountPage();
}
}
