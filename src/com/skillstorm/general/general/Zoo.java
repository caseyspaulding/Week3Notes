package com.skillstorm.general.general;
import com.skillstorm.beans.*;
import com.skillstorm.general.general.Animal;

public class Zoo {
    // properties create a HAS-A relationship
    // a com.skillstorm.general.general.Zoo HAS-A name
    // a com.skillstorm.general.general.Zoo HAS-A address
    public static String masterZoologiest = "Anthony";
    // usually constants are all caps

    public static final double TICKETPRICE = 75.00;

    // any variables within your class, that is not in a method is a property
    public String name; // this is an instance variable (property)
    public String address; // instance variable (property)

    // static methods and properties are always available, they are loaded into memory
    // memory and made available to other classes from one the program starts.
    public static void main(String[] args) {
        // inside the same class I do not need a class name for method calls.
        buyTickets(4);
        Zoo.buyTickets(4);

        // cannot do the smae thing for instance methods.
        // cannot directly call non-static methods from inside a static class.
        // sellPopcorn();

        // this is a call to our zoo constructor
        Zoo phillyZoo = new Zoo();

        Zoo nyZoo = new Zoo();
        nyZoo.sellPopcorn();
        phillyZoo.sellPopcorn();

        // static variables can be called just like methods.
        System.out.println(masterZoologiest);
        System.out.println(Zoo.masterZoologiest);
        // this property does not belong to the instance, so it does like me accessing it this way.
        // it belongs to the class
        System.out.println(phillyZoo.masterZoologiest);
        System.out.println(nyZoo.masterZoologiest);

        masterZoologiest = "Dr. Antony";
        System.out.println(masterZoologiest);

        phillyZoo.name = "Philadelphia com.skillstorm.general.general.Zoo";
        nyZoo.name = "New York com.skillstorm.general.general.Zoo";

        System.out.println(phillyZoo.name);
        System.out.println(nyZoo.name);

        //Animal myAnimal = new Animal();
        Animal myAnimal = new Animal("Mark", "Blue", 15, true);
       // myAnimal.name = "Dog";
      //  myAnimal.age = 2.3;

        // use getters and setters to access these values
        myAnimal.setFur(true);
        phillyZoo.birdExhibit();

        EmperorPenguin ceasar = new EmperorPenguin();
        ceasar.setName("Ceasar");
        ceasar.dance(); // final on methods, does not sot inheritance
        ceasar.feed(20.5);
    }

    public static void buyTickets(int num) {
        double amount = num * 75.00;
        // format is a static method of the String class
        // static methods are called with the class name, not the instance
        System.out.println(String.format("That will be $%.2f", amount));


    }

    public void birdExhibit() {
        Bird larry = new Bird("Larry", "Red", true, true, 88);

        larry.feed(20);
        larry.flap(15);
        larry.speak();
        Penguin micheal = new Penguin("Michael", "White", true, false, 150);
        micheal.feed(53.2);
        micheal.flap(32);
        micheal.slide(20);
        micheal.dance();
        micheal.migrate();

        // BaldEagle extends Eagle, which extends Bird,
        // bald eagle is a bird
        // it is a grandchild of bird

        BaldEagle baldilocks = new BaldEagle();
        baldilocks.setName("Baldilocks");
        baldilocks.setColor("Blonde");
        baldilocks.setCarnivore(true);
        baldilocks.setFly(true);
        baldilocks.setTopSpeed(276);
        baldilocks.flap(40);
        baldilocks.feed(24.6);
        baldilocks.migrate();
        baldilocks.speak();

        EmperorPenguin ceasar = new EmperorPenguin("Ceasar", "Black", true, false, 282);

        // through inheritance I have all the methods of bird.
        // but I didnt have to retype them
        Ostrich steve = new Ostrich("Steve", "Brown", true, false, 45);
//        steve.setName("Steve");
//        steve.setColor("Brown");
//        steve.setTopSpeed(45);
//        steve.setCarnivore(true);
//        steve.setFly(false);

        // it sees these methods exist in the parent class.
        steve.feed(60.5);
        steve.flap(3);
        steve.speak();
        steve.migrate();
        // inheritance goes one way, parent -> child
        steve.hide(10); // this is unique to the Ostrich class

        Eagle tyrone = new Eagle("Tyrone", "Brown", true, true, 75);
        tyrone.feed(100);
        tyrone.flap(16);
        tyrone.speak();

        // covariance
        // through inheritance I can use a common parent class to generalize my methods.

        sharkExhibit();
    }
    public void sharkExhibit() {
        // cannot create an instance of an abstract class  or interface directly
        // interfaces are abstract. they are a contract that a class must follow.
        // you need something that implements the interface.
        // HammerHead implements the Shark interface so it will work.
        System.out.println("********* MARK THE SHARK ***********");
        Shark mark = new HammerHead("Mark", 65,700,20, 35);
        mark.bite();
        mark.swim(20);
        mark.hunt();

        // I do not have access to HammerHead specific things because
        // mark is a type Shark, not a type HammerHead in Java
        // it only gives you access to what it can guarantee exists.
        // it can only guarantee that a Shark has a bite method, swim method, and hunt method.

        HammerHead actualMark = (HammerHead)mark;

        actualMark.setName("True Mark");
        System.out.println(actualMark.getBiteForce());

        actualMark.bite();
        actualMark.swim(20);

        Shark eddy = new Goblin ( "Eddy", 12, 10, 45);
        eddy.bite();
        eddy.swim(20);
        eddy.hunt();

        Goblin actualEddy = (Goblin)eddy;
        actualEddy.setName("True Eddy");
        System.out.println("************ Jimbo *************");
        Shark jimbo = new BlackTip("Jimbo", 5,63, 17);
        jimbo.bite();
        jimbo.swim(75);
        jimbo.hunt();

        BlackTip actualJimbo = (BlackTip)jimbo;
        actualJimbo.setName("True Jimbo");
        actualJimbo.bite();
        actualJimbo.swim(75);
        actualJimbo.hunt();

        Shark[] sharkList = new Shark[3];
        // I do not need a cast to go from a child class to a parent class
        // I do need a cast to go from a parent class to a child class
        sharkList[0] = actualMark;
        sharkList[1] = actualEddy;
        sharkList[2] = actualJimbo;

        sharkBait(sharkList);

    }
    private void sharkBait(Shark[] sharks) {
        for (int i = 0; i < sharks.length; i++) {
            sharks[i].swim(320);
            sharks[i].hunt();
            System.out.println("There's a shark in the water!");

        }
    }



    // this will house the methods that will be used in the instance of a  com.skillstorm.general.general.Zoo
    public void sellPopcorn() {
        System.out.println("Selling Popcorn");
        System.out.println("Dont feed the animals!");
    }
}
