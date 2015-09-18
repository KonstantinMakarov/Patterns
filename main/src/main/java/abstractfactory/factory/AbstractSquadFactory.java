package abstractfactory.factory;

import abstractfactory.entities.Archer;
import abstractfactory.entities.Mage;
import abstractfactory.entities.Warrior;

/**
 * Created by Kanstantsin_Makarau on 18-Sep-15.
 */
public interface AbstractSquadFactory {
    Archer createArcher();
    Mage createMage();
    Warrior createWarrior();
}
