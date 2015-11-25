package immutable.goodcase.verifier;

import immutable.goodcase.EpamClient;
import org.testng.Assert;

/**
 * Created by Kanstantsin_Makarau on 24-Nov-15.
 */
public class EpamClientDebtVerifier implements EpamClientVerifier {
    public void verify(EpamClient epamClient) {
        Assert.assertNotNull(epamClient.getDebt());
        System.out.println(epamClient.toString() + " debt was verified");
    }
}
