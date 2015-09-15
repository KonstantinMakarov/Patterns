package factorymethod.factories;

import factorymethod.entyties.Sweet;

/**
 * Created by Kanstantsin_Makarau on 14-Sep-15.
 */
public class SweetFactory implements AbstractMealFactory {
    public Sweet createMeal() {
        return new Sweet();
    }
}
