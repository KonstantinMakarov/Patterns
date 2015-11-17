package neveruseswitch.annotationcase.message;

import neveruseswitch.annotationcase.TemplateCode;

/**
 * Created by Kanstantsin_Makarau on 12-Nov-15.
 */
@TemplateCode(3)
public class PolicyExpiredMessageTemplateGenerator implements MessageTemplateGenerator {
    public String getBody() {
        return "<html>You policy is expired</html>";
    }
}
