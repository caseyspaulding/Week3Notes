package com.skillstorm.general.general;
import com.skillstorm.beans.Bird;
import com.skillstorm.beans.Eagle;
import com.skillstorm.beans.Ostrich;
import com.skillstorm.general.general.Animal;

public class Zoo {
    // properties create a HAS-A relationship
    // a com.skillstorm.general.general.Zoo HAS-A name
    // a com.skillstorm.general.general.Zoo HAS-A address
    public static String masterZoologiest = "Anthony";
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


    }

    public static void buyTickets(int num) {
        double amount = num * 75.00;
        // format is a static method of the String class
        // static methods are called with the class name, not the instance
        System.out.println(String.format("That will be $%.2f", amount));


    }

    public void birdExhibit(){
        Bird larry = new Bird("Larry", "Red", true, true, 88);

        larry.feed(20);
        larry.flap(15);
        larry.speak();

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


    }

    // this will house the methods that will be used in the instance of a  com.skillstorm.general.general.Zoo
    public void sellPopcorn() {
        System.out.println("Selling Popcorn");
        System.out.println("Dont feed the animals!");
    }
}
