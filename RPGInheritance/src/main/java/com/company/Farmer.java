package com.company;

import java.util.Objects;

public class Farmer extends Human {

    private String name;
    private String characterType;
    private int strength;
    private int health;
    private int stamina;
    private int speed;
    private int attackPower;


    public Farmer(String name) {
        this.name = name;
        characterType = "Farmer";
        strength = 75;
        health = 100;
        stamina = 75;
        speed = 10;
        attackPower = 1;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getCharacterType() {
        return characterType;
    }

    public void setCharacterType(String characterType) {
        this.characterType = characterType;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public int getStamina() {
        return stamina;
    }

    @Override
    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }



    public void plow(){
        System.out.println("I'm plowing dirt.");
    }

    public void harvest(){
        System.out.println("I'm harvesting!");
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Farmer)) return false;
        if (!super.equals(o)) return false;
        Farmer farmer = (Farmer) o;
        return getStrength() == farmer.getStrength() && getHealth() == farmer.getHealth() && getStamina() == farmer.getStamina() && getSpeed() == farmer.getSpeed() && getAttackPower() == farmer.getAttackPower() && Objects.equals(getCharacterType(), farmer.getCharacterType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getCharacterType(), getStrength(), getHealth(), getStamina(), getSpeed(), getAttackPower());
    }

    @Override
    public String toString() {
        return "Farmer{" +
                "name='" + name + '\'' +
                ", characterType='" + characterType + '\'' +
                ", strength=" + strength +
                ", health=" + health +
                ", stamina=" + stamina +
                ", speed=" + speed +
                ", attackPower=" + attackPower +
                '}';
    }
}