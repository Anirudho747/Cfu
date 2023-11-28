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
	    
	    @AndroidFindBy(id = "tvTimeSlot")
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
	    
	    @AndroidFindBy(id = "btnPrimary")
	    @iOSXCUITFindBy(id="l")
	    public WebElement rtaParking;
	    
	    @AndroidFindBy(id = "tvBrandModel")
	    @iOSXCUITFindBy(id="l")
	    public WebElement brandModel;
	    
	    public void tapWelcomeArrow()
	    {
	    	waitForVisibility(welcomeArrow);
	    	click(welcomeArrow);
	    }
	    
	    public String readMinOrder()
	    {
	    	waitForVisibility(minOrder);
	    	return(getText(minOrder));
	    }
	    
	    public String readFuelType()
	    {
	    	waitForVisibility(fuelType);
	    	return(getText(fuelType));
	    }
	    
	    public String readPoints()
	    {
	    	return(getText(points));
	    }
	    
	    public String readScreenTitle()
	    {
	    	return(getText(screenTitle));
	    }
	    
	    public String readTimeSlot()
	    {
	    	return(getText(timeSlot));
	    }
	    
	    public void tapCloseScreen()
	    {
	    	waitForVisibility(closeScreen);
	    	click(closeScreen);
	    }
	    
	    public String readLocationDesc()
	    {
	    	return(getText(locationDesc));
	    }
	    
	    public String readBrandModel()
	    {
	    	return(getText(brandModel));
	    }
	    
	    public void tapAllowCalls()
	    {
	    	waitForVisibility(allowCalls);
	    	click(allowCalls);
	    }
	    
	  public void tapRTAParking()
	  {
		    waitForVisibility(rtaParking);
	    	click(rtaParking);
	  }
	
}
