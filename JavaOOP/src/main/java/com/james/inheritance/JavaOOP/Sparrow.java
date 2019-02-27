package com.james.inheritance.JavaOOP;

public class Sparrow extends Bird implements Flayable{

    public Sparrow (String name, int age, String gender, double weight)
    {
        super(name, age, gender, weight);
       
    }
    
    public void move ()
    {
        System.out.println("I can move by flying...");
        
    }

    public void fly ()
    {
        System.out.println("Sparrow flying high...");
    }
    
}
