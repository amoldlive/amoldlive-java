package com.java;

public class ThreadEx2 {
	public static void main(String[] args) throws InterruptedException {
		
		String name="DIPALINI WALKE";
		
		for (int i = 0; i < name.length(); i++) {
			System.out.print(name.charAt(i) + " ");
			Thread.sleep(1000);
		}
		
		
	}
}
