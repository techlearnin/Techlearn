package jUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



class JunitDemo {
	
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.quit();
	}

	@Test
	void google() throws Exception {
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium Training in Tirupati");
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}
	
	
	@Disabled // Junit 5
	@Test
	void facebook() {
		driver.get("https://www.facebook.com");
	}
	
	@Ignore // Junit 3 and 4
	@Test
	void twitter() {
		driver.get("https://www.twitter.com");
	}
	
	@Disabled
	@Test
	void gmail() {
		driver.get("https://www.gmail.com");
	}

}
