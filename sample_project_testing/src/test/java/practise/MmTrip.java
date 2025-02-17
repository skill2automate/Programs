package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MmTrip {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().browserVersion("129.0.6668.89").setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("fromCity")).click();
		Actions actions= new Actions(driver);
		actions.sendKeys(driver.findElement(By.xpath("//input[@placeholder=\"From\"]")), "hyd").perform();
		Thread.sleep(3000);
		actions.sendKeys(Keys.ARROW_DOWN).perform();
		actions.sendKeys(Keys.ENTER).perform();
		
		
		
		

	}

}
