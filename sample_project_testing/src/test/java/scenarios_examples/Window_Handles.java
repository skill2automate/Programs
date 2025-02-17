package scenarios_examples;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window_Handles {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().browserVersionDetectionCommand("129.0.6668.89").setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@alt=\"img\"][1]/../..")).click();
		System.out.println(driver.getWindowHandle());
		Set<String>windows=driver.getWindowHandles();
		Thread.sleep(3000);
		driver.switchTo().window(windows.toArray()[1].toString());
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		driver.switchTo().window(windows.toArray()[0].toString());
		System.out.println(driver.getTitle());
		driver.close();
		driver.quit();
		
		I love pav bhaji 
			I love pav bhaji 
			I love pav bhaji 
			I love pav bhaji 
			I love pav bhaji I love pav bhaji 
			I love pav bhaji 
			I love pav bhaji 
			I love pav bhaji 
			I love pav bhaji 
			I love pav bhaji 
			I love pav bhaji 
			I love pav bhaji 
			I love pav bhaji 
			I love pav bhaji 
			I love pav bhaji 
			I love pav bhaji 
		

	}

}
