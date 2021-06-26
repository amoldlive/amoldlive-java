package com.test;

public class TryTest2 {
	public static void main(String[] args) {
		
		try {
			System.out.println("inside try");
			System.exit(0);
			System.out.println("inside try-2");
			
		}catch(Exception e) {
			System.out.println("inside catch");			
		}finally {
			System.out.println("inside finally");
		}
		
	}
}
