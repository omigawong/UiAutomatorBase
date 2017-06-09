package com.eco.uidevice;

import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class TestUiDevicePress01 extends UiAutomatorTestCase {
	public void testDevice(){
//		UiDevice.getInstance().pressHome();
//		getUiDevice().pressHome();在封装方法和调用时会出现空指针异常
//		
		TestUiDevicePress02 d2 = new TestUiDevicePress02();
		d2.press();
	}
	public static void main (String args[]){
		
		String jarName,testClass,testName,androidId;
		jarName = "Demo"; 
		testClass = "com.eco.Demo";
		testName = "testDevice";
		androidId = "3";
		
		
		new UiAutomatorHelper(jarName,testClass,testName,androidId);
	}
}

