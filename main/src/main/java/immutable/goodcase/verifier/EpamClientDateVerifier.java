package immutable.goodcase.verifier;

import immutable.goodcase.EpamClient;
import org.testng.Assert;

/**
 * Created by Kanstantsin_Makarau on 25-Nov-15.
 */
public class EpamClientDateVerifier implements EpamClientVerifier {
    public void verify(EpamClient epamClient) {
        Assert.assertNotNull(epamClient.getDate());
        System.out.println(epamClient.toString() + " date was verified");
    }
}
