package composite.etities;

/**
 * Created by Kanstantsin_Makarau on 18-Sep-15.
 */
public class LeafRelative extends Relative{

    public LeafRelative(String name) {
        super(name);
    }

    public void sayInfo() {
        System.out.println("My name is " + name);
    }
}
