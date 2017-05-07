package com.Assert;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VlaidationAssert {

	
	@Test
	public void checkHardAssert(){
	
		System.out.println("Test 1 started");
		Assert.assertEquals(12, 13,"the values are not equal");
	
		
		System.out.println("Test 1 completes");
		
	}
	
	
	@Test
	public void checkSoftAssert(){
		
		System.out.println("Test 2 started");
		SoftAssert assert1=new SoftAssert();
		assert1.assertEquals(12, 13, "numbers not equal");
		
		System.out.println("Test 2 completes");
		
		assert1.assertAll();
		
	}
	
}
