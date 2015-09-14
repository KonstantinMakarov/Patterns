package factorymethod.factories;

import factorymethod.entyties.Fish;

/**
 * Use for ...
 */
public class FishFactory implements AbstractMealFactory {
    public Fish createMeal() {
        return new Fish();
    }
}
