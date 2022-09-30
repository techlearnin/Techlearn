package jUnit;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class GitHub {
	WebDriver driver;
  @Test
  public void googlesearch() throws InterruptedException {
	  driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium Training in Tirupati");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "E:\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	 
  }

}
