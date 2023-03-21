package com.skillstorm.beans;

//interfaces need to use interface keyword
// cannot be final
// the only valid keywords are public and abstract
// everything in an interface is public and abstract

public interface Shark {
    // any variable in an interface is public static final
    String myName = "Miles";

    // these methods are abstract
    // they do not have a body
    // they are just a signature
    // they have no implementation
    // every class that implements this interface will have these methods
    public void swim(double distance);
    public void bite();
    public void hunt();




}
