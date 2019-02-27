package com.james.composition.JavaOOP;

public class PC {
	private Case theCase;
	private Monitor monitor;
	private Keyboard keyboard;
	
	public PC(Case theCase, Monitor monitor, Keyboard keyboard) {
		super();
		this.theCase = theCase;
		this.monitor = monitor;
		this.keyboard = keyboard;
	}
	
	public Keyboard getKeyboard() {
		return keyboard;
	}

	public void setKeyboard(Keyboard keyboard) {
		this.keyboard = keyboard;
	}

	public Case getTheCase() {
		return theCase;
	}

	public void setTheCase(Case theCase) {
		this.theCase = theCase;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}	

}
