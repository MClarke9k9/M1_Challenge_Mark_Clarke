package com.company;

import java.util.Objects;

public class Human {

    private String race;
    private int health;
    private int stamina;

    public Human() {
        race = "Human";
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public void run(){
        System.out.println("I'm running! CYA!");
    }

    public void attack(){
        System.out.println("I'm attacking! >:O");
    }

    public void heal(){
        System.out.println("I'm healing. Time to get Better!");
    }

    public void decreaseHealth(){
        System.out.println("My health decreasing!");
    }

    public void increaseStamina(){
        System.out.println("My stamina increasing!");
    }

    public void decreaseStamina(){
        System.out.println("My stamina decreasing!");
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return getHealth() == human.getHealth() && getStamina() == human.getStamina() && Objects.equals(getRace(), human.getRace());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRace(), getHealth(), getStamina());
    }

    @Override
    public String toString() {
        return "Human{" +
                "race='" + race + '\'' +
                ", health=" + health +
                ", stamina=" + stamina +
                '}';
    }
}