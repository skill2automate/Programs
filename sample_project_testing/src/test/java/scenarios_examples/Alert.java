package scenarios_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().browserVersion("129.0.6668.89").setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		/*driver.switchTo().alert().dismiss();
		driver.switchTo().alert().sendKeys("dfffdsf");*/
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		

	}

}
