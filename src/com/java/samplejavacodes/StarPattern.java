package com.java.samplejavacodes;

public class StarPattern {
	
	public static void main(String[] args)
	{
		System.out.println("****STAR PATTERN*****");
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(i == 0 && j != 2)
				{
					System.out.print(" ");
				}
				else if(i == 0 && j==2)
				{
					System.out.print("*");
				}
				else if(i == 1 && (j == 0 || j ==4))
				{
					System.out.print(" ");
				}
				else if(i == 1 && (j != 0 || j!=4))
				{
					System.out.print("*");
				}
				else if(i == 2)
				{
					System.out.print("*");
				}
			}
			
			System.out.println();
		}
		
	}

}
