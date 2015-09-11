package builder.specificbuider;

import builder.AbstractSoldierBuilder;
import builder.Soldier;

/**
 * Created by Kanstantsin_Makarau on 11-Sep-15.
 */
public class ArcherBuilder extends AbstractSoldierBuilder{

    @Override
    public void buildSoldierHitPoints() {
        soldier.setHitPoints("700 hp");
    }

    @Override
    public void buildSoldierAttackDistance() {
        soldier.setAttackDistance("500m");
    }

    @Override
    public void buildSoldierWeapon() {
        soldier.setWeapon("Bow");
    }
}
