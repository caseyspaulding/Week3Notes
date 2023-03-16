package com.skillstorm.rehash;

public class BetterBird extends BetterAnimal {
    private double topSpeed;
    private double wingspan;

    public BetterBird(String name, boolean fur, double weight, double topSpeed, double wingspan) {
        this.topSpeed = topSpeed;
        this.wingspan = wingspan;
        setName(name);

        setFur(fur);
        setWeight(weight);
    }

    public void speak(){
        System.out.println("Tweet tweet!");
    }

    public void feed(double amount){
        System.out.println("Feeding " + getName() + " " + amount + " pounds of food.");
    }

    public void flap(int times){
        System.out.println("Flapping " + times + " times. It was glorious.");
    }

    public void migrate(){
        flap(20);
        speak();
        System.out.println("Flew like the wind! At " + topSpeed + " miles per hour.");
    }

    public double getTopSpeed() {
        return this.topSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }
    public double getWingspan() {
        return this.wingspan;
    }
    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;

    }
    // Override only happens when you are overriding a method from a parent class //
    @Override
    public String toString() {
        return "I am" + getName() + " and I am a bird. I have a wingspan of " + wingspan + " feet and I can fly at a top speed of " + topSpeed + " miles per hour." ;
    }


}
