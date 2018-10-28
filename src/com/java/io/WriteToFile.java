package com.java.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteToFile {
	private final static String wrkDir = System.getProperty("user.dir");
	private static File textFile = null;
	private PrintWriter pw = null;
	private static FileWriter fw = null;

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		textFile = new File(wrkDir+"\\src\\DataFile.txt");
		//new PrintWriter(textFile);
		fw = new FileWriter(textFile, true);
		//new PrintWriter(file, csn)
		new WriteToFile().WriteToTextFile("Data 1");
		System.out.println("...Written to file.....");
		//System.out.println("Size of file = ");
		fw.close();

	}
	
	public void WriteToTextFile(String dataToWrite) throws IOException{
		fw.write("\n"+dataToWrite);
	}
	
	@Override
	public void finalize() throws IOException{
		System.out.println("....Finalize....");
		fw.close();
	}
	

}
