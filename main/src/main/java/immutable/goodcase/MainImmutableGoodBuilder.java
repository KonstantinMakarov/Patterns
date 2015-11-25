package immutable.goodcase;

import java.time.Instant;
import java.util.Date;

/**
 * Created by Kanstantsin_Makarau on 24-Nov-15.
 */
public class MainImmutableGoodBuilder {
    public static void main(String[] args) throws Exception {
        EpamClient.Builder builder = new EpamClient.Builder();
        EpamClient ivan = builder.name("Ivan").debt(1000).bonusPoints(20).date(Date.from(Instant.now())).build();
        EpamClient yra = builder.name("Yra").bonusPoints(13).date(Date.from(Instant.now())).debt(200).build();
        System.out.println(ivan);
        System.out.println(yra);
    }
}
