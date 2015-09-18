package abstractfactory.entities.elf;

import abstractfactory.entities.Mage;

/**
 * Created by Kanstantsin_Makarau on 18-Sep-15.
 */
public class ElfMage implements Mage{
    public void castSpell() {
        System.out.println("cast spell from elf");
    }
}
