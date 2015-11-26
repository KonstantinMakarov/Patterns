package composite.etities;

/**
 * Created by Kanstantsin_Makarau on 26-Nov-15.
 */
public interface Container extends Calculable {
    void add(Calculable element);
    void remove(Calculable element);

}
