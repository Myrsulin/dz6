package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(300);
        boss.setDamege(50);
        boss.setAttackType(" Magic ");
        boss.weapon.setNameOfGun(" Kaka47 ");
        boss.weapon.setNameOfGun("Firearms");
        System.out.println(boss.getHealth() + " " + boss.getDamege() + " " + boss.getAttackType());


    }
}
