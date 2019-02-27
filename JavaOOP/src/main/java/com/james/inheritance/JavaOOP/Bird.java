package com.james.inheritance.JavaOOP;

public abstract class Bird extends Animal{

    public Bird (String name, int age, String gender, double weight)
    {
        super(name, age, gender, weight);
       
    }

    public void move ()
    {
        System.out.println("I can move...");
        
    }

    public void sleep ()
    {
        System.out.println("I sleep");
        
    }

}
