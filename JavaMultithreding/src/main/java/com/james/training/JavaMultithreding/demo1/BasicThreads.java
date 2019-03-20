package com.james.training.JavaMultithreding.demo1;

public class BasicThreads extends Thread{

	public void run(){
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Hi " + i);
			try {
				sleep(100);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
