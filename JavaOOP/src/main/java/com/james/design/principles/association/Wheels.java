package com.james.design.principles.association;

public class Wheels {

	private String fastenerType;
	private String threadSize;
	private double centerBoreSize;
	private int tyrePressure;
	
	public Wheels(String fastenerType, String threadSize, double centerBoreSize, int tyrePressure) {
		super();
		this.fastenerType = fastenerType;
		this.threadSize = threadSize;
		this.centerBoreSize = centerBoreSize;
		this.tyrePressure = tyrePressure;
	}

	public String getFastenerType() {
		return fastenerType;
	}

	public void setFastenerType(String fastenerType) {
		this.fastenerType = fastenerType;
	}

	public String getThreadSize() {
		return threadSize;
	}

	public void setThreadSize(String threadSize) {
		this.threadSize = threadSize;
	}

	public double getCenterBoreSize() {
		return centerBoreSize;
	}

	public void setCenterBoreSize(double centerBoreSize) {
		this.centerBoreSize = centerBoreSize;
	}

	public int getTyrePressure() {
		return tyrePressure;
	}

	public void setTyrePressure(int tyrePressure) {
		this.tyrePressure = tyrePressure;
	}
	
	public void getWheelSpec(){
		String data = "Wheel Fastener Type: " + fastenerType+ "\n"+
                "Thread Size: " +threadSize+"\n"+
                "Wheel Center Bore Size (mm): " + centerBoreSize+"\n"+
                "Tyre Pressure (psi): " + tyrePressure;
	System.out.println();
	System.out.println("Reading Wheel Spec Data...");
	System.out.println(data);
	System.out.println();
	}
	
}
