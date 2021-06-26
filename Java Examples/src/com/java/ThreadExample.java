package com.java;

class MyThread extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
	
}
class MyThread2 extends MyThread{
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
	}	
}
public class ThreadExample  {
	
	public static void main(String[] args) {
		MyThread myThread=new MyThread();
		//Thread thread=new Thread(myThread);
		//thread.setPriority(10);
		//thread.start();
		//System.out.println("Main Thread");
		myThread.start();
		
		Thread.currentThread().setPriority(10);
		for (int i = 0; i < 10; i++) {
			System.out.println("*");
		}
		
		Thread.yield();
		
		
	
	}
}
