package com.java.samplejavacodes;

import java.util.Scanner;

public class SquareRoot {
	
	public static void main(String[] args){
		System.out.println("Enter Number : ");
		Scanner scn = new Scanner(System.in);
		
		int no=scn.nextInt();
		/*while(no <= 0 ){
			System.out.println("..Please Enter number greater than Zero...");
			no = scn.nextInt();
			
		}*/
		int no1=0;
		int f=0;
		for(int number=1; (number*number) <= no ;number++){
			no1 = number*number;
			if(no1 == no){
				System.out.println("Square Root of "+no+" = "+number+" .");
				f=1;
			}
		}
		if(f==0){
			System.out.println("No "+no+" is Not Perfect Square .");
		}
	}

}
