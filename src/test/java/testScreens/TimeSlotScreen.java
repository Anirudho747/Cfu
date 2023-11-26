package testScreens;

import org.openqa.selenium.WebElement;

import bs.BaseClass;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class TimeSlotScreen extends BaseClass {

	    @AndroidFindBy(xpath = "(//*[@resource-id='com.mena.customer:id/tvTimeSlot'])[2]")
	    @iOSXCUITFindBy(id="l")
	    public WebElement date;

	    @AndroidFindBy(xpath = "//*[contains(@text,'5 AM -')]")
	    @iOSXCUITFindBy(id="l")
	    public WebElement time;
	    
	    @AndroidFindBy(xpath = "//*[contains(@text,'5 AM -')]")
	    @iOSXCUITFindBy(id="l")
	    public WebElement checkOut;
	    
	    public void selectDate()
	    {
	        click(date);
	    }

	    public void selectTime()
	    {
	        click(time); 
	    }
	    
	    public void tapCheckOut()
	    {
	    	waitForVisibility(checkOut);
	    	click(checkOut);
	    }
	
}
