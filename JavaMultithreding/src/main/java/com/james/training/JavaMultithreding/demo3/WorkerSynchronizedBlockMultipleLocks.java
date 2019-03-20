package com.james.training.JavaMultithreding.demo3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WorkerSynchronizedBlockMultipleLocks {

	Random rand = new Random();
	
	private List<Integer> list1 = new ArrayList<Integer>();
	private List<Integer> list2 = new ArrayList<Integer>();
	/*
	 * lock1 and lock2 objects - These locks will allow two threads to be able to run each stageOne() or stageTwo()
	 * blocks separately at the sametime - without having to wait for one thread to finish before
	 * another one can aquire a lock. This reduces the time taken to add items to separate lists e. 2 sec
	 * if you synchronize only the stageOne() or stageTwo() code blocks, one thread will have to wait for the lock
	 * after one is finished then the next thread will execute, which takes more time to add to the separate lists eg 5 sec 
	 */
	private Object lock1 = new Object();
	private Object lock2 = new Object();
	
	public void stageOne(){
		
		synchronized(lock1){
			try {
				Thread.sleep(1);
				
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			list1.add(rand.nextInt(100));
		}
	}
	
	public void stageTwo(){
		
		synchronized(lock2){
			try {
				Thread.sleep(1);
				
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			list2.add(rand.nextInt(100));
		}
		
	}
	
	public void process(){
		for (int i = 0; i < 1000; i++) {
			stageTwo();
			stageOne();
		}
	}
	
	public void main(){
		System.out.println("Starting...");
		
		long start = System.currentTimeMillis();
		
		Thread t1 = new Thread(new Runnable() {
			
			public void run() {
				
				process();
			}
		});
		t1.start();
		
		Thread t2 = new Thread(new Runnable() {
			
			public void run() {
				
				process();
			}
		});
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
		
		long end = System.currentTimeMillis();
		
		System.out.println("Time taken: " + (start- end));
		System.out.println("List1: " + list1.size() + "; List2: "+ list2.size());
	}
}
