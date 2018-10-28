package com.java.samplejavacodes;

public class Equals_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = new String("hello");
		String s2 = new String("hello");
		
		if(s1 == s2)
		{
			System.out.println("s1 == s2 --> true");
		}
		else
			System.out.println("s1 == s2 --> false");
		
		
		if("hello" == "hello")
			System.out.println("hello == hello");
		
		if("hello" == new String("hello"))
			System.out.println("hello == s1");
		
		if(s1.equals(s2))
			System.out.println("both are equals");

	}

}
