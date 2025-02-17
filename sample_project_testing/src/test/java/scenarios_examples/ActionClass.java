package scenarios_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().browserVersion("129.0.6668.89").setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.navigate().refresh();
		
		Actions action = new Actions(driver);
		WebElement element=driver.findElement(By.xpath("//span[contains(text(),'Fashion')]/../..//img"));
		//action.moveToElement(element).perform();
		//action.click(element).perform();
		//action.contextClick(element).perform();
		action.clickAndHold(element).perform();
		
		

	}

}
