package com.java.samplejavacodes;

import java.util.Scanner;

public class LogicalPatterns {

	private static final char D = 'D';

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scr = new Scanner(System.in);
		/*System.out.println("Enter Character : ");
		
		String n=scr.next();
		cc=n.charAt(0);*/
		
		
		/*for(int i=1;i<=n;i++)
		{   
			for(int j=1;j<=i;j++)
			{
				for(int k=1;k<=j;k++)
				{
					System.out.print(" "+j);
				}
			}
			System.out.println();
		}*/
		
		for(char i='A';i<=D;i++)
		{
			for(char j='A';j<=i;j++)
			{
				for(char k='A';k<=j;k++)
				{
					System.out.print(j);
				}
				
			}
			System.out.println();
				
		}
				
		
		
		
		//scr.close();

	}

}
