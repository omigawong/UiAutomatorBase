package com.eco.uidevice;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class TestUiDevicePress02 extends UiAutomatorTestCase {
	public void press(){
//		getUiDevice().pressMenu();
//		getUiDevice().pressHome();
		UiDevice.getInstance().pressMenu();
		UiDevice.getInstance().pressHome();
		
	}

}
