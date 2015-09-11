package builder.specificbuider;

import builder.AbstractSoldierBuilder;

/**
 * Created by Kanstantsin_Makarau on 11-Sep-15.
 */
public class MageBuilder extends AbstractSoldierBuilder {

    @Override
    public void buildSoldierHitPoints() {
        soldier.setHitPoints("300 hp");
    }

    @Override
    public void buildSoldierAttackDistance() {
        soldier.setAttackDistance("100m");
    }

    @Override
    public void buildSoldierWeapon() {
        soldier.setWeapon("Magic");
    }
}
