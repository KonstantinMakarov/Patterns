package builder;

/**
 * Created by Kanstantsin_Makarau on 11-Sep-15.
 */
public class Soldier {
    private String hitPoints = null;
    private String attackDistance = null;
    private String weapon= null;

    public String getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(String hitPoints) {
        this.hitPoints = hitPoints;
    }

    public String getAttackDistance() {
        return attackDistance;
    }

    public void setAttackDistance(String attackDistance) {
        this.attackDistance = attackDistance;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getWeapon() {
        return weapon;
    }
}
