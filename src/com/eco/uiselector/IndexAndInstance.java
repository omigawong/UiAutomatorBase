package com.eco.uiselector;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class IndexAndInstance extends UiAutomatorTestCase {
	
	public void testIndexAndInstance() throws UiObjectNotFoundException{
		
		UiSelector selector = new UiSelector().className("android.widget.ImageButton").index(0);
		
		UiObject object = new UiObject(selector);
		
		object.click();
		
	}

}
