package com.test.site;



import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.SwipeElementDirection;



public class HomePageTest6 extends UserBaseTest{


	@Test
    public void testMethodTwelve_12() throws Exception  {
		
		System.out.println("ThreadName: " + Thread.currentThread().getName() + Thread.currentThread().getStackTrace()[1].getClassName());
		if(getDriver().findElements(By.id("com.android2.calculator3:id/cling_dismiss")).size() > 0){
			getDriver().findElement(By.id("com.android2.calculator3:id/cling_dismiss")).click();
		}
		getDriver().findElement(By.id("com.android2.calculator3:id/digit3")).click();
		getDriver().findElement(By.id("com.android2.calculator3:id/minus")).click();
		getDriver().findElement(By.id("com.android2.calculator3:id/digit9")).click();
		MobileElement el = getDriver().findElement(By.id("com.android2.calculator3:id/equal"));
	    el.swipe(SwipeElementDirection.LEFT, 10000);
    }
}
