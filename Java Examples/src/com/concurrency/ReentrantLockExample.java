package com.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantLockExample {

	ReentrantLock lock = new ReentrantLock();
	public void lockDemo() {
		lock.lock();
		try {
			lock.tryLock(1000, TimeUnit.SECONDS);
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			lock.unlock();
		}
	}

	ReentrantReadWriteLock.ReadLock readLock=new ReentrantReadWriteLock().readLock();
	ReentrantReadWriteLock.WriteLock writeLock=new ReentrantReadWriteLock().writeLock();
	
	public void readLock() {
		readLock.lock();
		//heavy operation
		readLock.unlock();
		
	}
	public void writeLock() {
		writeLock.lock();
		//heavy operation
		writeLock.unlock();
	}
	
	Semaphore semaphore=new Semaphore(3); //only allow 3 thread to access service
	public void heavyDuty() {
		//semaphore.acquire(); // thrown interrupted exception
		semaphore.acquireUninterruptibly();
		
		//heavy operations
		semaphore.release();
	}
	public static void main(String[] args) {
			ExecutorService executorService=Executors.newCachedThreadPool();
	}
}
