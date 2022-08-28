package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class CreateLead extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setUp() {
		excelFileName = "CreateLead";
	}
	
	@Test(dataProvider = "fetch")
	public void runTest(String userName,String password,String firstName,String lastName,String companyName) {
		LoginPage lp = new LoginPage();
		lp.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead()
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.enterCompanyName(companyName)
		.clickCreateLead()
		.verifyFirstName();
		
		
	}
	
}
