package com.java.samplejavacodes;

public class Reflection {
	public String className = this.getClass().getName();
	
	public String getClassName(){
		return className;
	}
}
 class Refelction1 extends Reflection{
	// public String className = this.getClass().getName();
	 public String getClassName(){
			return className;
		}
	 
 }
 
 class Caller{
	 Reflection rf = new Reflection();
	 Reflection rf1 = new Refelction1();
	 
 }