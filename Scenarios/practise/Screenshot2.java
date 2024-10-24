package practise;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot2 {

	public static void main(String[] args) throws Exception {
		
		String path = "D:\\New folder (2)RestAssuredFrameDevelopment\\practise_scenarios\\scenarios_sample\\target";
		WebDriverManager.chromedriver().browserVersion("129.0.6668.89").setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jiocinema.com/");
		
		Thread.sleep(5000);
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File( path+"screen4.jpg"));

		
		
		
		
		
		
	}


}
