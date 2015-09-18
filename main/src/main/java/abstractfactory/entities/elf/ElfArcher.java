package abstractfactory.entities.elf;

import abstractfactory.entities.Archer;

/**
 * Created by Kanstantsin_Makarau on 17-Sep-15.
 */
public class ElfArcher implements Archer{
    public void shoot() {
        System.out.println("shoot from elf");
    }
}
