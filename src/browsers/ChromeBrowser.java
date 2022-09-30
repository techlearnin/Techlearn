package browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
	
	static WebDriver driver;

	public static void main(String[] args) throws Exception  {
		
	System.setProperty("webdriver.chrome.driver", "E:\\Lib\\chromedriver.exe");
	driver = new ChromeDriver();
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.get("https://www.google.com");
	Thread.sleep(3000);
	driver.navigate().to("https://www.facebook.com");
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Techlearn.in");
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.ENTER);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a/h3")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("About Us")).click();
	Thread.sleep(2000);
	
	
	driver.quit();
    //driver.close();
	
	// -> Single line comment
	
	/*
	 * 
	 *  Multi line comment
	 * 
	 * 
	 */
	
		

	}


}
