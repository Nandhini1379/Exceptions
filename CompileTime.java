package com.onsoft.Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CompileTime {
	public static void main(String[] args) throws IOException {
		try {
			File f = new File("C:\\Users\\candy\\Desktop\\tst.txt");
		  FileReader fr = new FileReader(f);
		  int temp = 0;
		  while((temp = fr.read()) != -1) {
			System.out.print((char)(temp));
			
		}
		  }catch(FileNotFoundException fe) {
			System.out.println("Path is not Found");
		} 
		
		
	}

}
