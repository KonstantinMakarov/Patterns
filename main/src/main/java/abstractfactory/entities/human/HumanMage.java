package abstractfactory.entities.human;

import abstractfactory.entities.Mage;

/** 1
 * Created by Kanstantsin_Makarau on 18-Sep-15.
 */
public class HumanMage implements Mage{
    public void castSpell() {
        System.out.println("cast a spell from human");
    }
}
