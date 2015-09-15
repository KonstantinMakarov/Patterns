package factorymethod.factories;

import factorymethod.entyties.Fish;

/**
 * Created by Kanstantsin_Makarau on 14-Sep-15.
 */
public class FishFactory implements AbstractMealFactory {
    public Fish createMeal() {
        return new Fish();
    }
}
