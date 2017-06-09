package com.eco.uiselector;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class Description extends UiAutomatorTestCase {
	
	public void testDesc() throws UiObjectNotFoundException{
		UiSelector selector = new UiSelector().description("Apps");//完全匹配
		//以下是另外三种匹配方式
		//UiSelector selector = new UiSelector().descriptionContains("");  //包含匹配
		//UiSelector selector = new UiSelector().descriptionMatches("");//正则匹配
		//UiSelector selector new UiSelector().descriptionStartsWith("");//起始匹配
		UiObject object = new UiObject(selector);
		
		object.click();
	}
	

}
