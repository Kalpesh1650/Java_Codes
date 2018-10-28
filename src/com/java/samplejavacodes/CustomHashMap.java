package com.java.samplejavacodes;

//package com.ata.filereader;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@SuppressWarnings("serial")
public class CustomHashMap extends HashMap<Object, Object> {

	/*@Override
	public String get(Object key) {
		return ((ArrayList) ((ArrayList) (super.get(key))).get(0)).get(0).toString();
	}*/

	public ArrayList<String> getListOf(Object key) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList = ((ArrayList) ((ArrayList) (super.get(key))).get(0));
		return arrayList;
	}
	
	//@Override
	//public V put(Object o1,List<Object> o2){
		
	//}

}
