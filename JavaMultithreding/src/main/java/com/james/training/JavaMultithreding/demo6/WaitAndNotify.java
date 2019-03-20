package com.james.training.JavaMultithreding.demo6;

import java.util.LinkedList;
import java.util.Random;

public class WaitAndNotify {

	public static void main(String[] args) {
		
		final WaitAndNotify app = new WaitAndNotify();
		
		Thread t1 = new Thread(new Runnable() {
			
			public void run() {
				try {
					app.producer();
					
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				
			}
		});
		//another thread
		Thread t2 = new Thread(new Runnable() {
			
			public void run() {
				try {
					app.consumer();
					
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				
			}
		});
		
		t1.start();
		t2.start();
	}
	
	private Object lock = new Object();
	private final int LIMIT = 10;
	private LinkedList<Integer> list = new LinkedList<Integer>();
	
	
	public void producer() throws InterruptedException{
		
		int value =0;
		while(true){
			
			synchronized (lock) {
				
				while (list.size()==LIMIT) {
					//this will wait for the consumer to remove item
					//before it can start adding again- otherwise it will jump to lock.notify()
					//outside the loop if not == LIMIT
					lock.wait();
					
				}
				//add items as fast as it can
				list.add(value++);
				//wakeup consumer that we need added something
				lock.notify();
			}
			
		}
	}
	
	public void consumer() throws InterruptedException{
		Random random = new Random();
		while(true){
			synchronized (lock) {
				
				while (list.size()==0) {
					//this will cause the thread to wait until the list is full
					//otherwise if the list is full, it will jump to lock.notify() outside this loop
					lock.wait();
					
				}
				System.out.print("List size is: "+ list.size());
				int value = list.removeFirst();
				System.out.println("; value is: " + value);
				//this will wake the producer that we removed something
				lock.notify();
			}
			//this limits how fast it can remove items from the list
			Thread.sleep(random.nextInt(1000));
		}
		
	}
}
