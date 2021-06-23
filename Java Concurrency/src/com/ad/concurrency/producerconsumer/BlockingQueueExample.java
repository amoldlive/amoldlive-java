package com.ad.concurrency.producerconsumer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class BlockingQueueExample {
	public static void main(String[] args) {
			
		BlockingQueue<Integer> bq=new LinkedBlockingQueue<Integer>();
		//	bq.put(1); //throws InterruptedException
		bq.add(4);
		bq.add(2);
		bq.add(3);

		BlockingQueue<Integer> pbq=new PriorityBlockingQueue<Integer>();
		pbq.add(4);
		pbq.add(3);
		pbq.add(2);
		
		System.out.println("Blocking queue : "+bq);
		
		
		
		System.out.println("Priority Blocking queue : "+ pbq);
		/*while storing it wont store in sorting order*/
		
		/*while removing it removes elements as per sorting order*/
		System.out.println(pbq.remove());
		System.out.println(pbq.remove());
		System.out.println(pbq.remove());

	}
}
