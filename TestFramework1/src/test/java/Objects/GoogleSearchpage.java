package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchpage {
	
	WebDriver driver;
	//First Create a constructor to point to webdriver object of other test pages
	public GoogleSearchpage(WebDriver driver )
	{
		this.driver=driver;
	}
	
	By searchBox=By.xpath("//input[@name='q']");
	By Search_btn= By.xpath("(//input[@name='btnK'])[1]");
	By Facebook_link=By.xpath("//a//span[text()='Facebook® Account Sign Up - Facebook.com']");
	
	public void searchgoogle(String Searchinput) 
	{
		try{
			
		driver.findElement(searchBox).sendKeys(Searchinput);
		driver.findElement(Search_btn).click();
		}
		catch(Exception e)
		{
			System.out.println("Exception Caught: " +e.getMessage());
		}
		
	}
	public void ClickFacebook()
	{
		try {
			driver.findElement(Facebook_link).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println("Exception Caught: " +e.getMessage());
		}
		
		
	}
	
	

}
