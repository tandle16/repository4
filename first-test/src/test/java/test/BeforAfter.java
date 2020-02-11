//Example for Before,After Selenium session-4 2/1/2020 Time:1:20pm

package test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BeforAfter {
	WebDriver driver;//make driver- global variable 
	@Before
	public void hoverover() {
		System.setProperty("webdriver.chrome.driver" ,"./driver/chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.dell.com/en-us");
	}
	
	@Test
	public void hoverOverTest1() throws InterruptedException 
	{
		
		WebElement DEALS_MENU_ELEMENT = driver.findElement(By.xpath("//button[@id='l1_4']"));
		Thread.sleep(2000);
		By WORKSTATION_DEALS_LOCATOR = By.linkText("Workstation Deals");
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.moveToElement(DEALS_MENU_ELEMENT).build().perform();
		driver.findElement(WORKSTATION_DEALS_LOCATOR).click();
	//	WebElement WORKSTATION_DEALS_ELEMENT=driver.findElement(By.linkText("Workstation Deals"));
	}
		@Test
		public void hoverOverTest2() throws InterruptedException 
		{
			
			
			WebElement DEALS_MENU_ELEMENT = driver.findElement(By.xpath("//header[@id='dell-masthead']/descendant::button[@id='l1_2']"));
			Thread.sleep(2000);
			By WORKSTATION_DEALS_LOCATOR = By.linkText("Warranty Extension");
			Thread.sleep(3000);
			Actions action = new Actions(driver);
			action.moveToElement(DEALS_MENU_ELEMENT).build().perform();
			driver.findElement(WORKSTATION_DEALS_LOCATOR).click();
		}
		@After
		public void closeEverything() throws InterruptedException{
		Thread.sleep(2000);
		driver.close();
		driver.quit();
}
}