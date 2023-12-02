package testScreens;

import org.openqa.selenium.WebElement;
import bs.BaseClass;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class CarWashOptionsScreen extends BaseClass{
	
	@AndroidFindBy(id="ivClose")
	@iOSXCUITFindBy(id="l")
	public WebElement closeScreen;
	
	@AndroidFindBy(id="ivDropdown")
	@iOSXCUITFindBy()
	public WebElement minimizeButton;
	
	@AndroidFindBy(xpath="//*[@resource-id='com.mena.customer:id/tvTitle' and contains(@text,'Classic Clean') and not(contains(@text,'Classic Clean +'))]")
	@iOSXCUITFindBy()
	public WebElement classicClean;
	
	@AndroidFindBy(xpath="//*[@resource-id='com.mena.customer:id/tvTitle' and contains(@text,'Premium')]")
	@iOSXCUITFindBy()
	public WebElement premiumWash;
	
	@AndroidFindBy(xpath="//*[@resource-id='com.mena.customer:id/tvTitle' and contains(@text,'Classic Clean +')]")
	@iOSXCUITFindBy()
	public WebElement classicCleanInterior;
	
	@AndroidFindBy(xpath="//*[@resource-id='com.mena.customer:id/tvTitle' and contains(@text,'Pressure')]")
	@iOSXCUITFindBy()
	public WebElement pressureWash;
	
	@AndroidFindBy(xpath="(//*[@resource-id='com.mena.customer:id/tvDiscountedPrice'])[1]")
	@iOSXCUITFindBy()
	public WebElement classicCleanPrice;
	
	@AndroidFindBy(xpath="(//*[@resource-id='com.mena.customer:id/tvDiscountedPrice'])[2]")
	@iOSXCUITFindBy()
	public WebElement premiumWashPrice;
	
	@AndroidFindBy(xpath="(//*[@resource-id='com.mena.customer:id/tvDiscountedPrice'])[3]")
	@iOSXCUITFindBy()
	public WebElement classicCleanInteriorPrice;
	
	@AndroidFindBy(xpath="(//*[@resource-id='com.mena.customer:id/tvDiscountedPrice'])[4]")
	@iOSXCUITFindBy()
	public WebElement pressureWashPrice;
	
	@AndroidFindBy(xpath="(//*[@resource-id='com.mena.customer:id/tvTime'])[1]")
	@iOSXCUITFindBy()
	public WebElement classicCleanTime;
	
	@AndroidFindBy(xpath="(//*[@resource-id='com.mena.customer:id/tvTime'])[2]")
	@iOSXCUITFindBy()
	public WebElement premiumWashTime;
	
	@AndroidFindBy(xpath="(//*[@resource-id='com.mena.customer:id/tvTime'])[3]")
	@iOSXCUITFindBy()
	public WebElement classicCleanInteriorTime;
	
	@AndroidFindBy(xpath="(//*[@resource-id='com.mena.customer:id/tvTime'])[4]")
	@iOSXCUITFindBy()
	public WebElement pressureWashTime;
	
    @AndroidFindBy(id = "lActiveOrder")
    @iOSXCUITFindBy(id="l")
    public WebElement confirmWash;
    
    public void tapClassicCleanInterior()
    {
    	waitForVisibility(classicCleanInterior);
    	click(classicCleanInterior);
    }
    
    public void tapClassicClean()
    {
    	waitForVisibility(classicClean);
    	click(classicClean);
    }
    
    public void tapPremiumWash()
    {
    	waitForVisibility(premiumWash);
    	click(premiumWash);
    }
    
    public void tapPressureWash()
    {
    	waitForVisibility(pressureWash);
    	click(pressureWash);
    }
    
    public void tapConfirmWash()
    {
    	waitForVisibility(confirmWash);
    	click(confirmWash);
    }
    
    public String readClassicCleanPrice()
    {
    	return(getText(classicCleanPrice));
    }
    
    public String readClassicCleanInteriorPrice()
    {
    	return(getText(classicCleanInteriorPrice));
    }
    
    public String readPremiumPrice()
    {
    	return(getText(premiumWashPrice));
    }
    
    public String readPressureWashPrice()
    {
    	return(getText(pressureWashPrice));
    }
    
    public String readClassicCleanTime()
    {
    	return(getText(classicCleanTime));
    }
    
    public String readClassicCleanInteriorTime()
    {
    	return(getText(classicCleanInteriorTime));
    }
    
    public String readPremiumTime()
    {
    	return(getText(premiumWashTime));
    }
    
    public String readPressureWashTime()
    {
    	return(getText(pressureWashTime));
    }
    
    public String readConfirmWash()
    {
    	return(getText(confirmWash));
    }

}
