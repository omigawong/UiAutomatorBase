package com.eco.uiselector;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class ClassName extends UiAutomatorTestCase {
	
	public void testClassAndName() throws UiObjectNotFoundException{
		//完全匹配
		
		UiSelector selector = new UiSelector().className("android.view.View").instance(3);
		
		UiObject object = new UiObject(selector);
		//正则，
		object.click();
		
		
	}

}
