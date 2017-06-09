package com.eco.uidevice;

import java.io.File;

import android.os.RemoteException;
import android.view.KeyEvent;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class UiDeviceDemo extends UiAutomatorTestCase {
	//灭屏-亮屏-解锁-打开浏览器-输入网址-按回车-旋转屏幕-截图
	public void testUideviceDemo() throws RemoteException{
		
	UiDevice.getInstance().sleep();
	sleep(1000);
	
	if (!UiDevice.getInstance().isScreenOn()){
		UiDevice.getInstance().wakeUp();
		
		sleep(1000);
	}
	
	UiDevice.getInstance().swipe(720, 2392, 720, 1186, 30);
	sleep(2000);
	UiDevice.getInstance().pressHome();
	sleep(1000);
	
	UiDevice.getInstance().click(1220, 2250);
	sleep(2000);
	
	UiDevice.getInstance().click(596, 184);
	sleep(1000);
	
	UiDevice.getInstance().pressKeyCode(KeyEvent.KEYCODE_W);
	sleep(500);
	UiDevice.getInstance().pressKeyCode(KeyEvent.KEYCODE_W);
	sleep(500);
	UiDevice.getInstance().pressKeyCode(KeyEvent.KEYCODE_W);
	sleep(500);
	UiDevice.getInstance().pressKeyCode(KeyEvent.KEYCODE_PERIOD);
	sleep(500);
	UiDevice.getInstance().pressKeyCode(KeyEvent.KEYCODE_B);
	sleep(500);
	UiDevice.getInstance().pressKeyCode(KeyEvent.KEYCODE_A);
	sleep(500);
	UiDevice.getInstance().pressKeyCode(KeyEvent.KEYCODE_I);
	sleep(500);
	UiDevice.getInstance().pressKeyCode(KeyEvent.KEYCODE_D);
	sleep(500);
	UiDevice.getInstance().pressKeyCode(KeyEvent.KEYCODE_U);
	sleep(500);
	UiDevice.getInstance().pressKeyCode(KeyEvent.KEYCODE_PERIOD);
	sleep(500);
	UiDevice.getInstance().pressKeyCode(KeyEvent.KEYCODE_C);
	sleep(500);
	UiDevice.getInstance().pressKeyCode(KeyEvent.KEYCODE_O);
	sleep(500);
	UiDevice.getInstance().pressKeyCode(KeyEvent.KEYCODE_M);
	sleep(500);
	
	UiDevice.getInstance().pressEnter();
	sleep(3000);
	
	UiDevice.getInstance().setOrientationLeft();
	sleep(2000);
	
	UiDevice.getInstance().takeScreenshot(new File ("/sdcard/browser.png"));
	sleep(2000);

}
public static void main (String args[]){
		
		String jarName,testClass,testName,androidId;
		jarName = "UiDeviceDemo"; 
		testClass = "com.eco.UiDeviceDemo";
		testName = "testUideviceDemo";
		androidId = "3";
		
		
		new UiAutomatorHelper(jarName,testClass,testName,androidId);
	}
}