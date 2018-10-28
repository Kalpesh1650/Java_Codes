package com.java.samplejavacodes;

public class ReturnStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before callMe");
		callMe();
		System.out.println("after callMe");
	}
	
	public static void callMe()
	{
		System.out.println("In callMe");
		return;
	}

}
