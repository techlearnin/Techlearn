package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class DependsOnMethod {
	WebDriver driver;

	@Test(dependsOnMethods="method2")
	public void method1() {	
		driver.findElement(By.name("q")).sendKeys("TestNG"+Keys.ENTER);
	}

	@Test
	public void method2() {
		driver.get("https://www.google.com");
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
