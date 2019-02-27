package com.james.composition.JavaOOP;

public class AppRunner {
/*
 * COMPOSITION - when the containing object (PC) ceases to exist, the 
 *               internal parts its composed of no longer exist either.
 *               This implies ownership - that means the PC owns all components 
 */
    public static void main (String[] args)
    {
        Dimensions dimensions = new Dimensions(20, 103, 40);
        Motherboard motherboard = new Motherboard("AS-220", "ASUS", 4, 4, "v2.44");
        Case theCase = new Case("2990B", "Dell","240v", dimensions, motherboard);
        Monitor monitor = new Monitor("27inch", "Dell", 202, new Resolution(1024, 768));
        Keyboard keyboard = new Keyboard("Qwerty", "Dell", "Color");
        
        PC pc = new PC(theCase, monitor, keyboard);
        
        pc.getTheCase().pressThePowerButton();
        
        pc.getTheCase().coolingFan();
        
        pc.getTheCase().getMotherboard().getMotherboardDetails(); 
        
        pc.getTheCase().getCaseDetails();
        
        pc.getKeyboard().getModel();
        
        pc.getTheCase().getMotherboard().loadProgram("Windows 10 ");
        
        pc.getKeyboard().checkKeyboard();
        
        pc.getMonitor().drawPixelAt(1500, 1200, "Red");
       
        
       
        
       
        
        
    }
}
