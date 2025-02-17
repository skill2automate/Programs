package scenarios_examples;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practise_Examples {

	public static void main(String[] args) throws Exception {
		
		String Path = "D:\\New folder (2)RestAssuredFrameDevelopment\\practise_scenarios\\scenarios_sample\\target";
		
		WebDriverManager.chromedriver().browserVersion("130.0.6723.91").setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jiocinema.com/");
		Thread.sleep(5000);
		
		File Src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyDirectory(Src, new File(Path+"Screen5.jpg"));

	}

}
