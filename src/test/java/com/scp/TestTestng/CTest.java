package com.scp.TestTestng;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.scp.my.report.AppTestReportGenerator;

@Listeners(AppTestReportGenerator.class)
public class CTest {

	@Test(priority=2)
	public void abcctest(){
		System.out.println("inside abc c test");
	}
	
	
	@Test(priority=1)
	public void axyzctest(){
		System.out.println("inside axyz c test");
	}
	
	@Test()
	public void azeyrctest(){
		System.out.println("------inside azey------------------------");
		String a=null;
		//a.charAt(1);
	}
	
	@Test
	public void aZryactest(){
		System.out.println("inside zry c test");
	}
	
}
