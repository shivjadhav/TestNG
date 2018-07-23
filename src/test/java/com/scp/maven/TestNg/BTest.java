package com.scp.maven.TestNg;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BTest {

	@Test
	@BeforeTest
	public void bAb1(){
		System.out.println("---@AfterTest in bAb1---");
	}
	@Test 
	public void bab(){
		System.out.println("---regression in b class---");
	}
	@Test
	public void baab(){
		System.out.println("--@BeforeTest in baab---");
	}
}
