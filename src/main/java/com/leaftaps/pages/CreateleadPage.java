package com.leaftaps.pages;

import com.leaftaps.base.ProjectSpecificMethods;

public class CreateleadPage extends ProjectSpecificMethods {
	
	public CreateleadPage EnterCompanyName(String cn) {

		driver.findElementById("createLeadForm_companyName").sendKeys(cn);
		return this;

	}
	public CreateleadPage EnterFirstName(String fn) {
		driver.findElementById("createLeadForm_firstName").sendKeys(fn);
		return this;

	}
	public CreateleadPage EnterLastName(String ln) {
		driver.findElementById("createLeadForm_lastName").sendKeys(ln);
		driver.findElementByName("submitButton").click();
		return this;

	}
	public ViewLeadsPage ClickSubmitCreateLead() {
		driver.findElementByName("submitButton").click();
		return new ViewLeadsPage();

	}

}
