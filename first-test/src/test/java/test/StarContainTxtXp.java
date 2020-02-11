package test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StarContainTxtXp {
	@Test
	public void ValidUserLogin() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://techfios.com/test/billing/?ng=admin/");
		//X path using *
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("techfiosdemo@gmail.com");
		//X path using contains()
		driver.findElement(By.xpath("//input[contains(@placeholder,'Password')]")).sendKeys("abc123");
		//X path for text()
		driver.findElement(By.xpath("//*[contains(text(),'Sign in')]")).click();
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}


		
	}
	


