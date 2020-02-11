package test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleIFrame {
	@Test
	public void handleIFrame() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver" ,"./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://docs.oracle.com/javase/8/docs/api/");
		
		Thread.sleep(3000);
		//	System.out.println(driver.findElement(By.tagName("frame")).getSize());
		driver.switchTo().frame("packageListFrame");//frame 1 name in dom
			
		Thread.sleep(1000);
		
		new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("java.applet")));
		
		driver.findElement(By.linkText("java.applet")).click();
		driver.switchTo().defaultContent();//default will take to the stanadard
		driver.switchTo().frame("packageFrame");//frame 2(index),packageFrame(using frame2 string) 
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("AppletContext")).click();
		
		Thread.sleep(5000);
		
		driver.close();
		driver.quit();
	}

}
