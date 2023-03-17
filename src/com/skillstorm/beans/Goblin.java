package com.skillstorm.beans;

public class Goblin implements Shark {

    private String name;
    private double noseLength;
    private int howScary;
    private double speed;

    public Goblin(String name, double noseLength, int howScary, double speed) {
        this.name = name;
        this.noseLength = noseLength;
        this.howScary = howScary;
        this.speed = speed;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getNoseLength() {
        return this.noseLength;
    }
    public void setNoseLength(double noseLength) {
        this.noseLength = noseLength;
    }
    public int getHowScary() {
        return this.howScary;
    }
    public void setHowScary(int scary) {
        this.howScary = scary;
    }
    public double getSpeed() {
        return this.speed;
    }
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public void swim(double distance) {
        System.out.println(name + " is swimming " + (distance * noseLength) + " at " + howScary + " mph");

    }

    @Override
    public void bite() {

    }

    @Override
    public void hunt() {

    }
}
