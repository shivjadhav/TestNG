package com.scp.maven.TestNg;

import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class TestLog4j {

	public static Logger logger=Logger.getLogger(TestLog4j.class);
	
	public static void main(String[] args) throws InterruptedException,SQLException {
		
		logger.setLevel(Level.INFO);
		
		for(int i=0;i<=10;i++){
		logger.fatal("This is fatal msg");
		logger.error("This is error msg");
		logger.warn("This is warn msg");
		logger.info("This is info msg");
		logger.debug("This is debug msg");
		logger.trace("This is trace msg");
		
		TimeUnit.SECONDS.sleep(20);
		}
	}
}
