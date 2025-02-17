package practise;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowE {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().browserVersion("129.0.6668.89").setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(5000);
		driver.navigate().refresh();
		driver.findElement(By.xpath("//img[@alt=\"img\"][1]/../..")).click();
		System.out.println(driver.getWindowHandle());
		Set<String> windows=driver.getWindowHandles();
		Thread.sleep(5000);
		driver.switchTo().window(windows.toArray()[1].toString());
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.switchTo().window(windows.toArray()[0].toString());
		System.out.println(driver.getTitle());
		driver.close();
		driver.quit();

	}

}
