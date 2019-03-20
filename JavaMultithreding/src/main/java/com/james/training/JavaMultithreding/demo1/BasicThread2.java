package com.james.training.JavaMultithreding.demo1;

public class BasicThread2 implements Runnable{

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Hi there " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}

}
