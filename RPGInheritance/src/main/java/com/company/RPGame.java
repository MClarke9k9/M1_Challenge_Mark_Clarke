package com.company;

public class RPGame {


    public static void main(String[] args) {

        Farmer jimmy = new Farmer("Jimmy");
        Warrior mark = new Warrior("Mark!");
        Constable steve = new Constable("Steve");


        System.out.println(jimmy);
        System.out.println(mark);
        System.out.println(steve);

        jimmy.heal();
        mark.increaseStamina();
        steve.decreaseHealth();




    }
}
