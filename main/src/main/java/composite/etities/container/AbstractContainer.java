package composite.etities.container;

import composite.etities.Calculable;
import composite.etities.Container;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kanstantsin_Makarau on 18-Sep-15.
 */
public abstract class AbstractContainer implements Container {

    protected final String name;
    protected final int age;

    protected List<Calculable> childList = new ArrayList<>();

    public AbstractContainer(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public void add(Calculable element) {
        childList.add(element);
    }

    @Override
    public void remove(Calculable element) {
        childList.remove(element);
    }

    @Override
    public int calculateAge() {
        int sumAge = age;
        for (Calculable currentChild : childList) {
            sumAge += currentChild.calculateAge();
        }
        return sumAge;
    }
}
