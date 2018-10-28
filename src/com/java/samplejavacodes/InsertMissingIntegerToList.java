package com.java.samplejavacodes;

public class InsertMissingIntegerToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {1,2,3,4,5,7,8,9};
		int[] second_half_numbers = null;
		int j,k=0,flag=0;
		
		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i] != (i+1) )
			{
				flag=1;
				j = i;
				second_half_numbers[k] = numbers[i];
				numbers[i] = i+1;
				 
			}
			else
			{
				if(flag == 1)
					second_half_numbers[k] = numbers[i];
				continue;
			}
			//System.out.println(numbers[i]);
			
		}
		for(int i=0;i<numbers.length;i++)
		{
		System.out.println(numbers[i]);
		System.out.println(second_half_numbers[k]);
		}
		
		

	}

}
