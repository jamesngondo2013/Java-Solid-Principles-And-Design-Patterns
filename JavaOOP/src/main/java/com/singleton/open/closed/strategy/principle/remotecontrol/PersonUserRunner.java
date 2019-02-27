package com.singleton.open.closed.strategy.principle.remotecontrol;

public class PersonUserRunner {

	public static void main(String[] args) {
		
		DigitalDevice sonnyTv = new TV(1, "Sonny");
		DigitalDevice sonnySoundSystem = new SurroundSoundSystem(1, "sonny Sound System");
		DigitalDevice toshibaProjector = new Projector(1, "Toshiba Projector");
		
		RemoteControlThreadSafe control = RemoteControlThreadSafe.getINSTANCE();
		
		control.chooseDeviceToConnectTo(toshibaProjector);
		control.clickOnButon();
		
		try {
			
			Thread.sleep((int) (Math.random() * 10000));
			control.clickOffButon();
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
