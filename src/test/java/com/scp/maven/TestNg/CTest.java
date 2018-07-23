package com.scp.maven.TestNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CTest {

	@Test
	public void cAb1(){
		System.out.println("---in cAb1---");
	}
	@AfterMethod
	public void cabc(){
		System.out.println("---in cabc---");
	}
	@BeforeMethod
	public void caabc(){
		System.out.println("--in caabc---");
	}
}
