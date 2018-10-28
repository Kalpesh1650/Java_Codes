package com.java.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromTxtFile {

	private final static String wrkDir = System.getProperty("user.dir");
	private static File textFile = null;
	private static FileReader fr = null;

	public static void main(String[] args) throws Exception {
		textFile = new File(wrkDir+"\\src\\DataFile.txt");
		fr = new FileReader(textFile);
		System.out.println("...Reading from file.....");
		char[] data = new char[50];
		ReadFromFile(data);
		fr.close();

	}
	
	public static void ReadFromFile(char[] cbuf) throws IOException{
		fr.read(cbuf);
		System.out.println(cbuf);
		/*for(char c:cbuf){
			System.out.print(c);
		}*/
	}

}
