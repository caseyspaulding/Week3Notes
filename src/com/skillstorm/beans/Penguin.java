package com.skillstorm.beans;

public class Penguin extends Bird{

    public Penguin(){}
    public Penguin(String name, String color, boolean carnivore, boolean fly, double topSpeed){
        super(name, color, carnivore, fly, topSpeed);
    }

    public void dance(){
        System.out.println(getName() + " has happy feet!");
    }

    public void slide(double distance){
        System.out.println(getName() + " slid " + distance + " miles, majestically!");
    }

    @Override
    public void migrate(){
        dance();
        speak();
        System.out.println(getName() + " is in the zone. It dances the land at" + getTopSpeed() + " miles per hour.");
    }
}
