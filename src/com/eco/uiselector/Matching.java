package com.eco.uiselector;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class Matching extends UiAutomatorTestCase {

	public void testMatching() throws UiObjectNotFoundException{
		//完全匹配
		//包含匹配
		//正则匹配，包含其他三种方式
		//起始匹配
		
		//UiSelector l = new UiSelector().text("Contacts");//完全匹配
		//UiSelector l = new UiSelector().textContains("cts");//包含匹配
		//UiSelector l = new UiSelector().textStartsWith("Con");//起始匹配
		UiSelector l = new UiSelector().textMatches(".*ac.*");//正则匹配
		
		UiObject contacts = new UiObject(l);//依据搜索条件找到对象
		
		contacts.click();//操作对象
	}
	
}
