package com.java.samplejavacodes;

import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter five numbers :");
		Scanner scn = new Scanner(System.in);
		int i=0;
		int[] numbers = new int[5];
		while(i<5)
		{
			numbers[i] = scn.nextInt();
			i++;
		}
		
		
		int j=0;
		int k;
		int temp=0;
		while(j<5)
		{
			k=0;
			while(k<4)
			{
				if(numbers[k]>numbers[k+1])
				{
					temp=numbers[k];
					numbers[k]=numbers[k+1];
					numbers[k+1]=temp;
					k++;
				}
				else
				{
					k++;
					continue;
				}
			}
			j++;
		}
		System.out.println("After Sorting :");
		i=0;
		while(i<5)
		{
			System.out.println(numbers[i]);
			i++;
		}
		
		scn.close();
		
	

	}

}
