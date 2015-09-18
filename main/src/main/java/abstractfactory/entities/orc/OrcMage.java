package abstractfactory.entities.orc;

import abstractfactory.entities.Mage;

/**
 * Created by Kanstantsin_Makarau on 18-Sep-15.
 */
public class OrcMage  implements Mage{
    public void castSpell() {
        System.out.println("cast a spell from orc");
    }
}
