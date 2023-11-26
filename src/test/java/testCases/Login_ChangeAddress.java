package testCases;

import java.lang.reflect.Method;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import bs.BaseClass;
import testScreens.HomeScreen;
import utilFiles.Utility;

public class Login_ChangeAddress extends BaseClass{
	
	HomeScreen hp;
	Utility util;
	
	 @BeforeClass
	    public void beforeClass()
	    {
	        hp = new HomeScreen();
	        util = new Utility();
	    }
	    
	    @Test
	    public void logInAndSetLocation()
	    {	
	    	util.logIn();
	    	util.setAddress("Satwa Bus");
	    }

}
