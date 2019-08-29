package com.leaftaps.base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.leaftaps.pages.LoginPage;
import com.leaftaps.utility.ExcelUtil;


public class ProjectSpecificMethods {
	
	public String filename;
	@DataProvider(name="fetchdata")
	
	public Object[][] runExceldata() throws IOException{
		
		return ExcelUtil.exceldata(filename);
	}

	public static ChromeDriver driver;
	
	
	@BeforeMethod
	@Parameters({"username","password"})
	public void login(String username, String password) {
	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps");
		new LoginPage().EnterUsername(username).EnterPassword(password).ClickLogin();
	}
	@AfterMethod
	public void close(){
		
		driver.close();
		
	}

}
