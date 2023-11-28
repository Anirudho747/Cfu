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
	
	@AndroidFindBy(xpath="//*[@resource-id='com.mena.customer:id/tvTitle' and contains(@text,'Eco!')]")
	@iOSXCUITFindBy()
	public WebElement classicClean;
	
	@AndroidFindBy(xpath="//*[@resource-id='com.mena.customer:id/tvTitle' and contains(@text,'Popular!')]")
	@iOSXCUITFindBy()
	public WebElement premiumWash;
	
	@AndroidFindBy(xpath="//*[@resource-id='com.mena.customer:id/tvTitle' and contains(@text,'Interior')]")
	@iOSXCUITFindBy()
	public WebElement classicCleanInterior;
	
	@AndroidFindBy(xpath="//*[@resource-id='com.mena.customer:id/tvTitle' and contains(@text,'New!')]")
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

}
