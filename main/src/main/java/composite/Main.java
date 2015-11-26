package composite;

import composite.etities.container.*;
import composite.etities.leaf.*;

/**
 * Created by Kanstantsin_Makarau on 18-Sep-15.
 */
public class Main {
    public static void main(String[] args){
        AbstractLeaf iAm= new IamLeaf("Konstantin", 22);
        AbstractLeaf nephew = new NephewLeaf("Timur", 8);
        AbstractLeaf cousin = new CousinLeaf("Artem", 7);

        AbstractContainer mum = new MumContainer("Irina", 55);
        AbstractContainer brother = new BrotherContainer("Anton", 35);
        AbstractContainer grandfather = new GrandfatherContainer("Yura", 81);
        AbstractContainer aunt = new AuntContainer("Eugene", 42);

        mum.add(iAm);
        mum.add(brother);

        brother.add(nephew);

        aunt.add(cousin);

        grandfather.add(mum);
        grandfather.add(aunt);


        System.out.println("grandfather general age : " + grandfather.calculateAge());
    }
}
