package composite.etities.leaf;

import composite.etities.Calculable;

/**
 * Created by Kanstantsin_Makarau on 18-Sep-15.
 */
public abstract class AbstractLeaf implements Calculable {

    protected final String name;
    protected final int age;

    public AbstractLeaf(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int calculateAge() {
        return age;
    }
}
