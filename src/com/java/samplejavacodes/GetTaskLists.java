package com.java.samplejavacodes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetTaskLists {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		try {
		    String line;
		    
		    Process p = Runtime.getRuntime().exec
		    	    (System.getenv("windir") +"\\system32\\"+"tasklist.exe");
		    BufferedReader input =
		            new BufferedReader(new InputStreamReader(p.getInputStream()));
		    while ((line = input.readLine()) != null) {
		        System.out.println(line); //<-- Parse data here.
		    }
		    input.close();
		} catch (Exception err) {
		    err.printStackTrace();
		}

	}

}
