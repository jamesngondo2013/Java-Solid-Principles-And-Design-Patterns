package com.james.inheritance.JavaOOP;

public class Chicken extends Bird{

    public Chicken (String name, int age, String gender, double weight)
    {
        super(name, age, gender, weight);
       
    }

    public void move(){
    	System.out.println("I can move but dont fly...");
    }

}
