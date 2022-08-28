package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class Login extends ProjectSpecificMethods{
	@BeforeTest
	public void setUp() {
		excelFileName = "Login";
	}
	
	@Test(dataProvider = "fetch")
	public void runTest(String userName,String password) {
		LoginPage lp = new LoginPage();
		lp.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()
		.verifyHomePage();
		
		
		
	}
}
