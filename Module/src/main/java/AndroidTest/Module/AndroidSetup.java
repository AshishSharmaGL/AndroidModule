package AndroidTest.Module;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.android.AndroidDriver;

public class AndroidSetup {
	public static void main(String[] args) throws MalformedURLException
	{
	
	RemoteWebDriver driver;

   
        
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("device","Android");

        //mandatory capabilities
        capabilities.setCapability("deviceName", "192.168.70.101:5555");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion", "5.0");
        capabilities.setCapability("appPackage", "com.bbm");
        capabilities.setCapability("appActivity", "com.bbm.ui.activities.MainActivity");
        //other caps
       
        
        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    

}
}
