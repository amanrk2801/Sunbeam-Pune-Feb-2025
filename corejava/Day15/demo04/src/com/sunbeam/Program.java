package com.sunbeam;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the srcPath : ");
		String srcPath = sc.next(); 
		
		Path path = Paths.get(srcPath); 
		
		if(!Files.exists(path)) {
			System.out.println("Invalid path");
			System.exit(0);
		}
		if(Files.isDirectory(path)) {
			Files.list(path)
			.forEach(e -> System.out.println(e));
		}
		else if(Files.isRegularFile(path)) {
			System.out.println("Name : "+path.getFileName());
			System.out.println("Parent : "+path.getParent());
			if(Files.isReadable(path))
				System.out.print("Readable");
			if(Files.isWritable(path))
				System.out.print("Write");
			if(Files.isExecutable(path))
				System.out.println("Executable");
		}
		else {
			System.out.println("Niether file nor directory");
		}
		
	}
}
