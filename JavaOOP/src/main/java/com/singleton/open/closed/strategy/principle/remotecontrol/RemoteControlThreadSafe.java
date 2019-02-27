package com.singleton.open.closed.strategy.principle.remotecontrol;

/*
 * RemoteControlThreadSafe class encapsulates a strategy implementation and executes it.
 * If other workers are added, they will just do work based on what's been defined in their classes (behaviour.
 * And the specifics of their behaviour is no-else's business. 
 * This system is now open for extension and closed for modifications. There's no need to modify the framework to support 
 * new employee responsibilities. 
 * Open/ Closed Principle & Strategy Design Pattern - makes the system more ABSTRACT to support extensibility, and this pattern enables
 * an algorithm's behaviour to be selected at runtime - algorithm is very independent of the clients that use it.
 */
public class RemoteControlThreadSafe {
	
	private DigitalDeviceInterface digitalInterface = null;
	
	private static RemoteControlThreadSafe INSTANCE;

	private RemoteControlThreadSafe() {
		
	}
/*
 * This is thread safe
 * The Singleton design pattern is one of the simplest design patterns: 
 * It involves only one class throughout the application that is responsible for instantiating itself
 *  to make sure it creates no more than one instance. At the same time, it provides a global point 
 *  of access to that instance. In this case, the same instance can be used from everywhere, 
 *  being impossible to directly invoke the constructor each time.
 *  ==============================================================
 *  
 *  Thread-Safe Singletons
	The easier way to create a thread-safe singleton class is to make the global access method synchronized
 	so that only one thread can execute this method at a time.
 */
	public static synchronized RemoteControlThreadSafe getINSTANCE() {
		
		if (INSTANCE==null) {
			INSTANCE = new RemoteControlThreadSafe();
		}
		return INSTANCE;
	}

	public void chooseDeviceToConnectTo(DigitalDeviceInterface interfaceDigital){
		
		this.digitalInterface = interfaceDigital;
		
		System.out.println("Chose device " + digitalInterface.toString());
	}
	
	public void clickOffButon(){
		digitalInterface.deviceTurnOFF();

	}
	
	public void clickOnButon(){
		digitalInterface.deviceTurnON();
	}
}
