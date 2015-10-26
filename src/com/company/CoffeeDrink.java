package com.company;

import java.util.LinkedList;

/**
 *
 * Represents a Coffee drink sold by a coffee shop.
 * CoffeeDrink objects have a name e.g. Cappuccino and a price e.g. $3.00.
 *
 * */
public class CoffeeDrink {

    private String nameOfDrink;
    private double price;

    //not used here (yet)
    LinkedList ingredients = new LinkedList();  //you could save ingredients here



    //Constructor

    public CoffeeDrink(String name, double price) {

        this.nameOfDrink = name;
        this.price = price;

    }

    public void setName(String name) {
        System.out.println("Calling the CoffeeDrink setName method");
        System.out.println("Setting the CoffeeDrink object's name to " + name);
        this.nameOfDrink = name;
    }

    public String getName() {
        return this.nameOfDrink;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }

}
