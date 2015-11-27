package adapter;

/**
 * Created by Kanstantsin_Makarau on 27-Nov-15.
 */
public class Adapter implements Priceble {
   Costable costable;

    public Adapter(Costable product) {
        this.costable = product;
    }

    @Override
    public int gePrice() {
        return costable.getCost();
    }
}
