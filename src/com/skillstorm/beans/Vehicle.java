package com.skillstorm.beans;

// you can only have abstract methods inside of an abstract class
public abstract class Vehicle {

    // these are not static final fields
    // they are instance variables - in an interface these would be public static final
    private String color;
    private int topSpeed;
    private int wheels;
    private String size;



    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getTopSpeed() {
        return this.topSpeed;
    }


    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getWheels() {
        return this.wheels;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return this.size;
    }

    // most cars have similar drive methods

    public abstract void drive();


    // probably very different to park an 18-wheeler vs a corolla.
    public void park(String size) {

    }

    // most cars have similar horn sounds
    public void honk() {
        System.out.println("Honking");
    }


}
