package builder.soldierbuider;

/**
 * Created by Kanstantsin_Makarau on 11-Sep-15.
 */
public class VillaBuilder extends AbstractHouseBuilder {

    @Override
    public void buildHouseWalls() {
        house.setWall("gold");
    }

    @Override
    public void buildHouseBase() {
        house.setBase("dark-gold");
    }

    @Override
    public void buildHouseRoof() {
        house.setRoof("glass");
    }
}
