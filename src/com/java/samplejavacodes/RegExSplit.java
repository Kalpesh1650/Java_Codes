package com.java.samplejavacodes;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Pattern p = Pattern.compile("\\w");
		String input = "This4isString5split66demo";
		
		String[] tokens = p.split(input);
		
		for(String token:tokens)
		{
			System.out.println(token);
		}*/
		
		//validatePhoneNumbers_USA();
		//validatePhoneNumbers_India();
		validateEmail();
		

	}
	
	public static void validateEmail() {
		// TODO Auto-generated method stub
		System.out.println("Enter Email ID - ");
		Scanner scn = new Scanner(System.in);
		String Email_Id = scn.next();
		Pattern emailIdPattern = Pattern.compile("(\\w)*\\.(\\w)*@(\\w)*\\.com");
		Matcher token = emailIdPattern.matcher(Email_Id);
		
		if(token.matches())
		{
			System.out.println("Email is valid");
		}
		else
		{
			System.out.println("Email is Invalid");
		}
		
		scn.close();
		
		
	}

	public static void validatePhoneNumbers_USA() {
		// TODO Auto-generated method stub
		
		System.out.println("Enter Phone Number - ");
		Scanner scn = new Scanner(System.in);
		String phone_number = scn.next();
		Pattern phoneNumberPattern = Pattern.compile("(\\d-)?(\\d{3}-)?\\d{3}-\\d{4}");
		Matcher token = phoneNumberPattern.matcher(phone_number);
		
		if(token.matches())
		{
			System.out.println("Phone Number is valid");
		}
		else
		{
			System.out.println("Phone Number is Invalid");
		}
		
		scn.close();
		
	}
	
	public static void validatePhoneNumbers_India()
	{
		System.out.println("Enter Phone Number - ");
		Scanner scn = new Scanner(System.in);
		String phone_number = scn.next();
		Pattern phoneNumberPattern = Pattern.compile("(\\d{10})");
		Matcher token = phoneNumberPattern.matcher(phone_number);
		
		if(token.matches())
		{
			System.out.println("Phone Number is valid");
		}
		else
		{
			System.out.println("Phone Number is Invalid");
		}
		
		scn.close();
	}

	
}
