package com.eco.uiobject;

import com.android.uiautomator.testrunner.UiAutomatorTestCase;
import com.eco.uidevice.UiAutomatorHelper;

public class Test extends UiAutomatorTestCase {
public static void main (String args[]){
		
		String jarName,testClass,testName,androidId;
		jarName = "Exists"; 
		testClass = "com.eco.uiobject.Exists";
		testName = "testExists";
		androidId = "3";
		
		
		new UiAutomatorHelper(jarName,testClass,testName,androidId);
	}
}
