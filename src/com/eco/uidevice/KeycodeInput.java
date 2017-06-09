package com.eco.uidevice;

import android.view.KeyEvent;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class KeycodeInput extends UiAutomatorTestCase {
	public void testPress(){
		
		//UiDevice.getInstance().pressHome();//按键调用方法
		
		UiDevice.getInstance().pressKeyCode(KeyEvent.KEYCODE_A);
		UiDevice.getInstance().pressKeyCode(KeyEvent.KEYCODE_B);
		UiDevice.getInstance().pressKeyCode(KeyEvent.KEYCODE_C);
		//输入小写abc
		UiDevice.getInstance().pressKeyCode(KeyEvent.KEYCODE_A,1);
		UiDevice.getInstance().pressKeyCode(KeyEvent.KEYCODE_B,1);
		UiDevice.getInstance().pressKeyCode(KeyEvent.KEYCODE_C,1);
		
		//输入大写ABC,META key状态：所有键未被激活为0，Shift或CAPS_LOCK被激活为1，ALT被激活为2，ALT,SHIFT,CAPS_LOCK同时被激活为3
	}
public static void main (String args[]){
		
		String jarName,testClass,testName,androidId;
		jarName = "Demo"; 
		testClass = "com.eco.Demo";
		testName = "testPress";
		androidId = "3";
		
		
		new UiAutomatorHelper(jarName,testClass,testName,androidId);
	}
}
