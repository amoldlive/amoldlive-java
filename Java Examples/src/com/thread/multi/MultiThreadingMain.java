package com.thread.multi;

class Printer {

	public void execute(String docName, int pages) {
		synchronized (this) {
			for (int i = 1; i <= pages; i++) {
				System.out.println("printing " + docName + " #" + i);
			}
		}
	}

}

//mian Thread
public class MultiThreadingMain {
	public static void main(String[] args) {
		System.out.println("Application Started ****** ");

		Printer printer = new Printer();

		Runnable myThread = () -> {
			printer.execute("javabook.pdf", 10);
		};
		new Thread(myThread).start();

		Runnable yourThread = () -> {
			printer.execute("awsbook.pdf", 10);
		};
		new Thread(yourThread).start();

		//System.out.println("Application Finished ****** ");
	}
}
