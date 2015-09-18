package abstractfactory.factory;

import abstractfactory.entities.Archer;
import abstractfactory.entities.Mage;
import abstractfactory.entities.Warrior;
import abstractfactory.entities.orc.OrcArcher;
import abstractfactory.entities.orc.OrcMage;
import abstractfactory.entities.orc.OrcWarrior;

/**
 * Created by Kanstantsin_Makarau on 18-Sep-15.
 */
public class OrcSquadFactory implements AbstractSquadFactory {
    public Archer createArcher() {
        return new OrcArcher();
    }

    public Mage createMage() {
        return new OrcMage();
    }

    public Warrior createWarrior() {
        return new OrcWarrior();
    }
}
