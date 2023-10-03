package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.PredefinedActions;

public class LoginPage extends PredefinedActions {
	
	public void login(String userName, String password) {
		EnterUserName(userName);
		EnterPassword(password);
		clickOnLoginBtn();
	
	}
	
	public void EnterUserName(String userName) {
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(userName);
	}
	
	public void EnterPassword(String password) {
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
	}
	
	public void clickOnLoginBtn() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	public boolean isUsenameErrorMessageDisplayed() { 
		WebElement usenameErrorMessage =driver.findElement(By.cssSelector("#txtUsername-error"));
		return usenameErrorMessage.isDisplayed();
	}
	
	public boolean isPasswordErrorMessageDisplayed() {
		WebElement passwordErrorMessage =driver.findElement(By.cssSelector("#txtPassword-error"));
	return passwordErrorMessage.isDisplayed();
	}
	
	public boolean isLogoDisplayed() {
		WebElement logoElement =driver.findElement(By.xpath("//div[@class='organization-logo shadow']/img"));
	return logoElement.isDisplayed();
	}
	
	public String getPageTitle() {
		return driver.findElement(By.xpath("//div[text()='Employee Management']")).getText();
	
	}
	
} 




