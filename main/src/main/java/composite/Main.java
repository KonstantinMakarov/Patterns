package composite;

import composite.etities.CompositeRelative;
import composite.etities.LeafRelative;

/**
 * Created by Kanstantsin_Makarau on 18-Sep-15.
 */
public class Main {
    public static void main(String[] args){
        LeafRelative iAm= new LeafRelative("Konstantin");
        LeafRelative nephew = new LeafRelative("Timur");
        LeafRelative cousin = new LeafRelative("Artem");
        CompositeRelative mum = new CompositeRelative("Irina");
        CompositeRelative dad = new CompositeRelative("Gennady");
        CompositeRelative stepbrother = new CompositeRelative("Anton");
        CompositeRelative grandfather = new CompositeRelative("Yura");
        CompositeRelative aunt = new CompositeRelative("Eugene");

        mum.addRelative(iAm);
        mum.addRelative(stepbrother);

        dad.addRelative(iAm);

        stepbrother.addRelative(nephew);

        aunt.addRelative(cousin);

        grandfather.addRelative(mum);
        grandfather.addRelative(aunt);

        grandfather.sayInfo();
        System.out.println();
        dad.sayInfo();

    }
}
