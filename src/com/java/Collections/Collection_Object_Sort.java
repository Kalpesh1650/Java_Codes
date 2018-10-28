package com.java.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection_Object_Sort {

	public static void main(String[] args) {
		List<DVDInfo> list_DVDInfo = new ArrayList<>();
		int no_of_DVDs = 2;
		for(int count = 1;count<=no_of_DVDs;count++){
			
			switch(count){
			
			case 1:
				list_DVDInfo.add(new DVDInfo("Titanic","Romance-Musical",
						"Leonardio-de Caprio"));
			break;
			
			case 2:
				list_DVDInfo.add(new DVDInfo("AVATAR","Sci-Fi","Sam Worthingon"));
			break;
			
			}
			
		}
		System.out.println("****************************");
		System.out.println("****** List Of DVDs ********");
		System.out.println("****************************");
		for(int count = 1;count<=no_of_DVDs;count++){
						
			System.out.println(list_DVDInfo.get(count-1));
		}
		System.out.println("********************************");
		System.out.println("***After Sort List Of DVDs *****");
		System.out.println("********************************");
		Collections.sort(list_DVDInfo);
		System.out.println(list_DVDInfo);
		
		list_DVDInfo.clear();
	}

}

class DVDInfo implements Comparable<DVDInfo> 
{
	  String title;
	  String genre;
	  String leadActor;
	  DVDInfo(String t, String g, String a) {
	    title = t;  genre = g;  leadActor = a;
	  }
	  public String toString() {
	    return title + " " + genre + " " + leadActor + "\n";
	  }
	  public int compareTo(DVDInfo d) {
	    return title.compareTo(d.getTitle());
	  }
	  public String getTitle() {
	    return title;
	  }
	  // other getters and setters
	}
