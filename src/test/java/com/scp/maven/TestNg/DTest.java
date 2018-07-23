package com.scp.maven.TestNg;

import org.testng.annotations.Test;

public class DTest {

	@Test(alwaysRun=true)
	public void dAb1(){
		System.out.println("---alway run ---");
	}
	@Test 
	public void dAbd(){
		System.out.println("-- @Test(dependsOnGroups-in dAbb---");
	}
	@Test
	public void dadab(){
		System.out.println("--@Test(dependsOnGroups regression in dadab---");
	}
}

