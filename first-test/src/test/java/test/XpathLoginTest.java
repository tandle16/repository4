package test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLoginTest {
	@Test
	// set Property for Chrome Browser
	public void handleCSSElements() throws InterruptedException {
		// Set Chrome driver as your default Driver
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		// Instantiate ChromeDriver object
		WebDriver driver = new ChromeDriver();
		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Delete cookies and history
		driver.manage().deleteAllCookies();
		// Maximise Browser
		driver.manage().window().maximize();
		// Go to a Site
		driver.get("http://techfios.com/test/billing/?ng=admin/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("techfiosdemo@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("abc123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);

		driver.close();
		driver.quit();

	}
}