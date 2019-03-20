package com.james.training.JavaMultithreding.demo5;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/*
 * BlockingQueue - interface in the java.util.concurrent package represents a 
 * queue which is thread safe to put into, and take instances from. 
 * It uses FIFO
 * 
 */

public class ProducerConsumer {

	private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable() {
			
			public void run() {
				try {
					producer();
					
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				
			}
		});
		//another thread
		Thread t2 = new Thread(new Runnable() {
			
			public void run() {
				try {
					consumer();
					
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				
			}
		});
		
		t1.start();
		t2.start();
	}
	
	private static void producer() throws InterruptedException{
		
		Random rand = new Random();
		//put() will patiently wait until a consumer has taken an item from the queue
		//and the adds items to it
		//add integers up 100 - (0-99)
		while(true){
			queue.put(rand.nextInt(100));
		}
	}
	
	private static void consumer() throws InterruptedException{
		Random rand = new Random();
		
		while(true){
			Thread.sleep(100);
			//randomly take things off the queue after waiting a 10th of a sec
			//take() will wait until there is an item in the that it take from
			if (rand.nextInt(10)==0) {
		
				Integer value = queue.take();
				
				System.out.println("Taken value: "+ value + "; Queue size is: " +queue.size());
			}
		}
	}
}
