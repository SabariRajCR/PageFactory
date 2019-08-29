package com.leaftaps.pages;

import com.leaftaps.base.ProjectSpecificMethods;

public class MyLeadspage extends ProjectSpecificMethods {
	
	public CreateleadPage ClickCreatelead() {

		driver.findElementByLinkText("Create Lead").click();
		return new CreateleadPage();

	}

	
	

}
