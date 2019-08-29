package com.leaftaps.pages;


import com.leaftaps.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {

	public LoginPage EnterUsername(String username) {

		driver.findElementById("username").sendKeys(username);
		return this;

	}
    
	public LoginPage EnterPassword(String password) {

		driver.findElementById("password").sendKeys(password);
		return this;

	}
	
	public HomePage ClickLogin() {

		driver.findElementByClassName("decorativeSubmit").click();
		return new HomePage();
	}
	

}
