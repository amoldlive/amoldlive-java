package com.thread.single;

class Printer {

	public void execute(String docName, int pages) {
		for (int i = 1; i <= pages; i++) {
			System.out.println("printing " + docName + " #" + i);
		}
	}

}

//mian Thread
public class SingleThreadMain {
	public static void main(String[] args) {
		System.out.println("Application Started ****** ");

		Printer printer = new Printer();
		printer.execute("javabook.pdf", 10);

		System.out.println("Application Finished ****** ");
	}
}
