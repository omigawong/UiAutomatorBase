package com.eco.uidevice;

import java.io.File;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class ScreenshotAndIdle extends UiAutomatorTestCase {
	
	public void testScreenshot(){
		
		UiDevice.getInstance().takeScreenshot(new File ("/sdcard/test1.png"));
	}
	
	public void testWaitIdle(){
		//[1144,2103][1381,2373],浏览器坐标
		UiDevice.getInstance().click(1220, 2250);//启动
		UiDevice.getInstance().waitForIdle(20000);//等待窗口
		
	}
	
	public void testGetPackageName(){
		
		String packageName = UiDevice.getInstance().getCurrentPackageName();
		System.out.println(packageName);
		
		UiDevice.getInstance().openNotification();
		sleep(2000);
		UiDevice.getInstance().openQuickSettings();
		
		UiDevice.getInstance().dumpWindowHierarchy("note.xml");//xml格式文件保存在/data/local/tmp/目录下，可以pull到本地查看
	}

	
public static void main (String args[]){
		
		String jarName,testClass,testName,androidId;
		jarName = "ScreenshotAndIdle"; 
		testClass = "com.eco.ScreenshotAndIdle";
		testName = "testGetPackageName";
		androidId = "3";
		
		
		new UiAutomatorHelper(jarName,testClass,testName,androidId);
	}
}
