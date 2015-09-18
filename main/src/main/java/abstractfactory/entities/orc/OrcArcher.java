package abstractfactory.entities.orc;

import abstractfactory.entities.Archer;

/**
 * Created by Kanstantsin_Makarau on 18-Sep-15.
 */
public class OrcArcher implements Archer{
    public void shoot() {
        System.out.println("shoot from orc");
    }
}
