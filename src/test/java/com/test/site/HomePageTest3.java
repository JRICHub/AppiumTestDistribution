package com.test.site;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class HomePageTest3 extends UserBaseTest{


	@Test
	public void testMethodOne_3() {
		
		System.out.println("ThreadName: " + Thread.currentThread().getName() + Thread.currentThread().getStackTrace()[1].getClassName());
		if(getDriver().findElements(By.id("com.android2.calculator3:id/cling_dismiss")).size() > 0){
			getDriver().findElement(By.id("com.android2.calculator3:id/cling_dismiss")).click();
		}
		
		getDriver().findElement(By.id("com.android2.calculator3:id/digit42")).click();
		getDriver().findElement(By.id("com.android2.calculator3:id/minus")).click();
		getDriver().findElement(By.id("com.android2.calculator3:id/digit9")).click();
		getDriver().findElement(By.id("com.android2.calculator3:id/equal")).click();
		//getDriver().close();
	}
}
