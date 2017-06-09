package com.eco.uiobject;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class Exists extends UiAutomatorTestCase {
	
	public void testExists() throws UiObjectNotFoundException{
		
	UiDevice.getInstance().pressHome();
	sleep(3000);
	
	UiObject contacts = new UiObject(new UiSelector().text("Contacts"));

		if (contacts.exists()){
		  contacts.click();
		}
		
	UiObject creat = new UiObject(new UiSelector().className("android.view.View").index(3));
	
	if (!creat.waitForExists(5000)){
		
		System.out.println("没有联系人");
		
	    UiObject add = new UiObject(new UiSelector().resourceId("com.android.contacts:id/floating_action_button"));
		
		add.click();
		
		
	}
	
	}
	
}
