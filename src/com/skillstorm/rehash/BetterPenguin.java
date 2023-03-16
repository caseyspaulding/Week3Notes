package com.skillstorm.rehash;

public class BetterPenguin extends BetterBird{

    public BetterPenguin(String name, boolean fur, double weight, double speed, double wingspan){
        super(name, fur, weight, speed, wingspan);
        // super() : calls the constructor of the parent class
        // my parent has a constructor that sets all this up for me,
        // so I don't have to do it myself, no need to repeat code
    }

    public void slide(int distance){
        System.out.println("Slid " + distance + " feet. It was glorious.");

    }

    public void dance(){
        System.out.println(getName() + " does the electric slide all night long!");
    }

    @Override
    public void speak(){
        System.out.println("HONK!");
    }

    @Override
    public void migrate(){
        dance();
        speak();
        System.out.println("Slid like the wind! At " + getTopSpeed() + " miles per hour.");
        System.out.printf("%s is in the zone! %n", getName());

    }
}

