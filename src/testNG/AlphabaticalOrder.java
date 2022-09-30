package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class AlphabaticalOrder {

	WebDriver driver;

	@Test
	public void googleURL() {
		driver.get("https://www.google.com");
	}
	
	@Test
	public void facebookURL() {
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void twitterURL() {
		driver.get("https://www.twitter.com");
	}
	
	@Test
	public void seleniuimdev() {
		driver.get("https://www.selenium.dev");
	}
	
/*	@Test
	public void googleSearch() {
		driver.findElement(By.name("q")).sendKeys("TestNG"+Keys.ENTER);
	}
	
	@Test
	public void googleClickImage() {
		driver.findElement(By.xpath("//*[@id=\"hdtb-msb\"]/div[1]/div/div[3]/a")).click();
	}
*/


	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "E:\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() {
	}

}
