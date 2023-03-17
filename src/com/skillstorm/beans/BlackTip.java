package com.skillstorm.beans;

public class BlackTip implements Shark {

    private String name;
    private double length;
    private int speed;
    private int humanAttacks;

    public BlackTip(String name, double length, int speed, int humanAttacks) {
        this.name = name;
        this.length = length;
        this.speed = speed;
        this.humanAttacks = humanAttacks;
    }

    public int getHumanAttacks() {
        return this.humanAttacks;
    }
    public void setHumanAttacks(int humanAttacks) {
        this.humanAttacks = humanAttacks;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getLength() {
        return this.length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    public double getSpeed() {
        return this.speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }


    @Override
    public void swim(double distance) {
        System.out.println(name + " is looking for humans " + distance + " at " + speed + " mph");
    }

    @Override
    public void bite() {
        System.out.println(name + " finds a human! and bites with" + (length * humanAttacks) + " lbs of force.");
    }

    @Override
    public void hunt() {
        swim(length * speed);
        bite();
        System.out.println(name + " swims off into the deep at " + speed + " mpg. Satisfied..");
    }


}
