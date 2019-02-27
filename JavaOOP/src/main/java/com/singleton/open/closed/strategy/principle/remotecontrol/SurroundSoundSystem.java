package com.singleton.open.closed.strategy.principle.remotecontrol;

public class SurroundSoundSystem extends DigitalDevice{

	public SurroundSoundSystem(int deviceid, String deviceName) {
		super(deviceid, deviceName);
		
	}

	public void deviceTurnON() {
		System.out.println("Surround Sound System turned on... " );
		switchToFavoriteCD();
		increaseVolume();
	}

	public void deviceTurnOFF() {
		System.out.println("Surround SoundS ystem turned off... " );
		lowerVolume();
	}
	
	// below are additional steps that are specific to the device
		private void increaseVolume(){
			System.out.println("Volume has increased to a comfortable level on startup");
		}
		
		private void switchToFavoriteCD(){
			System.out.println("Michael Bolton now playing");
		}
		
		private void lowerVolume(){
			System.out.println("Lowering surround sound volume before closeing system");
		}

}
