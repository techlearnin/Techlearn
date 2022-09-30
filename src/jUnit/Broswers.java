package jUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Broswers {
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
		driver.close();
	}

	@Test
	void google() {
		
			driver.get("https://www.google.com");
			
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Techlearn.in");
			
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.ENTER);
		
			driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a/h3")).click();
			
			driver.findElement(By.linkText("About Us")).click();
		
	}

	void techlearn() {
		
		driver.get("https://www.google.com");
}
	void email() {
		
		driver.get("https://www.google.com");
}
}
