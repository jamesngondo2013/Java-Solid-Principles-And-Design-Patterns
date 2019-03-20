package com.james.training.JavaMultithreding.demo8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SemaphoresRunner {

	public static void main(String[] args) {
		
		ExecutorService exc = Executors.newCachedThreadPool();
		
		//submitting 200 threads - reusable
		for (int i = 0; i < 200; i++) {
			exc.submit(new Runnable() {
				
				public void run() {
					// created 200 threads at once and calling connect
					//from all 200
					Connection.getConnectionInstance().connect();
					
				}
			});
		}
		//shutdown after all threads are finished
		exc.shutdown();
		
		try {
			
			exc.awaitTermination(1, TimeUnit.DAYS);
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
}
