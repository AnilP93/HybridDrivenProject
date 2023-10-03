package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\selenium webdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://automationbykrishna.com"); 
		String actualTitle= driver.getTitle();
		String expectedTitle= "Login Signup Demo";
		System.out.println(actualTitle);
		if(actualTitle.equals(expectedTitle))
			System.out.println("Pass");
		else
			System.out.println("Fail");
				
		//driver.close();
	}
	}

