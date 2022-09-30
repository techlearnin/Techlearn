package advancedFeatures;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class PopupAlertboxPrograms {
	WebDriver driver;
	
	@Test
	public void PopupAlertbox() throws Exception{
		driver.get("http://www.seleniumlearn.com/how-handle-alert-box-using-selenium");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"node-100\"]/div/div[1]/div/div/button")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
	}
	
	@Test
	public void ConfirmationDialogBox() throws Exception{
		driver.get("http://www.seleniumlearn.com/confirmation-dialog-box");
		Thread.sleep(7000);
		driver.findElement(By.xpath("//*[@id=\"node-102\"]/div/div[1]/div/div/button")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss();
	}
	
	@Test
	public void PromptDialogBox() throws Exception{
		driver.get("http://www.seleniumlearn.com/prompt-dialog-box");
		Thread.sleep(7000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/main/div/section/div/div[2]/article/div/div[1]/div/div/button")).click();
		Thread.sleep(5000);
	/*	driver.switchTo().alert().sendKeys("Hemanth");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		*/
		
		Alert alt = driver.switchTo().alert();
		alt.sendKeys("Hemanth");
		alt.accept();
	}
	
	
	
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "E:\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
