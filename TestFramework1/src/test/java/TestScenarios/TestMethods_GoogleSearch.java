package TestScenarios;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.GoogleSearchpage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMethods_GoogleSearch {
	
	WebDriver driver;
	GoogleSearchpage ObjectRepo;
	
	@BeforeTest
	public void beforetest()
	
	{
		//Use webdriver manger (dependency added in pim.xml) to keep driver version updated
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		
		//appply wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
	}
	@Test
	public void SearchOperation()
	{
		ObjectRepo = new GoogleSearchpage(driver);
		ObjectRepo.searchgoogle("facebook");// can pass values from data file excel
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void VerifyAccessFacebook()
	{
		ObjectRepo = new GoogleSearchpage(driver);
		ObjectRepo.ClickFacebook();
	}
	
	
	@AfterTest
	public void aftertest() {
		
		//driver.quit();
	}

}
