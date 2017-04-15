package testing;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class A1 {

	@Test
	public void case1()
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver =  new ChromeDriver();
		driver.get("http://shop.theTestingWorld.com");
	    Actions act  = new Actions(driver);
	    act.moveToElement(driver.findElementByXPath("//*[text()='Components']")).perform();
	}
	
}
