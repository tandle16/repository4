package test;

import org.junit.Test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class GoogleTest {

	@Test
	
	public void openGoogleSite() {
		//setting ChromeDriver properties
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		//create an object of ChromeDriver
		WebDriver driver=new ChromeDriver();
		
		
		//opens Google site
		driver.get("https://www.google.com/?gws_rd=ssl");
		

	}
	
	
}
