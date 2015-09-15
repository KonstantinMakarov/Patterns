package builder;

import builder.housebuider.AbstractHouseBuilder;

/**
 * Created by Kanstantsin_Makarau on 11-Sep-15.
 */
public class Director {

    public House createHouse(AbstractHouseBuilder builder){
        builder.createEmptyHouse();
        builder.buildHouseBase();
        builder.buildHouseWalls();
        builder.buildHouseRoof();
        return builder.getHouse();
    }
}
