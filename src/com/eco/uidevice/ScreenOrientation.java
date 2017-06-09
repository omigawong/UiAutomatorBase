package com.eco.uidevice;

import android.os.RemoteException;
import android.view.Surface;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class ScreenOrientation extends UiAutomatorTestCase {
	
	public void testScreenOrientation() throws RemoteException{
		UiDevice.getInstance().setOrientationLeft();//向左转
		UiDevice.getInstance().setOrientationRight();//屏幕向右转
		
		if(UiDevice.getInstance().isNaturalOrientation()){
			UiDevice.getInstance().setOrientationLeft();
			UiDevice.getInstance().setOrientationRight();//先判断屏幕是否为自然位置然后再旋转
			
		}
		int a = UiDevice.getInstance().getDisplayRotation();//先取得屏幕方向
		
		if (a == Surface.ROTATION_0 ){
			UiDevice.getInstance().setOrientationLeft();// a = 0,操作
		}

		if (a == Surface.ROTATION_90 ){
			UiDevice.getInstance().setOrientationLeft();//a = 90,操作
		}
		if (a == Surface.ROTATION_180 ){
			UiDevice.getInstance().setOrientationLeft();//a = 180,操作
		}
		if (a == Surface.ROTATION_270 ){
			UiDevice.getInstance().setOrientationLeft();//a = 270,操作
		}
	}

}
