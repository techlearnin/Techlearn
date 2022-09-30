package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Description {

	WebDriver driver;

	@Test(priority=0,description="Google Launch URL")
	public void TestCase1() {
		driver.get("https://www.google.com");
	}
	
	@Test(priority=3,description="Facebook URL", enabled=false)
	public void TestCase2() {
		driver.get("https://www.facebook.com");
	}
	
	@Test(enabled=false , priority=4)
	public void TestCase3() {
		driver.get("https://www.twitter.com");
	}
	
	@Test(enabled=true, priority=5)
	public void TestCase4() {
		driver.get("https://www.selenium.dev");
	}
	
	@Test(priority=1, description="Google Search")
	public void TestCase5() {
		driver.findElement(By.name("q")).sendKeys("TestNG"+Keys.ENTER);
	} 
	
	@Test(description="Click on Image tab", priority=2)
	public void TestCase6() {
		driver.findElement(By.xpath("//*[@id=\"hdtb-msb\"]/div[1]/div/div[3]/a")).click();
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
