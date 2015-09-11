package builder;

/**
 * Created by Kanstantsin_Makarau on 11-Sep-15.
 */
public class Director {

    public Soldier createSoldier(AbstractSoldierBuilder builder){
        builder.buildSoldierAttackDistance();
        builder.buildSoldierHitPoints();
        builder.buildSoldierWeapon();
        return builder.getSoldier();
    }
}
