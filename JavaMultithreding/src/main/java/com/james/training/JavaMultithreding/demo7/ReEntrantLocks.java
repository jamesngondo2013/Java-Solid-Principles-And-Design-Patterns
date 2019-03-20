package com.james.training.JavaMultithreding.demo7;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReEntrantLocks {

	public static void main(String[] args) throws InterruptedException {
		
		final ReEntrantLocks demo = new ReEntrantLocks();
		
	Thread t1 = new Thread(new Runnable() {
			
			public void run() {
				try {
					demo.firstThread();;
					
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				
			}
		});
		//another thread
		Thread t2 = new Thread(new Runnable() {
			
			public void run() {
				try {
					demo.secondThread();
					
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				
			}
		});
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		demo.finished();
	}
	
	
	private int count =0;
	private Lock lock = new ReentrantLock();
	
	private void increment(){
		for (int i = 0; i < 1000; i++) {
			count++;
		}
	}
	
	public void firstThread() throws InterruptedException{
		lock.lock();
		try {
			increment();
		} catch (Exception e) {
			
		}finally {
			lock.unlock(); // this will be called finally  though increment() had exception errors
		}	
		
	}
	
	public void secondThread() throws InterruptedException{
		lock.lock();
		try {
			increment();
		} catch (Exception e) {
			
		}finally {
			lock.unlock(); // this will be called finally  though increment() had exception errors
		}
	}
	
	public void finished(){
		System.out.println("Count is: " + count);
	}
}
