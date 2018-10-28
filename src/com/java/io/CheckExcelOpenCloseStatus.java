package com.java.io;

import java.io.File;

public class CheckExcelOpenCloseStatus {

	public static void main(String[] args) {
		
		final String workDir = System.getProperty("user.dir");
		
		 String fileName = workDir+"\\src\\com\\java\\io\\Text.xlsx";
		    File file = new File(fileName);

		    // try to rename the file with the same name
		    File sameFileName = new File(fileName);

		    if(file.renameTo(sameFileName)){
		        // if the file is renamed
		        System.out.println("file is closed");    
		    }else{
		        // if the file didnt accept the renaming operation
		        System.out.println("file is opened");
		    }
	}

}
