package test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PopupTest {
	@Test

	public void handlePopup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Go to Rediff Site
		// Click on the go button
		// Close the popup
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		WebDriverWait Wait = new WebDriverWait(driver, 30);
		Wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//form[@name='loginform']//descendant::input[@type='submit']")));
		
		driver.findElement(By.xpath("//form[@name='loginform']//descendant::input[@type='submit']")).click();
		Thread.sleep(5000);//wait for 5sec popup will show up
		
		driver.switchTo().alert().accept();

	}
}
