package com.james.training.JavaMultithreding.demo4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/*
 * Tread pools are a way of managing lots of threads at the sametime
 */

class Processor implements Runnable{
	
	private int id;
	
	public Processor(int id){
		this.id = id;
	}

	public void run() {
		System.out.println("starting... " +id);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		
		System.out.println("completed... " +id);
	}
}

public class ThreadPools {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		//submit tasks (5) to the executor - this will be identified by the Processor id
		for (int i = 0; i < 5; i++) {
			executor.submit(new Processor(i));
			
		}
		
		System.out.println("All tasks sumitted...");
		
		
		//tell the executor managerial thread to stop accepting new tasks and shut itself down 
		//when all the tasks are finished - but this will not shut down immediately but it will wait for all
		//threads to complete what they're doing
		executor.shutdown();
		
		
		//wait until all tasks are finished
		try {
			
			executor.awaitTermination(1, TimeUnit.DAYS);
			
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		System.out.println("All tasks completed...");
	}
}
