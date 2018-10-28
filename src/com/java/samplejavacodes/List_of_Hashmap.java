package com.java.samplejavacodes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.xml.transform.sax.SAXTransformerFactory;

public class List_of_Hashmap {
	
	public static void main(String[] args){
		System.out.println("List of Hashmap...");
		//System.out.println("List of Hashmap...");
		//int datsets=1;
		Map<String,String> excel_values = new HashMap<String,String>();
		excel_values.put("TCID","TC_001");
		excel_values.put("Policy_Number","P/OED/10025");
		/*System.out.println("TestCase ID:- "+excel_values.get("TCID"));
		System.out.println("Policy Number:- "+excel_values.get("Policy_Number"));*/
		
		List<Map<String,String>> list_of_map = new ArrayList<Map<String,String>>();
		list_of_map.add(excel_values);
		Iterator<Map<String,String>> list_iterate = list_of_map.iterator();
		
			while(list_iterate.hasNext()){
				Map<String, String> m = list_iterate.next();
				
			}
		
		
		//for(Map s :list_iterate.next())
		//System.out.println(list_of_map.get(0).get("TCID"));
		//System.out.println(list_of_map.get(0).get("Policy_Number"));
			System.out.println("** List of Lists**");
			
			
		Map<ArrayList<String>,ArrayList<String>> map_of_lists = new HashMap<ArrayList<String>,ArrayList<String>>();
		
		///ArrayList of Keys
		int no_of_keys=3;
		List<String> data_keys = new ArrayList<String>();
		for(int i=0;i<no_of_keys;i++){
			//List<String> dataSet = new ArrayList<String>();
				data_keys.add("Key"+i);
		}
		
		//ArrayList of DataSets
		int no_of_datasets=3;
		List<List<String>> dataSets = new ArrayList<List<String>>();
		for(int i=0;i<no_of_datasets;i++){
			List<String> dataSet = new ArrayList<String>();
				dataSets.add(dataSet);
		}
			
		for(int i=0;i<no_of_datasets;i++){
			//List<String> dataSet = new ArrayList<String>();
			//for(int j=0;j<no_of_datasets;j++){
				//dataSets.get(i).add("List "+i+" -  String - "+(j+1));
				//map_of_lists.put(data_keys, );
					//ArrayList<String> dataSet = new ArrayList<String>();
					//ArrayList<List<String>> datasets = new ArrayList<dataSet>();
					//map_of_lists.put(data_keys,dataSets);
			//}
		}
		
		for(int i=0;i<no_of_datasets;i++){
			//List<String> dataSet = new ArrayList<String>();
			for(int j=0;j<no_of_datasets;j++){
				System.out.println(dataSets.get(i).get(j));
		}
		}
		
		
	}

}
