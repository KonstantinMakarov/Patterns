package builder.specificbuider;

import builder.AbstractSoldierBuilder;

/**
 * Created by Kanstantsin_Makarau on 11-Sep-15.
 */
public class WarriorBuilder extends AbstractSoldierBuilder {

    @Override
    public void buildSoldierHitPoints() {
        soldier.setHitPoints("1200 hp");
    }

    @Override
    public void buildSoldierAttackDistance() {
        soldier.setAttackDistance("20m");
    }

    @Override
    public void buildSoldierWeapon() {
        soldier.setWeapon("Sword");
    }
}
