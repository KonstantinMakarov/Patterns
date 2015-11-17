package neveruseswitch.annotationcase.message;

import neveruseswitch.annotationcase.TemplateCode;

/**
 * Created by Kanstantsin_Makarau on 12-Nov-15.
 */
@TemplateCode(1)
public class WelcomeMessageTemplateGenerator implements MessageTemplateGenerator {
    public String getBody() {
        return "<html>Welcome new user!</html>";
    }
}
