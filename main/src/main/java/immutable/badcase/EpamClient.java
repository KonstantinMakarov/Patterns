package immutable.badcase;

/**
 * Created by Kanstantsin_Makarau on 24-Nov-15.
 */
public final class EpamClient {
    public final String name;
    public final int bonusPoints;
    public final int debt;

    public EpamClient(String name, int bonusPoints, int debt) {
        this.name = name;
        this.bonusPoints = bonusPoints;
        this.debt = debt;
    }

    public final EpamClient increaseBonus(int amount){
        return new EpamClient(this.name, this.bonusPoints + amount, this.debt);
    }

    @Override
    public String toString() {
        return "EpamClient{" +
                "name='" + name + '\'' +
                ", bonusPoints=" + bonusPoints +
                ", debt=" + debt +
                '}';
    }
}
