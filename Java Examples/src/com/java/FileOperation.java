package com.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileOperation {
	public static void main(String[] args) throws IOException {

		
		File f=new File("G:/MyWorkspace/Java Examples/src/Files/Name.txt");
		File f2=new File("G:/MyWorkspace/Java Examples/src/Files/Dipalini.txt");
		
		BufferedReader br=new BufferedReader(new FileReader(f));
		PrintWriter pw=new PrintWriter(f2);
		
		String line=null;
		
		while((line=br.readLine())!=null) {
			//System.out.println(line);
			pw.println(line);
		}
		
		pw.flush();
		pw.close();
		
		
	}
}
