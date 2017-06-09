package com.eco.uidevice;
// 打开浏览器，输入网址浏览
import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class TestBrower extends UiAutomatorTestCase {
	public void testDemo() throws UiObjectNotFoundException{
		UiDevice.getInstance().pressHome();//按Home回到主界面
		UiObject browserObject = new UiObject (new UiSelector().text("Browser"));//获取浏览器图标对象
		browserObject.clickAndWaitForNewWindow();//点击并等待获取新窗口
		UiObject editObject = new UiObject (new UiSelector().className("android.widget.EditText"));//进入浏览器取得编辑框对象
		editObject.click();//点击编辑框
		UiDevice.getInstance().pressDelete();//删除编辑框内容
		editObject.setText("www.baidu.com");//输入新的网址
		UiDevice.getInstance().pressEnter();//回车载入新网址
		sleep(2000);//等待2S
		
	}
	
	public static void main (String args[]){
		String jarName = "TestBrower";
		String testClass = "com.eco.TestBrower";
		String testName = "testDemo";
		String androidId = "3";
		
		new UiAutomatorHelper (jarName,testClass,testName,androidId);
	}
	
}
