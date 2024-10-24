package scenarios_examples;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Locatable;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		
		/*ChromeOptions options=new ChromeOptions();
		options.setBinary("C:\\Users\\admin\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/");*/
		

		WebDriverManager.chromedriver().browserVersion("129.0.6668.89").setup();
		String Path ="D:\\New folder (2)RestAssuredFrameDevelopment\\practise_scenarios\\scenarios_sample\\screenshots";
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/");
		
		WebElement element=driver.findElement(By.xpath("//p[text()=\"Netflix India\"][last()]"));
		((Locatable)element).getCoordinates().inViewPort();
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(Path+"screen2.jpg"));
		
		
	}

}
