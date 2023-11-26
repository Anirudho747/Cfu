package testScreens;

import org.openqa.selenium.WebElement;

import bs.BaseClass;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class FuelDeliveryScreen extends BaseClass{
	
	    @AndroidFindBy(id = "ivLoyaltyWelcomeArrows")
	    @iOSXCUITFindBy(id="l")
	    public WebElement welcomeArrow;

	    @AndroidFindBy(id = "tvMinOrderDesc")
	    @iOSXCUITFindBy(id="l")
	    public WebElement minOrder;
	    
	    @AndroidFindBy(id = "tvProduct")
	    @iOSXCUITFindBy(id="l")
	    public WebElement fuelType;
	    
	    @AndroidFindBy(id = "tvPoints")
	    @iOSXCUITFindBy(id="l")
	    public WebElement points;
	    
	    @AndroidFindBy(id = "tvServiceTitle")
	    @iOSXCUITFindBy(id="l")
	    public WebElement screenTitle;
	    
	    @AndroidFindBy(id = "ITimeSlot")
	    @iOSXCUITFindBy(id="l")
	    public WebElement timeSlot;
	    
	    @AndroidFindBy(xpath = "//*[@text='Fuel Delivery']/following-sibling::android.widget.ImageView")
	    @iOSXCUITFindBy(id="l")
	    public WebElement closeScreen;
	    
	    @AndroidFindBy(id = "tvLocationDescription")
	    @iOSXCUITFindBy(id="l")
	    public WebElement locationDesc;
	    
	    @AndroidFindBy(id = "tbAllowCallLate")
	    @iOSXCUITFindBy(id="l")
	    public WebElement allowCalls;
	    
	    public void tapWelcomeArrow()
	    {
	    	waitForVisibility(welcomeArrow);
	    	click(welcomeArrow);
	    }
	    
	    public void tapMinOrder()
	    {
	    	waitForVisibility(minOrder);
	    	click(minOrder);
	    }
	    
	    public void tapFuelType()
	    {
	    	waitForVisibility(fuelType);
	    	click(fuelType);
	    }
	    
	    public void readPoints()
	    {
	    	waitForVisibility(points);
	    	click(points);
	    }
	    
	    public void readScreenTitle()
	    {
	    	waitForVisibility(screenTitle);
	    	click(screenTitle);
	    }
	    
	    public void readTimeSlot()
	    {
	    	waitForVisibility(timeSlot);
	    	click(timeSlot);
	    }
	    
	    public void tapCloseScreen()
	    {
	    	waitForVisibility(closeScreen);
	    	click(closeScreen);
	    }
	    
	    public void readLocationDesc()
	    {
	    	waitForVisibility(locationDesc);
	    	click(locationDesc);
	    }
	    
	    public void tapAllowCalls()
	    {
	    	waitForVisibility(allowCalls);
	    	click(allowCalls);
	    }
	
}
