package com.java.samplejavacodes;

import java.util.Scanner;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter String to be reversed : ");
		
		//String src = "This is Reverse String Program";
		//System.out.println(src.charAt());
		
		Scanner scan = new Scanner(System.in);
		//String sr  = scan.nextLine();
		//System.out.println(sr);
		
		while(scan.hasNext())
		{
			int i=0;
			String tempString = scan.next();
			int tempLength = tempString.length();
			int tL2 = tempLength;
			while(i<tempLength)
			{
				tL2--;
				System.out.print(""+tempString.charAt(tL2));
				i++;
			}
			System.out.print(" ");
		}
		
		scan.close();
		
		//System.out.println(src);

	}

}
