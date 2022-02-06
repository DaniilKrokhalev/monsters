package com.company;

public class Monster {
    String name;
    int damage;
    // String growlSound;
    public Monster(String name, int damage) {
        this.name = name;
        this.damage = damage;
        //   this.growlSound = growlSound;
    }

    public void growl() {
        System.out.print(name + " growled");
    }

    public void attack() {
        System.out.print("Monster " + name + " was created" + "Monster " + name + " attacked with damage " + damage);
    }
   /* public void create() {
        System.out.print("Monster " + name + " was created");
    }*/
}
