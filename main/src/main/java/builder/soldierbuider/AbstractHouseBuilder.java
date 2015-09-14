package builder.soldierbuider;

import builder.House;

/**
 * Created by Kanstantsin_Makarau on 11-Sep-15.
 */
public abstract class AbstractHouseBuilder {
    protected House house;

    public void createEmptyHouse(){
        house = new House();
    }

    public House getHouse(){
        return house;
    }

    abstract public void buildHouseWalls();
    abstract public void buildHouseBase();
    abstract public void buildHouseRoof();
}
