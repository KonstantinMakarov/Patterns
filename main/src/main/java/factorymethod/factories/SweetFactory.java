package factorymethod.factories;

import factorymethod.entyties.Sweet;

/**
 * Use for ...
 */
public class SweetFactory implements AbstractMealFactory {
    public Sweet createMeal() {
        return new Sweet();
    }
}
