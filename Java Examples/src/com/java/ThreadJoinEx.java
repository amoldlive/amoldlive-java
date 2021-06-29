package com.java;

class Engine implements Runnable {

	Thread t;

	Engine(Thread t) {
		this.t = t;
	}

	@Override
	public void run() {
		System.out.println("Thread started : " + Thread.currentThread().getName());
		try {
			if (null != t) {
				t.join();
			}
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread Ended : " + Thread.currentThread().getName());
	}

}

public class ThreadJoinEx {

	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread A");
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {

					t1.join();

				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				System.out.println("thread B");
			}
		});
		
		Thread t3 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					t2.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("thread C");
			}
		});

		t3.start();
		t2.start();
		t1.start();

	}
}