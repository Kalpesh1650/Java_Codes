package com.java.Collections;

import java.util.Map;
import java.util.Properties;

public class MapEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties p = System.getProperties();
		for(Map.Entry entrySet : p.entrySet()) {
			
			System.out.println(entrySet.getKey() +": "+entrySet.getValue());
			
		}

	}

}
