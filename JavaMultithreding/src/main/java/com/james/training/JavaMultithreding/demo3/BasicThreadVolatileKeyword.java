package com.james.training.JavaMultithreding.demo3;

import java.util.Scanner;

public class BasicThreadVolatileKeyword extends Thread{

	//volatile here is used to prevent threads caching variables when they are not changed
	//from within that thread
	private volatile boolean running= true;
	
	public void run(){
		
		while(running){
			
			System.out.println("Hello...");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void shutdown(){
		running = false;
	}
	
	
	public static void main(String[] args) {
		
		BasicThreadVolatileKeyword b = new BasicThreadVolatileKeyword();
		b.start();
		
		System.out.println("Press Enter to stop...");
		
		Scanner input = new Scanner(System.in);
		input.nextLine();
		
		b.shutdown();
		
		
		
		
		
	}
	
}
