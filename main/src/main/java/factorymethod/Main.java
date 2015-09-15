package factorymethod;

import factorymethod.entyties.Meal;
import factorymethod.factories.FishFactory;
import factorymethod.factories.MeatFactory;
import factorymethod.factories.SweetFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kanstantsin_Makarau on 14-Sep-15.
 *
 * instance: http://allmycircuitz.blogspot.com.by/2013/07/factory-method.html
 */
public class Main {

    public static void main(String[] args) {
        FishFactory fishFactory = new FishFactory();
        MeatFactory meatFactory = new MeatFactory();
        SweetFactory sweetFactory = new SweetFactory();

        List<Meal> meals = new ArrayList<Meal>();
        meals.add(fishFactory.createMeal());
        meals.add(meatFactory.createMeal());
        meals.add(sweetFactory.createMeal());

        System.out.println("list of meals");
        for(Meal currentMeal : meals){
            currentMeal.info();
        }
    }


}
