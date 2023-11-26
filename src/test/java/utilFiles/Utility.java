package utilFiles;

import bs.BaseClass;
import testScreens.HomeScreen;

public class Utility extends BaseClass{
	
	HomeScreen hp;

	public Utility()
	{
	    hp= new HomeScreen();
	}
	
	public void logIn()
	{
		hp.clickLoginButton();
    	hp.enterMobileNumber("529955465");
    	hp.clickGetStarted();
    	hp.enterPassword("Sample*87");
    	hp.clickShowPassword();
    	hp.clickSignInButton();
	}
	
	public void setAddress(String addr)
	{
		hp.clickNotifyWhenSupportedButton();
    	hp.clickNotifyWhenSupported2Button();
    	hp.clickLocationHeader();
    	hp.enterAddress(addr);
    	hp.selectLocation();
    	hp.tapConfirmLocation();
    	hp.tapConfirmParkingDetails();

	}
	
}
