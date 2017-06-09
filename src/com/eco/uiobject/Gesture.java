package com.eco.uiobject;

import android.graphics.Point;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class Gesture extends UiAutomatorTestCase {
//手势操作方法	
	UiObject object = new UiObject(new UiSelector().resourceId("com.android.gallery3d:id/gl_root_view"));//将object定义为全局对象
	
	public void testGesture() throws UiObjectNotFoundException{
		
		object.pinchIn(80, 20);//缩小
		
		object.pinchOut(80, 20);//放大
		
		
		
	}
	
	public void testPointerGesture(){
		
		Point startPoint1,startPoint2,endPoint1,endPoint2;
		
		startPoint1 = new Point();
		startPoint2 = new Point();
		endPoint1 = new Point();
		endPoint2 = new Point();
		startPoint1.x=299;startPoint1.y=473;
		startPoint2.x=299;startPoint2.y=933;
		
		endPoint1.x=1160;endPoint1.y=347;
		endPoint2.x=1071;endPoint2.y=1271;
		
		
		object.performTwoPointerGesture(startPoint1, startPoint2, endPoint1, endPoint2, 30);
		
		
		
		//多点滑动时数组，参考UiDevice Swipe方法
		
	}
//	
//	public static void main (String args[]){
//		
//		String jarName,testClass,testName,androidId;
//		jarName = "Gesture"; 
//		testClass = "com.eco.uiobject.Gesture";
//		testName = "testPointerGesture";
//		androidId = "3";
//		
//		
//		new UiAutomatorHelper(jarName,testClass,testName,androidId);
//	}

	
}
