package com.test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryTest {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		/*
		 * try {
		 * 
		 * }
		 */
		
		try(FileInputStream fis=new FileInputStream("")){
			//can define without finally and catch block
		}
		
			try {
				
				try {
					
				}catch (Exception e) {
					// TODO: handle exception
				}
				
			}catch (Exception e) {
				// TODO: handle exception
			}
	}
	
}
