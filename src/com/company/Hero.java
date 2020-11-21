package com.company;

public class Hero {
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    private int health;
    private int damage;
    private String ability;

    public Hero(int health, int damage, String ability) {
        this.health = health;
        this.damage = damage;
        this.ability = ability;

    }
    public Hero(){}
    public Hero(int health,int damage){
        this.health = health;
        this.damage = damage;
    }
}
