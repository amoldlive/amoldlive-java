package com.concurrency;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class MyBlockingQueue<E> {
	private Queue<E> queue;
	private int max_limit;
	ReentrantLock lock = new ReentrantLock(true);
	Condition notEmpty = lock.newCondition();
	Condition notFull = lock.newCondition();

	public MyBlockingQueue(int limit) {
		max_limit = limit;
		queue = new LinkedList<E>();
	}

	public void put(E item) throws InterruptedException {
		lock.lock();
		try {
			while (queue.size() == max_limit) {
				// block the thread
				notFull.await();
			}

			queue.add(item);
			notEmpty.signalAll();
		} finally {
			lock.unlock();
		}
	}

	public E take() throws InterruptedException {
		lock.lock();
		try {
			while (queue.size() == 0) {
				// block the thread
				notEmpty.await();
			}

			E item = queue.remove();
			notFull.signalAll();
			return item;
		} finally {
			lock.unlock();
		}
	}

	@Override
	public String toString() {
		return "MyBlockingQueue [queue=" + queue + "]";
	}

}

class MyBlockingQueueLegacy<E> {
	private Queue<E> queue;
	private int max_limit;

	public MyBlockingQueueLegacy(int limit) {
		max_limit = limit;
		queue = new LinkedList<E>();
	}

	public synchronized void put(E item) throws InterruptedException {

		while (queue.size() == max_limit) {
			// block the thread
			wait();
		}

		if (queue.size() == 0)
			notifyAll();

		queue.add(item);

	}

	public synchronized E take() throws InterruptedException {

		while (queue.size() == 0) {
			// block the thread
			wait();
		}

		if (queue.size() == max_limit)
			notifyAll();

		E item = queue.remove();
		return item;

	}

	@Override
	public String toString() {
		return "MyBlockingQueueLegacy [queue=" + queue + "]";
	}

}

public class CustomBlockingQueue {
	public static void main(String[] args) throws InterruptedException {
		MyBlockingQueue<Integer> mbq = new MyBlockingQueue<>(3);
		mbq.put(1);
		mbq.put(2);
		mbq.put(3);
		// mbq.put(4);
		// mbq.put(5);

		// mbq.take();
		// mbq.take();
		System.out.println(mbq);
		mbq.take();
		System.out.println(mbq);
		mbq.put(4);
		System.out.println(mbq);

		MyBlockingQueueLegacy<Integer> mbql = new MyBlockingQueueLegacy<>(3);
		mbql.put(1);
		mbql.put(2);
		mbql.put(3);
		// mbql.put(4);
		System.out.println(mbql);

		producerConsumerRunner();
	}

	public static void producerConsumerRunner() {

		MyBlockingQueue<String> blockingQueue = new MyBlockingQueue<>(3);

		Runnable producer = () -> {
			while (true) {
				long time = System.currentTimeMillis();
				try {
					blockingQueue.put("" + time);
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		Runnable consumer = () -> {
			while (true) {
				try {
					String data = blockingQueue.take();
					System.out.println( Thread.currentThread().getName() +" Consumed : " + data);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};

		Thread p1 = new Thread(producer);
	

		Thread c1 = new Thread(consumer);
		Thread c2 = new Thread(consumer);
	

		p1.start();
	
		c1.start();
		c2.start();
	}

}
