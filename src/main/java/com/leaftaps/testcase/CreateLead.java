package com.leaftaps.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.leaftaps.base.ProjectSpecificMethods;
import com.leaftaps.pages.HomePage;


public class CreateLead extends ProjectSpecificMethods{
	@BeforeClass
	public void setFileName(){
		
		filename = "CreateLead";
	}
	
	
	@Test(dataProvider="fetchdata")
	public void runCreateLead(String cn, String fn, String ln){
		new HomePage().ClickCRM_SFA().ClickLeads().
		ClickCreatelead().EnterCompanyName(cn)
		.EnterFirstName(fn).EnterLastName(ln).ClickSubmitCreateLead().ViewLead();
		
		
	}
		

}
