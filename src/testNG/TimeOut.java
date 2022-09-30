package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TimeOut {
	WebDriver driver;

	@Test
	public void withOutTimeOut() {
	driver.get("https://www.google.com");
	driver.findElement(By.name("q")).sendKeys("TestNG"+Keys.ENTER);
	}

	@Test(timeOut=1000)
	public void withTimeOut() {
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

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
