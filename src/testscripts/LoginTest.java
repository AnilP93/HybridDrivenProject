package testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.PredefinedActions;
import pages.LoginPage;

public class LoginTest {
	
	@Test
	public void tc_1() {
		System.out.println("Step- Launch Chrome browser and hit URL");
		PredefinedActions.start("https://rajgoli030-trials710.orangehrmlive.com/auth/seamlessLogin");
		
		System.out.println("Enter valid login credentials");
		LoginPage loginPage = new LoginPage();
		loginPage.login("admin", "EDfu@A6Jq5");
		
		System.out.println("Verify home page is displayed");
		String expectedTitle = "Employee Management";
		String actualTitle= loginPage.getPageTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Expected title was "+expectedTitle+ "but actual title is"+ actualTitle);

		
		
	}
	
}
