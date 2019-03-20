package com.james.training.JavaMultithreding.demo3;

/*
 * Problem - INTERLEAVE: multiple threads access shared data.
 * Interference happens when two operations, running in different threads, but acting on the same data, interleave. 
 * This means that the two operations consist of multiple steps, and the sequences of steps overlap.
 * Running both threads we expect the value of count to be 20000
 * but that's not the case because - when t1 and t2 access 'count', the value
 * at start for all of them will be at 0 and t1 will increment it to 10000 and 
 * store the value - also t2 will increment and finally store the value - which ends up 
 * overriding the t1 value. OR they may hit at different times at the start. Some increments may be skipped at 
 * some point in time.
 * 
 * Solution: we need to have a synchronized block to control the increment of 'count'
 * Every object will have an intrinsic lock and only one thread can acquire it at a given time.
 */
public class ThreadSynchronization {

	private int count=0;
	
	public void doWork(){
		
		Thread t1 = new Thread(new Runnable() {
			
			public void run() {
				
				for (int i = 0; i < 10000; i++) {
					increment();
				}
				
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			public void run() {
				
				for (int i = 0; i < 10000; i++) {
					increment();
				}
				
			}
		});
		t1.start();
		System.out.println(System.currentTimeMillis());
		t2.start();
		System.out.println(System.currentTimeMillis());
		
		try {
			
			t1.join();
			t2.join();
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
		System.out.println("Count is... " + count);
	}
	
	//=================================
	
	public synchronized void increment(){
		count++;
	}
	
	
	public static void main(String[] args) {
		
		ThreadSynchronization app = new ThreadSynchronization();
		app.doWork();
		
		
	}
}
