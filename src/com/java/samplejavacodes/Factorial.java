package com.java.samplejavacodes;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter Number : ");
		Scanner scn = new Scanner(System.in);
		
		int no = scn.nextInt();
		int number = no;
		int fact=1;
		while(no>0)
		{
			fact = fact*no;
			no--;
		}
		System.out.println(number+"! = "+fact);
		
		scn.close();
		

	}

}
