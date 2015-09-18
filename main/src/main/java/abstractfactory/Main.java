package abstractfactory;

import abstractfactory.entities.Archer;
import abstractfactory.entities.Mage;
import abstractfactory.entities.Warrior;
import abstractfactory.factory.AbstractSquadFactory;
import abstractfactory.factory.ElfSquadFactory;
import abstractfactory.factory.HumanSquadFactory;
import abstractfactory.factory.OrcSquadFactory;

/**
 * Created by Kanstantsin_Makarau on 17-Sep-15.
 * <p>
 * instance: http://www.javenue.info/post/27
 */
public class Main {
    public static void main(String[] args) {
        AbstractSquadFactory abstractFactory = new ElfSquadFactory();
        Archer favouriteArcher = abstractFactory.createArcher();
        favouriteArcher.shoot();

        abstractFactory = new OrcSquadFactory();
        Warrior favouriteWarrior = abstractFactory.createWarrior();
        favouriteWarrior.hit();

        abstractFactory = new HumanSquadFactory();
        Mage favouriteMage = abstractFactory.createMage();
        favouriteMage.castSpell();

    }
}
