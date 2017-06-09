package com.eco.uiselector;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class Demo extends UiAutomatorTestCase {
	
	public void testContacts() throws UiObjectNotFoundException{
		
//		UiSelector l = new UiSelector().text("Contacts");//搜索条件
//		
//		UiObject contacts = new UiObject(l);//依据搜索条件找到对象
		
		//以上两行代码可以合并成下面一行
	
		UiObject contacts = new UiObject(new UiSelector().text("Contacts"));
		
		contacts.click();//操作对象
	}

}
