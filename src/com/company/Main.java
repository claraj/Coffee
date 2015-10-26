package com.company;


public class Main {

    public static void main(String[] args) {

        //Set coffee object's name to "Cappuccino" and price to $3.50

        CoffeeDrink coffee = new CoffeeDrink("Cappuccino", 3.50);

        //Without the constructor, we need to call the set methods.
     //   coffee.setName("Cappuccino");
     //   coffee.setPrice(3.50);


        /*

        //Before constructor - create CoffeeDrink object then call
        //the setName and setPrice methods.

        CoffeeDrink latte = new CoffeeDrink();
        latte.setName("Latte");
        latte.setPrice(3.00);
        */


        CoffeeDrink latte = new CoffeeDrink("Latte", 3);


        //You can still call the get and set methods if you need

        //For example, what if you need to get name of latte?

        System.out.println(latte.getName());

        //And the price of latte?

        System.out.println("A latte costs $" + latte.getPrice());

        //Perhaps we need to change the price....

        latte.setPrice(3.15);

        //get new price....

        System.out.println("A latte costs $" + latte.getPrice());
    


    }

}





