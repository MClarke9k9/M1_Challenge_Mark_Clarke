package com.company;

import java.util.Objects;

public class Warrior extends Human {


    private String name;
    private String characterType;
    private int strength;
    private int health;
    private int stamina;
    private int speed;
    private int attackPower;
    private int shieldStrength;


    public Warrior(String name) {
        this.name = name;
        characterType = "Warrior";
        strength = 75;
        health = 100;
        stamina = 100;
        speed = 50;
        attackPower = 10;
        shieldStrength = 100;
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

    public int getShieldStrength() {
        return shieldStrength;
    }

    public void setShieldStrength(int shieldStrength) {
        this.shieldStrength = shieldStrength;
    }

    public void decreaseShieldStrength() {
        System.out.println("My shield strength is decreasing!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Warrior)) return false;
        Warrior warrior = (Warrior) o;
        return getStrength() == warrior.getStrength() && getHealth() == warrior.getHealth() && getStamina() == warrior.getStamina() && getSpeed() == warrior.getSpeed() && getAttackPower() == warrior.getAttackPower() && getShieldStrength() == warrior.getShieldStrength() && Objects.equals(getName(), warrior.getName()) && Objects.equals(getCharacterType(), warrior.getCharacterType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCharacterType(), getStrength(), getHealth(), getStamina(), getSpeed(), getAttackPower(), getShieldStrength());
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "name='" + name + '\'' +
                ", characterType='" + characterType + '\'' +
                ", strength=" + strength +
                ", health=" + health +
                ", stamina=" + stamina +
                ", speed=" + speed +
                ", attackPower=" + attackPower +
                ", shieldStrength=" + shieldStrength +
                '}';
    }
}