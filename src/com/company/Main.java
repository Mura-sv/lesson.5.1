package com.company;

public class Main {

    public static void main(String[] args) {

Boss boss = new Boss();
boss.setHealth(1000);
boss.setDamage(50);
boss.setDefenceType("Physical");
        System.out.println("Boss health: "+boss.getHealth()+" Boss damage: "+boss.getDamage()
                +" Boss defence type: "+boss.getDefenceType());
    }
}
