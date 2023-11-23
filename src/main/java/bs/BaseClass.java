package bs;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.support.*;

public class BaseClass {
	
	protected static AppiumDriver driver;
	
	public BaseClass()
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}

	 @BeforeTest
	    public void setUp()
	    {
		 try {
		 DesiredCapabilities dc = new DesiredCapabilities();
	        dc.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
	        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	        dc.setCapability(MobileCapabilityType.DEVICE_NAME,"androidDevice");
	            String app = "Users/a1707/Documents/app_prod_release.apk";
	        dc.setCapability(MobileCapabilityType.APP, app);
	        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
	        dc.setCapability("appActivity","com.cafu.feature.auth.SplashActivity");
	        URL url= new URL("http://127.0.0.1:4723/wd/hub");
	        driver= new AndroidDriver(url,dc);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}     
	    }
	 
	    @AfterTest
	    public void tearDown()
	    {
	        driver.quit();
	    }
	    
	    public void waitForVisibility(WebElement e)
	    {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(70));
	        wait.until(ExpectedConditions.visibilityOf(e));
	    }

	    public void waitForExplicitVisibility(WebElement e){
	        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	                .withTimeout(Duration.ofSeconds(30))
	                .pollingEvery(Duration.ofSeconds(5))
	                .ignoring(NoSuchElementException.class);
	        wait.until(ExpectedConditions.visibilityOf(e));
	    }

	    public void clear(WebElement e) {
	        waitForVisibility(e);
	        e.clear();
	    }

	    public void click(WebElement e) {
	        waitForVisibility(e);
	        e.click();
	    }

	    public void sendKeys(WebElement e, String txt) {
	        waitForVisibility(e);
	        e.sendKeys(txt);
	    }

	    public String getAttribute(WebElement e, String attr) {
	        waitForVisibility(e);
	        return(e.getAttribute(attr));
	    }

}
