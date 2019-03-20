package com.james.training.JavaMultithreding.demo8;

import java.util.concurrent.Semaphore;

public class Connection {

	private static Connection conection = new Connection();
	//creates a semaphore with a number of permits and the given fairness setting (true)
	//this allows us to make 10 connections at a time
	private Semaphore sem = new Semaphore(10, true);
	private int connections =0;
	
	private Connection(){
		
	}
	
	public static Connection getConnectionInstance(){
		return conection;
		
	}
	
	public void connect(){
		try {
			//acquires a permit before a thread can run
			sem.acquire();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//this is done in case doConnect() throws an exception
		//it will still goto finally{} to release the lock 
		//this is a safe way to get the lock released 
		try {
			doConnect();
			
		} finally{
		
			//release the lock afterwards
			sem.release();
		}	
	}
	
	public void doConnect(){
		
		synchronized (this) {
			connections++;
			System.out.println("Current conections: "+ connections);
		}
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		synchronized (this) {
			connections--;
		}
		
	}
}
