package test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VariousElements {

	@Test
	// set Property for Chrome Browser
	public void exploreVariousElements() throws InterruptedException {
		// Set Chrome driver as your default Driver
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		// Instantiate ChromeDriver object
		WebDriver driver = new ChromeDriver();
            //Implicit Wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//Delete cookies and history
		driver.manage().deleteAllCookies();
		//Maximise Browser
		driver.manage().window().maximize();
		//Go to a Site
		driver.get("http://objectspy.space/");
		
		//Slow Down Java
		Thread.sleep(3000);
		//To click on Radio Button male-using by id
		driver.findElement(By.id("sex-1")).click();
		Thread.sleep(3000);
		//Type somthing in fields -Using by Name
		driver.findElement(By.name("firstname")).sendKeys("bas");
		Thread.sleep(3000);
		//click on Link Test
	//	driver.findElement(By.linkText("Link Test : New Page")).click();
	//	Thread.sleep(3000);
		
		//click on Partial link text
		driver.findElement(By.partialLinkText("OS-API Product FrontEnd")).click();
		
		Thread.sleep(3000);
		
		//Close the Browser

driver.close();
		//Quit the Driver
		driver.quit();
	}

}
