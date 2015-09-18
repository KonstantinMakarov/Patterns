package abstractfactory.factory;

import abstractfactory.entities.Archer;
import abstractfactory.entities.Mage;
import abstractfactory.entities.Warrior;
import abstractfactory.entities.human.HumanArcher;
import abstractfactory.entities.human.HumanMage;
import abstractfactory.entities.human.HumanWarrior;

/**
 * Created by Kanstantsin_Makarau on 18-Sep-15.
 */
public class HumanSquadFactory implements AbstractSquadFactory{
    public Archer createArcher() {
        return new HumanArcher();
    }

    public Mage createMage() {
        return new HumanMage();
    }

    public Warrior createWarrior() {
        return new HumanWarrior();
    }
}
