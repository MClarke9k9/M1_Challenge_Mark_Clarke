package com.company;

import java.util.Objects;

public class Constable extends Human{

    private String name;
    private String characterType;
    private int strength;
    private int health;
    private int stamina;
    private int speed;
    private int attackPower;
    private boolean jurisdiction;

    public Constable(String name) {
        this.name = name;
        characterType = "Constable";
        strength = 60;
        health = 100;
        stamina = 60;
        speed = 20;
        attackPower = 5;
        jurisdiction = true;
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

    public boolean isJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(boolean jurisdiction) {
        this.jurisdiction = jurisdiction;
    }


    public void arrest(){
        System.out.println("Your going down buddy!");
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Constable)) return false;
        if (!super.equals(o)) return false;
        Constable constable = (Constable) o;
        return getStrength() == constable.getStrength() && getHealth() == constable.getHealth() && getStamina() == constable.getStamina() && getSpeed() == constable.getSpeed() && getAttackPower() == constable.getAttackPower() && isJurisdiction() == constable.isJurisdiction() && Objects.equals(getName(), constable.getName()) && Objects.equals(getCharacterType(), constable.getCharacterType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getName(), getCharacterType(), getStrength(), getHealth(), getStamina(), getSpeed(), getAttackPower(), isJurisdiction());
    }

    @Override
    public String toString() {
        return "Constable{" +
                "name='" + name + '\'' +
                ", characterType='" + characterType + '\'' +
                ", strength=" + strength +
                ", health=" + health +
                ", stamina=" + stamina +
                ", speed=" + speed +
                ", attackPower=" + attackPower +
                ", jurisdiction=" + jurisdiction +
                '}';
    }
}