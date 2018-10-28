package com.java.samplejavacodes;

import java.util.Scanner;

public class PrimeNumbers {
	
	public static void main(String[] args)
	{
		System.out.println("Enter Number : ");
		Scanner scn = new Scanner(System.in);
		
		int no = scn.nextInt();

		int j=10;
		int k;
		int count_of_total_prime_numbers = 0;
		
		while(j<no)
		{
			for(k=2;k<j;k++)
			{
				if(j % k == 0)
				{
				//	System.out.println(no + " is Not a Prime");
					break;
				}
				else
				{
					//i++;
					continue;
				}
				
			}
			
			if(k == j)
			{	
				System.out.print(" "+j);
				count_of_total_prime_numbers++;
			}
			j++;
		
		}
		System.out.println();
		System.out.println("Total Prime numbers = "+count_of_total_prime_numbers);
		scn.close();

}
	
}
