package composite.etities;

/**
 * Created by Kanstantsin_Makarau on 18-Sep-15.
 */
public abstract class Relative {

    protected String name;

    public Relative(String name){
        this.name = name;
    }

    public abstract void sayInfo();
}
