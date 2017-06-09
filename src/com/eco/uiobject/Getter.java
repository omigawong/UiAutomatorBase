package com.eco.uiobject;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class Getter extends UiAutomatorTestCase {
	//get可以获取对象信息
	public void testGet() throws UiObjectNotFoundException{
		
		UiObject input = new UiObject(new UiSelector().resourceId("com.android.mms:id/recipients_editor"));
		
		String rec = input.getText();
		
		System.out.println("HINT"+rec);
		assertEquals("To",rec);
		
	}
	
	public void testGetChild() throws UiObjectNotFoundException{
		
		UiObject down = new UiObject(new UiSelector().resourceId("com.cyanogenmod.filemanager:id/navigation_view_details_item").index(3));
		
		UiObject download = down.getChild(new UiSelector().resourceId("com.cyanogenmod.filemanager:id/navigation_view_item_name"));
		
		download.click();
		sleep(1000); 
		
		UiDevice.getInstance().pressBack();
		sleep(1000);
		
		UiObject music = down.getFromParent(new UiSelector().resourceId("com.cyanogenmod.filemanager:id/navigation_view_details_item").index(5));
		
		music.click();
	}
	
	public void testChecked() throws UiObjectNotFoundException{
		
		UiObject wlan = new UiObject(new UiSelector().resourceId("com.android.settings:id/switch_widget"));
			
			if (!wlan.isChecked()){
				
				wlan.click();
			}
			
		
	}
	
//public static void main (String args[]){
//		
//		String jarName,testClass,testName,androidId;
//		jarName = "Getter"; 
//		testClass = "com.eco.uiobject.Getter";
//		testName = "testChecked";
//		androidId = "3";
//		
//		
//		new UiAutomatorHelper(jarName,testClass,testName,androidId);
//	}
}
