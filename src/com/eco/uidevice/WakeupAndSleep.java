package com.eco.uidevice;

import android.os.RemoteException;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class WakeupAndSleep extends UiAutomatorTestCase {
	
	public void testWakeupAndSleep() throws RemoteException{
		
		boolean b = UiDevice.getInstance().isScreenOn();
		
		if (b == true){
			UiDevice.getInstance().sleep();
			
		}
		else{
			UiDevice.getInstance().wakeUp();
		}
		
	}
	public static void main (String args[]){
		
		String jarName,testClass,testName,androidId;
		jarName = "WakeupAndSleep"; 
		testClass = "com.eco.WakeupAndSleep";
		testName = "testWakeupAndSleep";
		androidId = "3";
		
		
		new UiAutomatorHelper(jarName,testClass,testName,androidId);
	}
}
