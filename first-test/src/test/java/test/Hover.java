//Selenium 2/1/20202 time 3:00-HOVEROVER Video

package test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hover {
	WebDriver driver;//make driver- global variable 
	@Test
	public void hoverOverTest() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver" ,"./driver/chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.dell.com/en-us");
		
		WebElement DEALS_MENU_ELEMENT = driver.findElement(By.xpath("//button[@id='l1_4']"));
		Thread.sleep(2000);
		By WORKSTATION_DEALS_LOCATOR = By.linkText("Workstation Deals");
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.moveToElement(DEALS_MENU_ELEMENT).build().perform();
		driver.findElement(WORKSTATION_DEALS_LOCATOR).click();
	//	WebElement WORKSTATION_DEALS_ELEMENT=driver.findElement(By.linkText("Workstation Deals"));
		
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}
}
