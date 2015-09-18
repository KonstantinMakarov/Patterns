package abstractfactory.entities.elf;

import abstractfactory.entities.Warrior;

/**
 * Created by Kanstantsin_Makarau on 18-Sep-15.
 */
public class ElfWarrior implements Warrior{
    public void hit() {
        System.out.println("hit from elf");
    }
}
