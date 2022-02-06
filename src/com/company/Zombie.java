package com.company;

public class Zombie extends Monster {
    public Zombie(String name) {
        super();
    }

    @Override
    public void growl() {
       System.out.print("Raaaauuughhhh");
        super.growl();
    }

    @Override
    public void attack() {
        super.attack();
        growl();
    }
}
