package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(50);
        boss.setDefenceType("Physical");
        System.out.println("Boss health: " + boss.getHealth() + "\nBoss damage: " + boss.getDamage()
                + "\nBoss defence type: " + boss.getDefenceType());

        createHeroes();
        Hero[] heroesMas = new Hero[]{};


    }

    public static Hero[] createHeroes() {
        Hero physical = new Hero(260, 23, "Physical");
        Hero magical = new Hero(220, 26, "Magical");
        Hero hero = new Hero(200, 20);

        return new Hero[]{
                physical, magical, hero
        };
    }
}
