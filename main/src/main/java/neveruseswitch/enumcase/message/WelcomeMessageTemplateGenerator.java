package neveruseswitch.enumcase.message;

/**
 * Created by Kanstantsin_Makarau on 12-Nov-15.
 */
public class WelcomeMessageTemplateGenerator implements MessageTemplateGenerator {
    public String getBody() {
        return "<html>Welcome new user!</html>";
    }
}
