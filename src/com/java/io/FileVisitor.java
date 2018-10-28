package com.java.io;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class FileVisitor extends SimpleFileVisitor<Path> { 
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		
		            System.out.println(file.getFileName());
		            return FileVisitResult.CONTINUE;        // go on to next file
		      }

public static void main(String[] args) throws Exception {
	
	final String workDir = System.getProperty("user.dir"); 
	FileVisitor dirs = new FileVisitor();
    	Files.walkFileTree(Paths.get(workDir),dirs); 
}
}

