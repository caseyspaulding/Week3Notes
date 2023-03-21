package com.skillstorm.beans;

public class GrandTouring extends Motorcycle {


    public GrandTouring() {
    }

    private String brand;
    private boolean trike;
    private String getModel;

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return this.brand;
    }
    public void setTrike(boolean trike) {
        this.trike = trike;
    }
    public boolean getTrike() {
        return this.trike;
    }
    public void setModel(String getModel) {
        this.getModel = getModel;
    }
    public String getModel() {
        return this.getModel;
    }


    public GrandTouring(String color, int topSpeed, String size, boolean trike) {
        setColor(color);
        setTopSpeed(topSpeed);
        setSize(size);
        setWheels(2);

        // if trike is true, it has 3 wheels.
        // else it has 2 wheels.
        if(trike){
            setWheels(3);
        }else {
            setWheels(2);
        }

    }

    @Override
    public void drive() {
        System.out.println("Vroom!");
    }

    public void park(String size) {
        System.out.println("moorV");
    }

}

