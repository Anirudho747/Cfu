package testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import bs.BaseClass;
import testScreens.HomeScreen;
import testScreens.FuelDeliveryScreen;
import testScreens.TimeSlotScreen;
import testScreens.TyreChangeScreen;
import utilFiles.Utility;
import testScreens.CarWashOptionsScreen;

public class Login_ChangeAddress extends BaseClass{
	
	HomeScreen hp;
	Utility util;
	TimeSlotScreen tss;
	FuelDeliveryScreen fds;
	CarWashOptionsScreen cwos;
	TyreChangeScreen tcc;
	
	 @BeforeClass
	    public void beforeClass()
	    {
	        hp = new HomeScreen();
	        util = new Utility();
	        tss = new TimeSlotScreen();
	        fds = new FuelDeliveryScreen();
	        cwos = new CarWashOptionsScreen();
	        tcc = new TyreChangeScreen();
	    }
	    
	    @Test(priority=1)
	    public void logInAndSetLocation()
	    {	
	    	util.logIn();
	    	util.setAddress("Satwa Bus ");
	    }

	    @Test(priority=2,dependsOnMethods="logInAndSetLocation",enabled=false)
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
	    
	    @Test(priority=3,dependsOnMethods="logInAndSetLocation",enabled=false)
	    public void bookCarWash()
	    {
	    	hp.tapCarWash();
	    	cwos.tapClassicCleanInterior();
	    	cwos.tapConfirmWash();
	    	tss.selectDate();
	    	tss.selectCarWashTime();
	    	tss.tapCheckOut();
	    	fds.tapRTAParking();
	    	fds.tapWelcomeArrow();
	    	Assert.assertEquals(fds.readFuelType(),"Classic Clean + Interior - AED 55.00");
	//    	Assert.assertEquals(fds.readMinOrder(),"Friendly reminder that the minimum amount per order is AED 60.");
	    	Assert.assertEquals(fds.readPoints(),"You'll earn 1047 points with this order");
	    	Assert.assertEquals(fds.readScreenTitle(),"Car Wash");
	    	System.out.println(fds.readTimeSlot());
	    	Assert.assertEquals(fds.readBrandModel(),"BMW 3-Series - N 20505 Dubai");
	    	Assert.assertEquals(fds.readLocationDesc(),"دبي - United Arab Emirates");
	 //   	fds.tapAllowCalls();
	 //   	fds.tapCloseScreen();
	    }
	    
	    @Test(priority=3,dependsOnMethods="logInAndSetLocation",enabled=false)
	    public void readCarWashDetails()
	    {
	    	hp.tapCarWash();
	    	Assert.assertEquals(cwos.readClassicCleanInteriorPrice(),"AED 55.00");
	    	Assert.assertEquals(cwos.readClassicCleanInteriorTime(),"60 - 70 minutes");
	    	Assert.assertEquals(cwos.readClassicCleanPrice(),"AED 35.00");
	    	Assert.assertEquals(cwos.readClassicCleanTime(),"35 - 50 minutes");
	    	Assert.assertEquals(cwos.readPremiumPrice(),"AED 109.00");
	    	Assert.assertEquals(cwos.readPremiumTime(),"55 - 70 minutes");
	    	Assert.assertEquals(cwos.readPressureWashPrice(),"AED 69.00");
	    	Assert.assertEquals(cwos.readPressureWashTime(),"30 - 40 minutes");
	    	System.out.println(cwos.readConfirmWash());
	    }
	    
	    @Test(priority=4,dependsOnMethods="logInAndSetLocation",enabled=true)
	    public void readTyreChangeDetails()
	    {
	    	hp.tapTyres();
	    	tcc.tapGetStarted();
	    	tcc.enterW1("2");
	    	tcc.enterW2("3");
	    	tcc.enterW3("5");
	    	tcc.enterP1("6");
	    	tcc.enterP2("5");
	    	tcc.enterR1("1");
	    	tcc.enterR2("7");
	    	Assert.assertEquals(tcc.readTyreSize(),"235/65 R17");
	    	
	    }
}
