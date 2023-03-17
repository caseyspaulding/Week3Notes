package com.skillstorm.rehash;

public class BetterZoo {
        public static final String MASTER = "Mr. Smith";

        public static void main(String[] args) {

                System.out.println("Welcome to the zoo, " + MASTER + "!");

                // new keyword calls a constructor
                // the arguments I hand my constructor have to match the constructor's parameters
                BetterBird carl = new BetterBird("Carl", false, 10.0, 10.0, 4.0);
                carl.speak();
                carl.migrate();
                carl.flap(3);
                carl.feed(2.0);

        }
}
