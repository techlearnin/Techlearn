package advancedFeatures;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.testng.annotations.BeforeTest;

public class ScrollDownUp {
	WebDriver driver;

	@Test
	public void scrollDown() throws Exception {
		driver.get("https://www.selenium.dev");
		Thread.sleep(5000);
		scrollDown();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 1000)"); 
	}
	
	
	@Test
	public void scrollUp() throws Exception {
		driver.get("https://www.selenium.dev");
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(1000, 0)"); 
	}
	
	@Test (priority=6)// //Indentify Loacator Element
    public void IndentifyLoacatorElement() throws Exception {
    driver.get("https://www.selenium.dev/");
    {
    	Thread.sleep(5000);
        WebElement element = (WebElement) driver.findElement(By.xpath("/html/body/div/main/div[8]/div[1]/div/div/p[2]/a"));
        Coordinates coordinate = ((Locatable)element).getCoordinates(); 
        coordinate.onPage(); 
        coordinate.inViewPort();
         }    
      }

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "E:\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
