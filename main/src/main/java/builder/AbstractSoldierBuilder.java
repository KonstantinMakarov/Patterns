package builder;

/**
 * Created by Kanstantsin_Makarau on 11-Sep-15.
 */
public abstract class AbstractSoldierBuilder {
    protected Soldier soldier;

    public void createNewSoldier(){
        soldier = new Soldier();
    }

    public Soldier getSoldier(){
        return soldier;
    }

    abstract public void buildSoldierHitPoints();
    abstract public void buildSoldierAttackDistance();
    abstract public void buildSoldierWeapon();
}
