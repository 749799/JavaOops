package com.MyTest;

import org.testng.annotations.Test;

import pom.mypages.LoginPage;

public class LoginTest extends BaseTest{
	
	@Test
	public void loginTitle() {
		
		String title = page.getInstance(LoginPage.class).getPageTitle();
		System.out.println(title);
	}

}
