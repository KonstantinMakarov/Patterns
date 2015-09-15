package builder;

import builder.housebuider.AbstractHouseBuilder;
import builder.housebuider.DachaBuilder;

/**
 * Created by Kanstantsin_Makarau on 11-Sep-15.
 *
 * instance: http://www.tutorialspoint.com/design_pattern/builder_pattern.htm
 */
public class Main {
    public static void main(String[] args) {
        AbstractHouseBuilder builder = new DachaBuilder();
        Director director = new Director();

        House house = director.createHouse(builder);
        System.out.println(house.getRoof());
    }
}
