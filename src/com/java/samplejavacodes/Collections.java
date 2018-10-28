package com.java.samplejavacodes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = new ArrayList<String>();
		Map<String,String> names_Map = new HashMap<String,String>();
		Map<Integer, String> tree_map = new TreeMap<Integer, String>();
		
		
		Set<String> s = new HashSet<String>();
		
		s.add("B");
		s.add("A");
		s.add("D");
		s.add("B");
		s.add("B");
		
		
		names.add("Ram");
		names.add("Sam");
		names.add("Patel");
		
		names_Map.put("r", "Ram");
		names_Map.put("k", "Krishna");
		
		tree_map.put(1, "One");
		tree_map.put(2, "Two");
		tree_map.put(3, "Three");
		tree_map.put(4, "Four");
//		System.out.println(names.get(0));
		//System.out.println(tree_map.get(3));
		Set<Integer> keys = tree_map.keySet();
		
		
		
	//	java.util.Collections.sort(names);
		
		Iterator<Integer> it = keys.iterator();
		while(it.hasNext())
		{
			Integer name = it.next();
			System.out.println(name);
		}
		
		//System.out.println(s);
		
		

	}

}
