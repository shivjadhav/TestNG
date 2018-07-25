package com.scp.maven.TestNg;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.scp.my.report.AppTestReportGenerator;

@Listeners(AppTestReportGenerator.class)
public class ATest {

	@BeforeSuite
	public void beforesuite(){
		String fileName = System.getProperty("fileName");
		System.out.println("User has given this param -- " + fileName);
		System.out.println("inside before suite");
	}
	
	
	@Test(dependsOnMethods={"m2"})   //,successPercentage=30,invocationCount=10
	public void m1(){
		System.out.println("inside m1");
	}
	
	@Test
	public void m2(){
		System.out.println("inside m2");
		Assert.fail("This test case is failed...!");
	}
	
	
	
	@Test(groups={"smoke","abc"})
	public void abctest(){
		System.out.println("inside abc test");
	}
	
	//Skip
	
	
	@Test(priority=1)
	public void axyztest(){
		System.out.println("inside axyz test");
	}
	
	@Test(groups={"A","smoke"})
	public void apqertest(){
		System.out.println("inside ap test");
	}
	
	@Test(groups={"abc","smoke"})
	public void azeyrtest(){
		System.out.println("inside aze test");
	}
	
	
	@Test
	public void aZryatest(){
		System.out.println("inside zry test");
	}
	
}
