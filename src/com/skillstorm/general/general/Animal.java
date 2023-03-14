package com.skillstorm.general.general;

public class Animal {
    // this class will never "run" so it doesn't need a main method
    public String name;
    public String color;
    protected double age; // years old
    public boolean fur;

    // access modifiers are one part of encapsulation

    public void setName(String name) {
        this.name = name;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setAge(double age) {
        this.age = age;
    }
    public void setFur(boolean fur) {
        this.fur = fur;
    }
    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
    public double getAge() {
        return age;
    }
    public boolean hasFur() {
        return fur;
    }

    // constructors are special methods that are used to create objects
    // they are called when the class is instantiated
    // once you define a constructor the default constructor goes away
    // can have as many constructors as you want
    // constructors are the SAME NAME as the class
    // constructors do not have a RETURN type like normal methods
    // you can make as many OVERLOADS as you want
    public Animal(String name, String color, double age, boolean fur) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.fur = fur;

    }


    public Animal(String name, double age, boolean fur) {
        this.name = name;
        this.age = age;
        this.fur = fur;
        // can set a default property here if you want
        // for example if you want to have a default color
        // this.color = "red";
    }

    //--------------------- Access modifiers -----------------------//
    // public - accessible everywhere
    // protected - accessible only within the class, subclasses, and the same package
    // private - accessible only within the class
    // default - accessible only within the class, and the same package


}
