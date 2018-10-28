package com.java.samplejavacodes;

import java.util.Scanner;

public class CircularString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "abcd";
		//String str2 = new String();
		
		System.out.println("Enrter String : ");
		Scanner scn = new Scanner(System.in);
		String str2 = scn.next();
		String str3 = str1+str1;
		
		if(str1.length() != str2.length())
		{
			System.out.println("String is not circular equal");
		}
		else
		{
			if(str3.contains(str2))
			{
				System.out.println("Circular String");
			}
		}
		scn.close();

	}

}
