package com.eco.uiobject;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class ClickAndLongPress extends UiAutomatorTestCase {
	UiObject clock = new UiObject(new UiSelector().resourceId("com.android.deskclock:id/analog_appwidget"));
	
	public void testClick() throws UiObjectNotFoundException{
		
		//以下为演示几种的点击方法
		clock.click();
		 sleep(2000);
		  UiDevice.getInstance().pressBack();
		  
		clock.clickAndWaitForNewWindow(); 
		  sleep(2000);
		UiDevice.getInstance().pressBack();
		 sleep(1000);
		 
		clock.clickAndWaitForNewWindow(3000);
		  sleep(2000);
		  UiDevice.getInstance().pressBack();
		  sleep(1000);
		  
		clock.clickBottomRight();
		 sleep(2000);
		  UiDevice.getInstance().pressBack();
		  sleep(1000);
		  
		  clock.clickTopLeft();
		  sleep(2000);
		  UiDevice.getInstance().pressBack();
		  sleep(1000);
	}
	
	public void testLongClick() throws UiObjectNotFoundException  {
		
		
		clock.longClick();
		
		sleep(3000);
		
		UiDevice.getInstance().swipe(730,870, 731, 871, 500);
	}
	
	
	
//public static void main (String args[]){
//		
//		String jarName,testClass,testName,androidId;
//		jarName = "ClickAndLongPress"; 
//		testClass = "com.eco.uiobject.ClickAndLongPress";
//		testName = "testLongClick";
//		androidId = "3";
//		
//		
//		new UiAutomatorHelper(jarName,testClass,testName,androidId);
//	}
}
