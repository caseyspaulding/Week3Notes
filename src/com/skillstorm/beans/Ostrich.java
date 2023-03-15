package com.skillstorm.beans;
// you inherit from classes with the extends keyword
// can only extend from ONE CLASS
public class Ostrich extends Bird {
    public Ostrich(){}

    public Ostrich( String name, String color, boolean carnivore, boolean fly, double topspeed){
       // super is a special keyword used during inheritance
        // super allows you to use methods from the parent class
        // if you call super() that calls the parent class's constructor
        // it will call the parent's constructor
        // if you call super(name, color, carnivore, fly, topspeed)
        // it will call the parent's constructor
        super(name, color, carnivore, fly, topspeed);

    }

    public void hide(int duration){
        System.out.println(getName() + " is hides for " + duration + " hours.");
        System.out.println("It is safe to approach.");
    }

    @Override
    public void migrate(){
        flap(25);
        speak();
        System.out.println(getName() + " ran like the wind! At " + getTopSpeed() + " miles per hour.");
    }
}
