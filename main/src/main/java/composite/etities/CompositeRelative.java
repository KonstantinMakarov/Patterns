package composite.etities;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kanstantsin_Makarau on 18-Sep-15.
 */
public class CompositeRelative extends Relative {

    List<Relative> relatives = new ArrayList<Relative>();

    public CompositeRelative(String name) {
        super(name);
    }

    @Override
    public void sayInfo() {
        System.out.println("-My name is " + name + ". And they are my children:");
        for (Relative currentRelative : relatives) {
            currentRelative.sayInfo();
        }
    }

    public void addRelative(Relative relative){
        relatives.add(relative);
    }
}
