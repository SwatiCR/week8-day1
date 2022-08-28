package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{
	
	public HomePage verifyHomePage() {
		String expText = "Leaftaps - TestLeaf Automation Platform";
		String actText = getDriver().getTitle();
		Assert.assertEquals(actText, expText);
		
		return this;
	}
	
	public MyHome clickCRMSFA() {
		getDriver().findElement(By.linkText("CRM/SFA")).click();
		return new MyHome();
	}
	
}
