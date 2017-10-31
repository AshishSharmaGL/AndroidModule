package AndroidTest.Module;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import utility.Log;



public class Config {

	@Test	
public void invokeBrowser() throws IOException
{
		Log.info("Firefox Browser is opening.....");
	System.setProperty("webdriver.gecko.driver","D:\\geckodriver-v0.19.0-win64\\geckodriver.exe");	
	WebDriver driver=new FirefoxDriver();
	Log.info("Firefox Browser opened.....");
	Log.info("Redirecting User to Google.....");
	driver.get("http://www.google.com");
	Log.info("Checking Webpage Title.....");
	if(driver.getTitle().equals("Google"))
	{
		System.out.println("Correct Title");
		
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	FileUtils.copyFile(src, new File("d:\\tmp\\screenshot.png"));
		
	}
	Log.info("Closing the Browser.....Thanks!!!");
	driver.quit();
	
}
	

}
