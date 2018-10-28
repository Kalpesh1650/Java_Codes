package com.java.io;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LoggerWithLog4J {

	static Logger log = Logger.getLogger(LoggerWithLog4J.class.getName());
	
	public static void main(String[] args) {
		

	    PropertyConfigurator.configure(LoggerWithLog4J.getLog4jProperties());
		//org.apache.log4j.BasicConfigurator.configure();
		//org.apache.log4j.PropertyConfigurator.configure(file\D:\\Languages\\EclipseMarsWorkspace\\JavaCodes\\src\\com\\java\\io\\log4j.properties);
		log.debug("** Debug message **");
		log.info("** Info Message **");
		log.info("** Info Message1 **");
		log.fatal(new LoggerWithLog4J());
		
		//LoggerWithLog4J l1 = new LoggerWithLog4J();
	}
	
	public static Properties getLog4jProperties(){
		
		Properties properties=new Properties();
	    properties.setProperty("log4j.rootLogger","TRACE,stdout,MyFile");
	    properties.setProperty("log4j.rootCategory","TRACE");

	    properties.setProperty("log4j.appender.stdout",     "org.apache.log4j.ConsoleAppender");
	    properties.setProperty("log4j.appender.stdout.layout",  "org.apache.log4j.PatternLayout");
	    properties.setProperty("log4j.appender.stdout.layout.ConversionPattern","%d{yyyy/MM/dd HH:mm:ss.SSS} [%5p] %t (%F) - %m%n");

	    properties.setProperty("log4j.appender.MyFile", "org.apache.log4j.RollingFileAppender");
	    properties.setProperty("log4j.appender.MyFile.Append","false");
	    properties.setProperty("log4j.appender.MyFile.File", "my_example.log");
	    properties.setProperty("log4j.appender.MyFile.MaxFileSize", "100KB");
	    properties.setProperty("log4j.appender.MyFile.MaxBackupIndex", "1");
	    properties.setProperty("log4j.appender.MyFile.layout",  "org.apache.log4j.PatternLayout");
	    properties.setProperty("log4j.appender.MyFile.layout.ConversionPattern","%d{yyyy/MM/dd HH:mm:ss.SSS} [%5p] %t (%F) - %m%n");
		return properties;
	}

}
