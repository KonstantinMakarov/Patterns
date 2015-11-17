package neveruseswitch.annotationcase.message;

import neveruseswitch.annotationcase.TemplateCode;

/**
 * Created by Kanstantsin_Makarau on 12-Nov-15.
 */

@TemplateCode(2)
public class AutoReplyMessageTemplateGenerator implements MessageTemplateGenerator {
    public String getBody(){
        return "<html>Don't call us we call you</html>";
    }
}
