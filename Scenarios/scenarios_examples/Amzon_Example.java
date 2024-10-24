package scenarios_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amzon_Example {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().browserVersion("129.0.6668.90 ").setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes");
		driver.findElement(By.id("nav-search-submit-button")).click();
		boolean res = driver.findElement(By.xpath("//span[@class=\"a-size-base a-color-base puis-bold-weight-text\"]")).isDisplayed();
		if(res){
			System.out.println("search is successful");
			
		}
		else {
			System.out.println("search is not suucessful");
		}
		String price = driver.findElement(By.xpath("(//img[@class=\"s-image\"])[1]/../../../../../..//span[@class=\"a-price-whole\"]")).getText();
		System.out.println(price);
		driver.close();
		driver.quit();

	}

}
