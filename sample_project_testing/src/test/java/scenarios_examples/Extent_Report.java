package scenarios_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Obj_Repo.Locators;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Extent_Report {

	public static void main(String[] args) {
		
		String path = "D:\\New folder (2)RestAssuredFrameDevelopment\\practise_scenarios\\scenarios_sample\\target\\netflixreport.html";
		
	ExtentReports report = new ExtentReports(path);
	ExtentTest Test=report.startTest("google search");
		
		
		WebDriverManager.chromedriver().browserVersion("129.0.6668.89").setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		Test.log(LogStatus.INFO,"Browser Launched");
		
		driver.findElement(Locators.edit_google_search).sendKeys("Netflix");
		
		Test.log(LogStatus.INFO,"Search is performed");
		new Actions(driver).sendKeys(Keys.ENTER).perform();
		
		
		boolean res = driver.findElement(By.xpath("//div[text()='All']")).isDisplayed();
		if (res) {
			Test.log(LogStatus.PASS,"Search is succesful");
		}
		else {
			Test.log(LogStatus.FAIL, "search is unsussceful");
		}
		Test.log(LogStatus.INFO,"Search is completed");
		report.endTest(Test);
		report.flush();
		driver.close();
		new ChromeDriver().get(path);
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
