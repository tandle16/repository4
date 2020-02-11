package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

//	@test
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	//	System.setProperty("webdriver.chromedriver","./driver/chromedriver.exe")
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.dev/downloads/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.close();
		driver.quit();
	}

}
