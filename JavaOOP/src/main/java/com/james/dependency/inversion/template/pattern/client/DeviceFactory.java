package com.james.dependency.inversion.template.pattern.client;

import com.james.dependency.inversion.template.pattern.processes.GeneralManufacturingProcess;
import com.james.dependency.inversion.template.pattern.processes.SmartPhoneManufacturingProcess;

public class DeviceFactory {

	public static void main(String[] args) {
		GeneralManufacturingProcess phone = new SmartPhoneManufacturingProcess("Sumsung S4");
		GeneralManufacturingProcess laptop = new SmartPhoneManufacturingProcess("Sumsung Laptop");
		laptop.launchProcess();
	}
	
	
}
