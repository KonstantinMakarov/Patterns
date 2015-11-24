package immutable.goodcase.verifier;

import immutable.goodcase.EpamClient;
import org.apache.commons.lang3.StringUtils;
import org.testng.Assert;

/**
 * Created by Kanstantsin_Makarau on 24-Nov-15.
 */
public class EpamClientNameVerifier implements EpamClientVerifier {

    public void verify(EpamClient epamClient) {
        Assert.assertNotNull(epamClient.getName());
        Assert.assertTrue(StringUtils.isNotBlank(epamClient.getName()));
        Assert.assertTrue(StringUtils.containsNone(epamClient.getName(), "0123456789"));
        //any assertions
        System.out.println(epamClient.toString() + " name was verified");
    }

}
