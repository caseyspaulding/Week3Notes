package com.skillstorm.beans;

public class TryCatch {

    public static void main(String[] args) {

        failGracefully();


    }

    public static void failGracefully() {
        // when running your code you want to fail gracefully
        // you want to catch the exception

        // like a try catch block. You can have multiple catch blocks
        try {
            // try to run this code
            int var = 0;
            int result = 10 / var; // this will throw an ArithmeticException
            System.out.println("Math works"); //
        }catch(ArithmeticException ex){
            // if the code above did not work because of an arithmetic exception then run this code
            // need to tell the catch what to look for
            System.out.println("You can't divide by zero");
        }

        // scoping applies for a try-catch in the same way it does for an if-else or any
        // loop we've gone through
        try {
            int[] nums = {1,2,3};
            nums[5] = 7; // this will throw an ArrayIndexOutOfBoundsException
            System.out.println("Array works");
        } catch(ArrayIndexOutOfBoundsException ex){
            // if the code above did not work because of an ArrayIndexOutOfBoundsException then run this code
            // nums[2] = 3; // nums does not exist in this scope
            System.out.println("That was outside of the array");
        }

        // you can have multiple catch blocks
        try {
            int val = 0;
            int[] vals = {1,2,3};
            String obj = null;

            vals[Integer.parseInt((String)obj)] = 3 / val; // this will throw a NullPointerException

        } catch (ArithmeticException ex) {
            ex.printStackTrace(); // this will print the stack trace
            // this will not run because the exception is not an ArithmeticException
            System.out.println("You can't divide by zero");
        } catch (ArrayIndexOutOfBoundsException ex) {
            ex.printStackTrace();
            // this will not run because the exception is not an ArrayIndexOutOfBoundsException
            System.out.println("That was outside of the array");
        } catch (NullPointerException ex) {
            // this is the generic exception, it will catch any exception
            // this should be the last catch block
            System.out.println("You can't do that");
        }

        // every exception in Java comes from the Exception class

        try {
            int val = 0;
            int[] vals = {1,2,3};
            String obj = null;

            vals[Integer.parseInt((String)obj)] = 3 / val; // this will throw a NullPointerException

        } catch(Exception ex){
            // this will catch any exception
            // should be last catch block because it is the most generic
            // this should be the last catch block
            System.out.println("Catch all");
        }
        // all of the above exceptions are runtime exceptions
        // Java does not know if these occur at compile time only when the code is running
    }
        System.out.println("Method finished");
        }
