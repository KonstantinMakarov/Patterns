package abstractfactory.entities.orc;

import abstractfactory.entities.Warrior;

/**
 * Created by Kanstantsin_Makarau on 18-Sep-15.
 */
public class OrcWarrior implements Warrior{
    public void hit() {
        System.out.println("hit from orc");
    }
}
