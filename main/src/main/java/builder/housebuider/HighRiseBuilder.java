package builder.housebuider;

/**
 * Created by Kanstantsin_Makarau on 11-Sep-15.
 */
public class HighRiseBuilder extends AbstractHouseBuilder {

    @Override
    public void buildHouseWalls() {
        house.setWall("blue");
    }

    @Override
    public void buildHouseBase() {
        house.setBase("red");
    }

    @Override
    public void buildHouseRoof() {
        house.setRoof("black");
    }
}
