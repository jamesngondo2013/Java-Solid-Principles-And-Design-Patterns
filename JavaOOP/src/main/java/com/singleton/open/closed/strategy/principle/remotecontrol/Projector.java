package com.singleton.open.closed.strategy.principle.remotecontrol;

public class Projector extends DigitalDevice{

	public Projector(int deviceid, String deviceName) {
		super(deviceid, deviceName);
		
	}

	public void deviceTurnON() {
		System.out.println("Projector turned on... " );
		pullDownProjectorScreen();
	}

	public void deviceTurnOFF() {
		System.out.println("Projector turned off... " );
		pullUpProjectorScreen();
	}
	
	private void pullDownProjectorScreen(){
		System.out.println("Screen has been lowered for viewing");
	}
	
	private void pullUpProjectorScreen(){
		System.out.println("Screen has been pulled up...");
	}

}
