package testScreens;

import org.openqa.selenium.WebElement;
import bs.BaseClass;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class HomeScreen extends BaseClass{
	

	    @AndroidFindBy(id = "tvLoginBtn")
	    @iOSXCUITFindBy(id="l")
	    public WebElement loginButton;

	    @AndroidFindBy(id = "mobileNumberEditText")
	    @iOSXCUITFindBy(id="l")
	    public WebElement mobileNumber;
	    
	    @AndroidFindBy(id = "btnContinue")
	    @iOSXCUITFindBy(id="l")
	    public WebElement getStartedButton;

	    @AndroidFindBy(id = "mobilePasswordEditText")
	    @iOSXCUITFindBy(id="l")
	    public WebElement psswrd;
	    
	    @AndroidFindBy(id = "tvSignIn")
	    @iOSXCUITFindBy(id="l")
	    public WebElement signInButton;

	    @AndroidFindBy(id = "tvForgotPassword")
	    @iOSXCUITFindBy(id="l")
	    public WebElement forgotPassword;
	    
	    @AndroidFindBy(accessibility = "Show password")
	    @iOSXCUITFindBy(id="l")
	    public WebElement showPassword;
	    
	    @AndroidFindBy(id = "android:id/button2")
	    @iOSXCUITFindBy(id="l")
	    public WebElement notifyWhenAreaSupported;
	
	    @AndroidFindBy(id = "android:id/button1")
	    @iOSXCUITFindBy(id="l")
	    public WebElement notifyWhenAreaSupported2;

	    @AndroidFindBy(id = "tvLocationHeader")
	    @iOSXCUITFindBy(id="l")
	    public WebElement locationHeader;

	    @AndroidFindBy(id = "etSearch")
	    @iOSXCUITFindBy(id="l")
	    public WebElement searchLocation;
	    
	    @AndroidFindBy(xpath = "(//*[@class='android.widget.TextView'])[16]")
	    @iOSXCUITFindBy(id="l")
	    public WebElement firstLocation;
	    
	    @AndroidFindBy(id = "btnConfirm")
	    @iOSXCUITFindBy(id="l")
	    public WebElement confirmLocation;

	    @AndroidFindBy(id = "btnConfirm")
	    @iOSXCUITFindBy(id="l")
	    public WebElement confirmParkingDetails;
	    
	    @AndroidFindBy(xpath = "(//*[@resource-id='com.mena.customer:id/icon'])[1]")
	    @iOSXCUITFindBy(id="l")
	    public WebElement fuelTile;

	    @AndroidFindBy(xpath = "(//*[@resource-id='com.mena.customer:id/icon'])[2]")
	    @iOSXCUITFindBy(id="l")
	    public WebElement carWashTile;
	    
	    @AndroidFindBy(xpath = "(//*[@resource-id='com.mena.customer:id/icon'])[3]")
	    @iOSXCUITFindBy(id="l")
	    public WebElement batteryTile;
	    
	    @AndroidFindBy(xpath = "(//*[@resource-id='com.mena.customer:id/icon'])[4]")
	    @iOSXCUITFindBy(id="l")
	    public WebElement tyresTile;
	    
	    @AndroidFindBy(xpath = "(//*[@resource-id='com.mena.customer:id/icon'])[5]")
	    @iOSXCUITFindBy(id="l")
	    public WebElement engineOilTile;
	    
	    public void clickLoginButton()
	    {
	        click(loginButton);
	    }

	    public void enterMobileNumber(String mNmbr)
	    {
	        click(mobileNumber);
	        sendKeys(mobileNumber,mNmbr); 
	    }
	    
	    public void clickGetStarted()
	    {
	        click(getStartedButton);
	    }

	    public void enterPassword(String passWord)
	    {
	        click(psswrd);
	        sendKeys(psswrd,passWord);
	        
	    }
	     
	    public void clickSignInButton()
	    {
	        click(signInButton);
	    }

	    public void clicNotifyWhenAreaSupported()
	    {
	        click(notifyWhenAreaSupported);
	    }
	    
	    public void clickShowPassword()
	    {
	        click(showPassword);
	    }
	    
	    public void clickNotifyWhenSupportedButton()
	    {
	    	waitForVisibility(notifyWhenAreaSupported);
	    	click(notifyWhenAreaSupported);
	    }

	    public void clickNotifyWhenSupported2Button()
	    {
	    	waitForVisibility(notifyWhenAreaSupported2);
	    	click(notifyWhenAreaSupported2);
	    }
	    
	    public void clickLocationHeader()
	    {
	    	waitForVisibility(locationHeader);
	    	click(locationHeader);
	    }
	    
	    public void enterAddress(String locn)
	    {
	    	clear(searchLocation);
	    	sendKeys(searchLocation,locn);
	    }
	    
	    public void selectLocation()
	    {
	    	waitForVisibility(firstLocation);
	    	click(firstLocation);
	    }
	    
	    public void tapConfirmLocation()
	    {
	    	waitForVisibility(confirmLocation);
	    	click(confirmLocation);
	    }
	    
	    public void tapConfirmParkingDetails()
	    {
	    	waitForVisibility(confirmParkingDetails);
	    	click(confirmParkingDetails);
	    }

	    public void tapFuel()
	    {
	    	waitForVisibility(fuelTile);
	    	click(fuelTile);
	    }
	    
	    public void tapCarWash()
	    {
	    	waitForVisibility(carWashTile);
	    	click(carWashTile);
	    }
	    
	    public void tapBattery()
	    {
	    	waitForVisibility(batteryTile);
	    	click(batteryTile);
	    }
	    
	    public void tapTyres()
	    {
	    	waitForVisibility(tyresTile);
	    	click(tyresTile);
	    }
	    
	    public void tapEngineOil()
	    {
	    	waitForVisibility(engineOilTile);
	    	click(engineOilTile);
	    }
}
