package com.eco.uiselector;

import com.android.uiautomator.testrunner.UiAutomatorTestCase;
import com.eco.uidevice.UiAutomatorHelper;

public class Test extends UiAutomatorTestCase {
public static void main (String args[]){
		
		String jarName,testClass,testName,androidId;
		jarName = "IndexAndInstance"; 
		testClass = "com.eco.uiselector.IndexAndInstance";
		testName = "testIndexAndInstance";
		androidId = "3";
		
		
		new UiAutomatorHelper(jarName,testClass,testName,androidId);
	}
}
