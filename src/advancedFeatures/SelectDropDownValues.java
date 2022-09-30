package advancedFeatures;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class SelectDropDownValues {
	WebDriver driver;

	@Test
	public void dropDownValues() throws Exception{
		driver.get("http://baalabharathi.com/upload-story/");
		driver.findElement(By.name("field-5vlVJGcSKva7av0")).sendKeys("517501");
		//	new Select(driver.findElement(By.id("field-5gVECDat8HE4BHW"))).selectByVisibleText("India");
		Thread.sleep(2000);
		new Select(driver.findElement(By.id("field-5gVECDat8HE4BHW"))).selectByValue("PK");
		Thread.sleep(2000);
		new Select(driver.findElement(By.xpath("//*[@id=\"field-rUN19TKpQsSOX3X\"]"))).selectByIndex(3);
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "E:\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
