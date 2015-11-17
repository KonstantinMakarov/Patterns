package neveruseswitch.enumcase.message;

/**
 * Created by Kanstantsin_Makarau on 12-Nov-15.
 */
public class PolicyExpiredMessageTemplateGenerator implements MessageTemplateGenerator {
    public String getBody() {
        return "<html>You policy is expired</html>";
    }
}
