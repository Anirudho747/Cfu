package testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import bs.BaseClass;
import testScreens.HomeScreen;
import testScreens.FuelDeliveryScreen;
import testScreens.TimeSlotScreen;
import utilFiles.Utility;

public class Login_ChangeAddress extends BaseClass{
	
	HomeScreen hp;
	Utility util;
	TimeSlotScreen tss;
	FuelDeliveryScreen fds;
	
	 @BeforeClass
	    public void beforeClass()
	    {
	        hp = new HomeScreen();
	        util = new Utility();
	        tss = new TimeSlotScreen();
	        fds = new FuelDeliveryScreen();
	    }
	    
	    @Test(priority=1)
	    public void logInAndSetLocation()
	    {	
	    	util.logIn();
	    	util.setAddress("Satwa Bus");
	    }

	    @Test(priority=2,dependsOnMethods="logInAndSetLocation")
	    public void bookFuel()
	    {
	    	hp.tapFuel();
	    	tss.selectDate();
	    	tss.selectTime();
	    	tss.tapCheckOut();
	//    	fds.tapWelcomeArrow();
	    	Assert.assertEquals(fds.readFuelType(),"Special 95 - Full Tank");
	    	Assert.assertEquals(fds.readMinOrder(),"Friendly reminder that the minimum amount per order is AED 60.");
	    	Assert.assertEquals(fds.readPoints(),"You'll earn upto 1200 points with this order");
	    	Assert.assertEquals(fds.readScreenTitle(),"Fuel Delivery");
	    	System.out.println(fds.readTimeSlot());
	    	Assert.assertEquals(fds.readLocationDesc(),"دبي - United Arab Emirates");
	    	fds.tapAllowCalls();
	    	fds.tapCloseScreen();
	    }
	    
	    @Test(priority=3,dependsOnMethods="logInAndSetLocation")
	    public void bookCarWash()
	    {
	    	hp.tapCarWash();
	    	tss.selectDate();
	    	tss.selectCarWashTime();
	    	tss.tapCheckOut();
	//    	fds.tapWelcomeArrow();
	    	fds.tapRTAParking();
	    	Assert.assertEquals(fds.readFuelType(),"Classic Clean + Interior - AED 55.00");
	//    	Assert.assertEquals(fds.readMinOrder(),"Friendly reminder that the minimum amount per order is AED 60.");
	    	Assert.assertEquals(fds.readPoints(),"You'll earn upto 1047 points with this order");
	    	Assert.assertEquals(fds.readScreenTitle(),"Classic Clean + Interior");
	    	System.out.println(fds.readTimeSlot());
	    	System.out.println(fds.readBrandModel());
	    	Assert.assertEquals(fds.readLocationDesc(),"دبي - United Arab Emirates");
	 //   	fds.tapAllowCalls();
	    	fds.tapCloseScreen();
	    }
}
