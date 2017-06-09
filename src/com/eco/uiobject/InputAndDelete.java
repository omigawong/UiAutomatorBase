package com.eco.uiobject;

import android.view.KeyEvent;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class InputAndDelete extends UiAutomatorTestCase {

	public void testSetText() throws UiObjectNotFoundException{
		//信息内容标记框
		UiObject edit = new UiObject(new UiSelector().resourceId("com.android.mms:id/embedded_text_editor"));
		
		edit.setText("qqwffffggh");//输入文字,模拟器短信内容输入框
		sleep(2000);
		
		edit.clearTextField();//删除文字，先长按再删除
		
	}
	
	public void testDelete() throws UiObjectNotFoundException{
		//收件人编辑框，长按删除会出错,使用逐个删除，光标移动到行首，使用Delete键删除。
		
		UiObject input = new UiObject(new UiSelector().resourceId("com.android.mms:id/recipients_editor"));//获取输入input对象
		UiObject to = new UiObject(new UiSelector().text("To"));//获取删除完成后收件人的对象元素
		input.setText("adfafadfaffafd");//输入字符
		
	UiDevice.getInstance().pressKeyCode(KeyEvent.KEYCODE_MOVE_END);//将光标移动到行尾
		while (! to.exists()){
			
			UiDevice.getInstance().pressKeyCode(KeyEvent.KEYCODE_DEL);//当收件人这个元素不存在时，逐个字符删除
		}
		
	}
//	public static void main (String args[]){
//		
//		String jarName,testClass,testName,androidId;
//		jarName = "InputAndDelete"; 
//		testClass = "com.eco.uiobject.InputAndDelete";
//		testName = "testDelete";
//		androidId = "3";
//		
//		
//		new UiAutomatorHelper(jarName,testClass,testName,androidId);
//	}
//	
}
