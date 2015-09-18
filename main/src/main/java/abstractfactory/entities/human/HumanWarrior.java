package abstractfactory.entities.human;

import abstractfactory.entities.Warrior;

/**
 * Created by Kanstantsin_Makarau on 18-Sep-15.
 */
public class HumanWarrior implements Warrior{
    public void hit() {
        System.out.println("hit from human");
    }
}
