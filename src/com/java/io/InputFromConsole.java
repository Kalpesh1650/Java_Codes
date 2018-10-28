package com.java.io;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputFromConsole {
	
	public static void main(String[] args) throws IOException{
	
	int character;
	System.out.println("Enter Character:");
	InputStreamReader reader = new InputStreamReader(System.in);
	character = reader.read();
	//while(character != -1){
		System.out.println((char)character);
//	}
	
		
	}
	
	
	
}
