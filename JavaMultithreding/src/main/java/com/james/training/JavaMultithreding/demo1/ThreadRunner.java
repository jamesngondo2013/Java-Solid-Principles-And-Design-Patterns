package com.james.training.JavaMultithreding.demo1;

/**
 * Basic Threads
 *
 */
public class ThreadRunner 
{
    public static void main( String[] args )
    {
       BasicThreads t = new BasicThreads();
       t.start();
       
       Thread t2 = new Thread(new BasicThread2()); 
       t2.start();
       
       runThreadOnAnonymousClassExample();
       
    }
    
    public static void runThreadOnAnonymousClassExample(){
    	Thread t3 = new Thread(new Runnable() {
			
			public void run() {
				
				for (int i = 0; i < 10; i++) {
					System.out.println("Hi Anonymous class... " + i);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}				
			}
		});
    	t3.start();
    }
}
