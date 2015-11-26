package iterator;

import iterator.entity.Army;
import iterator.entity.Castle;
import iterator.entity.Civilians;
import iterator.entity.Owner;

/**
 * Created by Kanstantsin_Makarau on 25-Nov-15.
 */
public class MainIterator {
    public static void main(String[] args) {
        Owner player = new Owner();
        Army army = new Army();
        Castle castle = new Castle();
        Civilians civilians = new Civilians();
        player.addProperty(army);
        player.addProperty(castle);
        player.addProperty(civilians);

        System.out.println(player.wholeCalculate());
    }
}
