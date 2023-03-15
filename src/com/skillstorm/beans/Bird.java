package com.skillstorm.beans;

import java.sql.SQLOutput;

public class Bird {
    // You want to write D.R.Y. Code

    // -------  best practice is private properties, with public getters and setters -----------------//
    private String name;
    private String color;
    private boolean carnivore;
    private boolean fly;
    private double topSpeed;

    public Bird(){}

    public Bird(String name, String color, boolean carnivore, boolean fly, double topSpeed) {
        this.name = name;
        this.color = color;
        this.carnivore = carnivore;
        this.fly = fly;
        this.topSpeed = topSpeed;
    }

    public void feed(double lbs) {
        System.out.println(name + "Ate " + lbs + " lbs of food.");
    }

    public void flap(int times){
        System.out.println(name + "Flapping " + times + " times. It was glorious.");
    }

    public void speak(){
        System.out.println(name + "Chirp.");
    }

    public void migrate(){
        // can do this because I am in the same class
        // these methods are non-static, so they can call other non-static methods
        // they can also call any staic methods
        flap(20);
        speak();
        System.out.println(name + "Flew like the wind! At " + topSpeed + " miles per hour.");
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isCarnivore() {
        return this.carnivore;
    }
    public void setCarnivore(boolean carnivore) {
        this.carnivore = carnivore;
    }
    public boolean isFly() {
        return this.fly;
    }
    public void setFly(boolean fly) {
        this.fly = fly;
    }
    public double getTopSpeed() {
        return this.topSpeed;
    }
    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }


}
