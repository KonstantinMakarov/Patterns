package builder.soldierbuider;

/**
 * Created by Kanstantsin_Makarau on 11-Sep-15.
 */
public class DachaBuilder extends AbstractHouseBuilder {

    @Override
    public void buildHouseWalls() {
        house.setWall("green");
    }

    @Override
    public void buildHouseBase() {
        house.setBase("grey");
    }

    @Override
    public void buildHouseRoof() {
        house.setRoof("red");
    }
}
