package com.singleton.open.closed.strategy.principle.remotecontrol;

public abstract class DigitalDevice implements DigitalDeviceInterface{

	private int deviceid;
	private String deviceName;
	
	public DigitalDevice(int deviceid, String deviceName) {
		super();
		this.deviceid = deviceid;
		this.deviceName = deviceName;
	}

	public int getDeviceid() {
		return deviceid;
	}

	public void setDeviceid(int deviceid) {
		this.deviceid = deviceid;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	
	
	
}
