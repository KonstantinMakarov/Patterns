package factorymethod.factories;

import factorymethod.entyties.Meat;

/**
 * Use for ...
 */
public class MeatFactory implements AbstractMealFactory{
    public Meat createMeal() {
        return new Meat();
    }
}
