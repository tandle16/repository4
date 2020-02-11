package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchbrowser {

	// public static void main(String[] args) {
	// browserlaunch();

//	}

	@Test
	public  void launchbrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.dev/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.quit();

	}

}
