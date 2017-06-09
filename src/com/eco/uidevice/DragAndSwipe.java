package com.eco.uidevice;

import android.graphics.Point;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class DragAndSwipe extends UiAutomatorTestCase {
	
	public void testDrag(){
	//[331,2103][568,2373]
	int startX,startY,endX,endY,steps;
	startX = (568-331)/2+331;
	startY = (2373-2103)/2+2103;
	endX = startX;
	endY = startY-500;
	steps =50;
	
	UiDevice.getInstance().drag(startX,startY,endX,endY,steps);
	}
	
	public void testSwip(){
		int h = UiDevice.getInstance().getDisplayHeight();
		int w = UiDevice.getInstance().getDisplayWidth();
		
		UiDevice.getInstance().swipe(w-50, h/2,50,h/2,10);
			
	}
	
	public void testPointSwipe(){
		//347,685    978,629,  1153,1531  ,384,1483  
		
		Point p1 = new Point();
		Point p2 = new Point();
		Point p3 = new Point();
		Point p4 = new Point();
		Point p5 = new Point();
		
		
		p1.x = 347; p1.y = 685;
		p2.x = 978; p2.y = 629;
		p3.x = 1153; p3.y = 1531;
		p4.x = 385; p4.y = 1483;
		p5.x = 347; p5.y =685;
		Point[] pp = {p1,p2,p3,p4,p5};
		
		UiDevice.getInstance().swipe(pp, 30);

		
				
	}
		
		
		
	
public static void main (String args[]){
		
		String jarName,testClass,testName,androidId;
		jarName = "Demo"; 
		testClass = "com.eco.DragAndSwipe";
		testName = "testPointSwipe";
		androidId = "3";
		
		
		new UiAutomatorHelper(jarName,testClass,testName,androidId);
	}
}

