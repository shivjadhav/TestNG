package com.scp.maven.TestNg;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class BTest {
	
 @Test
 public void B(){
	 SoftAssert sAssert=new SoftAssert();
		sAssert.assertTrue(2>1);
		System.out.println("Assertion failed");
		sAssert.assertFalse(1<2);
		System.out.println("Assertion failed");
		
		
		sAssert.assertAll();
 }
		
}
