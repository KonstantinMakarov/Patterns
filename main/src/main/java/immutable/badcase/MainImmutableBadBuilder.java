package immutable.badcase;

import immutable.badcase.EpamClient;

/**
 * Created by Kanstantsin_Makarau on 24-Nov-15.
 */
public class MainImmutableBadBuilder {
    public static void main(String[] args){
        EpamClient epamClient = new EpamClient("Kostya", 13, 5000); //and what about 10 args to constructor?
        epamClient = epamClient.increaseBonus(2);
        System.out.println(epamClient);
    }
}
