package scenarios_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Placeholder {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().browserVersion("129.0.6668.89").setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.makemytrip.com/?srsltid=AfmBOorh-T0-WcIKA9cDz1trcQVGTV3pa6UzrXq2SksclCn2I4Vl9oNv");
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		driver.findElement(By.id("fromCity")).click();
		Actions actions= new Actions(driver);
		Thread.sleep(3000);
		actions.sendKeys(driver.findElement(By.xpath("//input[@placeholder=\"From\"]")), "hyd").perform();
		Thread.sleep(3000);
		actions.sendKeys(Keys.ARROW_DOWN).perform();
		actions.sendKeys(Keys.ENTER).perform();
		

	}

}
