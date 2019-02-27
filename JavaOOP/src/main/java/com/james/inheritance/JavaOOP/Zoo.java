package com.james.inheritance.JavaOOP;

public class Zoo {

    public static void main (String[] args)
    {   
    	Flayable flyingBird = new Sparrow("Dove", 2,"M", 11);
    	flyingBird.fly();
    	
    	 System.out.println();
    	
    	Animal sparrow = new Sparrow("Dove", 2,"M", 11);
    	sparrow.myDetails();
    	sparrow.eat();
    	sparrow.sleep();
    	sparrow.move();
        System.out.println();
        
        Animal chicken = new Chicken("Chicken", 2,"F", 10);
        chicken.myDetails();
        chicken.eat();
        chicken.sleep();
       // bird.move();
       
        System.out.println();
        
        Animal fish = new Fish("Tilapia Fish",2, "F", 3);
        fish.myDetails();
        fish.eat();
        fish.sleep();
       // fish.move();
        
        System.out.println(); 
        
        moveAnimal(sparrow);
        
        moveAnimal(chicken);
        
        moveAnimal(fish);
        
    }
    
    public static void moveAnimal(Animal animals){
    	animals.move();
    }
}
