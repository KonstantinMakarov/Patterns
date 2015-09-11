package builder;

import builder.specificbuider.WarriorBuilder;

/**
 * Created by Kanstantsin_Makarau on 11-Sep-15.
 */
public class Main {
    public static void main(String[] args) {
        AbstractSoldierBuilder builder = new WarriorBuilder();
        Director director = new Director();


        Soldier soldier = director.createSoldier(builder);
        System.out.println(soldier.getAttackDistance());
    }
}
