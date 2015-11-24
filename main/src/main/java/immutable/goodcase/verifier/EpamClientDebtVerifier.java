package immutable.goodcase.verifier;

import immutable.goodcase.EpamClient;

/**
 * Created by Kanstantsin_Makarau on 24-Nov-15.
 */
public class EpamClientDebtVerifier implements EpamClientVerifier {
    public void verify(EpamClient epamClient) {
        System.out.println(epamClient.toString() + " debt was verified");
    }
}
