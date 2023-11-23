package testCases;

import java.lang.reflect.Method;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import bs.BaseClass;
import testScreens.HomePage;
import utilFiles.Utility;

public class Login_ChangeAddress extends BaseClass{
	
	HomePage hp;
	Utility util;
	
	 @BeforeClass
	    public void beforeClass()
	    {
	        hp = new HomePage();
	        util = new Utility();
	    }

	 
	    
	    
	    @Test
	    public void logInAndSetLocation()
	    {
//	    	hp.clickLoginButton();
//	    	hp.enterMobileNumber("529955465");
//	    	hp.clickGetStarted();
//	    	hp.enterPassword("Sample*87");
//	    	hp.clickShowPassword();
//	    	hp.clickSignInButton();
//	    	hp.clickNotifyWhenSupportedButton();
//	    	hp.clickNotifyWhenSupported2Button();
//	    	hp.clickLocationHeader();
//	    	hp.enterAddress("Satwa Bus");
//	    	hp.selectLocation();
//	    	hp.tapConfirmLocation();
//	    	hp.tapConfirmParkingDetails();
	    	
	    	
	    	util.logIn();
	    	util.setAddress("Satwa Bus");
	    	
	    }

}
