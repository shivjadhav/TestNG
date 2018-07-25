package com.scp.TestTestng;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.scp.my.report.AppTestReportGenerator;
import com.scp.my.report.Retry;

@Listeners(AppTestReportGenerator.class)
public class DTest {

	static int count =0;

	@Test(retryAnalyzer=Retry.class)  
	public void abcDtest(){
		System.out.println("inside abc D test");
		/*if(count!=1){
			count++;
			int i=10/0;
		}else{
			
		}*/
		
	}

	@Test(priority=1)
	public void axyzDtest(){
		System.out.println("inside axyz D test");
	}
	
	
	@Test
	public void apqerDtest(){
		System.out.println("inside ap D test");
	}
	
	@Test
	public void azeyrDtest(){
		System.out.println("inside aze D test");
	}
	
	
	@Test
	public void aZryaDtest(){
		System.out.println("inside zry D test");
	}
	
	@Test(groups={"smoke","d"})
	public void aD1test(){
		System.out.println("inside ad1 D test");
	}
	
}
