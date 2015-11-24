package immutable.goodcase;

import immutable.goodcase.EpamClient;

/**
 * Created by Kanstantsin_Makarau on 24-Nov-15.
 */
public class MainImmutableGoodBuilder {
    public static void main(String[] args) throws Exception {
        EpamClient.Builder builder = new EpamClient.Builder();
        EpamClient ivan = builder.name("Ivan").debt(1000).bonusPoints(20).build();
        EpamClient yra = builder.name("Yra").debt(200).bonusPoints(30).build();
        System.out.println(ivan);
        System.out.println(yra);
    }
}
