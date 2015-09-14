package builder;

import builder.soldierbuider.AbstractHouseBuilder;
import builder.soldierbuider.DachaBuilder;

/**
 * Created by Kanstantsin_Makarau on 11-Sep-15.
 */
public class Main {
    public static void main(String[] args) {
        AbstractHouseBuilder builder = new DachaBuilder();
        Director director = new Director();

        House house = director.createHouse(builder);
        System.out.println(house.getRoof());
    }
}
