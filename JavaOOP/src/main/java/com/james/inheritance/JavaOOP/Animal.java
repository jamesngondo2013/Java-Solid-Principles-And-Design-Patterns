package com.james.inheritance.JavaOOP;

public abstract class Animal {

    private int age;
    private String gender;
    private double weight;
    private String name;
    
    public Animal (String name, int age, String gender, double weight)
    {
        super();
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }
    
    public abstract void move();
    public abstract void sleep();
    
    public void eat(){
        System.out.println("I eat...");
    }
    
    public int getAge ()
    {
        return age;
    }

    public void setAge (int age)
    {
        this.age = age;
    }

    public String getGender ()
    {
        return gender;
    }

    public void setGender (String gender)
    {
        this.gender = gender;
    }

    public double getWeight ()
    {
        return weight;
    }

    public void setWeight (double weight)
    {
        this.weight = weight;
    }
    
    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }
    
    public void myDetails(){
        
        String details = "Name: "+ getName()+
                "\nAge: "+ getAge()+
                "\nGender: " + getGender() +
                "\nWeight: " + getWeight();
        
        System.out.println(details);
        
    }
}
