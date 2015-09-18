package abstractfactory.entities.human;

import abstractfactory.entities.Archer;

/**
 * Created by Kanstantsin_Makarau on 18-Sep-15.
 */
public class HumanArcher implements Archer{
    public void shoot() {
        System.out.println("shoot from human");
    }
}
