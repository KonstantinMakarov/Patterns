package abstractfactory.factory;

import abstractfactory.entities.Archer;
import abstractfactory.entities.Mage;
import abstractfactory.entities.Warrior;
import abstractfactory.entities.elf.ElfArcher;
import abstractfactory.entities.elf.ElfMage;
import abstractfactory.entities.elf.ElfWarrior;

/**
 * Created by Kanstantsin_Makarau on 18-Sep-15.
 */
public class ElfSquadFactory implements AbstractSquadFactory {
    public Archer createArcher() {
        return new ElfArcher();
    }

    public Mage createMage() {
        return new ElfMage();
    }

    public Warrior createWarrior() {
        return new ElfWarrior();
    }
}
