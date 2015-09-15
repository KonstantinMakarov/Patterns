package factorymethod.factories;

import factorymethod.entyties.Meat;

/**
 * Created by Kanstantsin_Makarau on 14-Sep-15.
 */
public class MeatFactory implements AbstractMealFactory{
    public Meat createMeal() {
        return new Meat();
    }
}
