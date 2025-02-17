package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouserOver {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().browserVersion("129.0.6668.89").setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		boolean res;
		try {
			res=driver.findElement(By.xpath("//*[text()='Request OTP']")).isDisplayed();
		} catch (Exception e) {
			res=false;
		}
		Thread.sleep(3000);
		if(res)
		{
			driver.navigate().refresh();
		}
		else {
			System.out.println("Skipping Refresh");
		}
		Actions action= new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Fashion')]/../..//img"));
		action.moveToElement(element).perform();
		action.click(element).perform();
		action.contextClick(element).perform();
		driver.quit();

	}

}
