package browsers;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		List<WebElement> googlelinks = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links in Google: "+googlelinks.size());
		
		
	//	driver.get("http://hyderabadreport.com/user");
		
	/*	Thread.sleep(3000);
		driver.findElement(By.id("edit-name")).sendKeys("Hemanth");
		Thread.sleep(3000);
		driver.findElement(By.name("pass")).sendKeys("Hello@123");
		Thread.sleep(2000);
	//	driver.findElement(By.className("form-submit")).click();
	//	driver.findElement(By.cssSelector("input.form-submit")).click();
		driver.findElement(By.cssSelector(".form-submit")).click();
	*/
		Thread.sleep(3000);
	//	driver.findElement(By.linkText("Greater News")).click();
	//	driver.findElement(By.partialLinkText("News")).click();
	//	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/main/div/section/div/div[1]/form/div/div[1]/input")).sendKeys("Ram");
	//	driver.findElement(By.xpath("//*[@id=\"edit-pass\"]")).sendKeys("Hello");
		
	}

}
