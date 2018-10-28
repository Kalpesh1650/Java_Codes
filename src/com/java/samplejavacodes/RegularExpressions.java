package com.java.samplejavacodes;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
	
	
		
	public static void main(String[] args)
	{
		int i=0;
		Scanner scn = new Scanner(System.in);
		String[] input_Strins = new String[2];
		
		System.out.println("Enter Pattern and Input String = ");
				
		while(i<2)
		{
			 input_Strins[i]= scn.next();
			// System.out.println(input_Strins[i]);
		 i++;
		}
		
		Pattern p = Pattern.compile(input_Strins[0]);
		Matcher m = p.matcher(input_Strins[1]);
		
		
		
		while(m.find())
		{
			System.out.print(m.start() + " ");
		}
		
		scn.close();
	}

}
