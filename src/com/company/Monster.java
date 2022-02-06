package com.company;

public class Monster {
    String name;
    int damage;
    String growlSound;

    public void growl() {
        System.out.print(growlSound);
    }

    public void attack() {
        System.out.print(damage);
    }
    public void create() {
        System.out.print("Monster " + name + " the " + getClass() + " was created");
    }
}

