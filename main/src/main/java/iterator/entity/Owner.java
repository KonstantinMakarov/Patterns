package iterator.entity;

import iterator.Calculable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Kanstantsin_Makarau on 25-Nov-15.
 */
public class Owner {

    private List<Calculable> propertyList = new ArrayList<Calculable>();

    public int wholeCalculate () {
        int totalCost = 0;
        for(Calculable currentProperty: propertyList){
            totalCost += currentProperty.calculateCost();
        }
        return totalCost;
    }

    public void addProperty(Calculable property) {
        propertyList.add(property);
    }

    public List<Calculable> getPropertyList() {
        return Collections.unmodifiableList(propertyList);
    }
}
