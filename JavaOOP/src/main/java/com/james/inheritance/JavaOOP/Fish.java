package com.james.inheritance.JavaOOP;

public class Fish extends Animal{

    public Fish (String name, int age, String gender, double weight)
    {
        super(name, age, gender, weight);
       
    }

    @Override
    public void move ()
    {
        System.out.println("I can move by swimming...");
        
    }

    @Override
    public void sleep ()
    {
        System.out.println("I sleep...");
        
    }

}
