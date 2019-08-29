package com.leaftaps.pages;

import com.leaftaps.base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods {
	
	public MyLeadspage ClickLeads() {

		driver.findElementByLinkText("Leads").click();
		return new MyLeadspage();

	}

	
	

}
