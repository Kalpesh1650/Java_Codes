package com.java.samplejavacodes;


interface Powerful
{
	int POWER = 500;
	void average();
}


interface Do extends Powerful
{
	int CAPACITY = 300;
	void run();
}
public class InterfaceDemo implements Do,Powerful 
{
	
	
		public void run()
		{
			System.out.println(CAPACITY);
		}
		
		public void average ()
		{
			System.out.println(POWER);
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new InterfaceDemo().run();
		new InterfaceDemo().average();

	}

}
