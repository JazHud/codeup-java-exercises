package com.codeup.java.rpg;

public class FighterTest {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter(); //<-- new is calling upon the blueprint of rpg.Fighter class within rpg.FighterTest.java
//        fighter1.printStats();
        fighter1.setName ("Arata");
//        fighter1.hitPoints = 17;
        fighter1.setHitPoints(17);
        fighter1.setMaxDamage(14);
        fighter1.printStats();
        fighter1.battleRoar();
        int fighter1attackRoll = fighter1.attackRoll();
        System.out.printf("%s attacks and rolls a %d%n", fighter1.getName(), fighter1attackRoll);

        Fighter fighter2 = new Fighter();
        fighter2.setName("Sozalix");
        fighter2.battleRoar();
    }
}
