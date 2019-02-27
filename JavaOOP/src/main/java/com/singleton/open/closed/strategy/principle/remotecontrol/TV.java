package com.singleton.open.closed.strategy.principle.remotecontrol;

public class TV extends DigitalDevice{

	public TV(int deviceid, String deviceName) {
		super(deviceid, deviceName);
		
	}

	public void deviceTurnON() {
		System.out.println("TV turned on... " );
		SwitchToFavoriteChannel();
		turnOnTVAlarm();
	}

	public void deviceTurnOFF() {
		System.out.println("TV turned off... " );
		
	}
	
	// below are additional steps that may be required for you to operate your device
		private void SwitchToFavoriteChannel(){
			System.out.println("Switched to your favorite Channel");
		}
		
		private void turnOnTVAlarm(){
			System.out.println("TV Alarm set for you to wake up in the morning");
		}
		
}
