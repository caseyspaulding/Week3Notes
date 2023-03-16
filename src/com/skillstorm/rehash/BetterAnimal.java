package com.skillstorm.rehash;

// separate out your concerns : your classes only worry about their own functionality
public class BetterAnimal {

    // instance variables
    // encapsulation : private instance variables
    // public getters and setters
    private String name;
    private boolean fur;
    private double weight;
    public final String PLANET = "Earth";



    // this keyword : refers to the current object or instance of the class
    // it is the same as the class(object) saying "this is my name" or "this is my weight"
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isFur() {
        return this.fur;
    }

    public void setFur(boolean fur) {
        this.fur = fur;
    }



}
