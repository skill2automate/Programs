package scenarios_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().browserVersion("129.0.6668.89").setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://docs.oracle.com/javase/8/docs/api/");
		Thread.sleep(3000);
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.xpath("//a[text()='java.applet' and @target='packageFrame']")).click();
		Thread.sleep(5000);
		driver.switchTo().parentFrame();
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.xpath("//span[text()='AppletContext']")).click();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		
		

	}

}
