package neveruseswitch.enumcase;


import neveruseswitch.enumcase.message.AutoReplyMessageTemplateGenerator;
import neveruseswitch.enumcase.message.PolicyExpiredMessageTemplateGenerator;
import neveruseswitch.enumcase.message.WelcomeMessageTemplateGenerator;

/**
 * Created by Kanstantsin_Makarau on 12-Nov-15.
 */
public enum MessageTemplateGenerator {
    WELCOME(new WelcomeMessageTemplateGenerator(), 1),
    AUTO_REPLY(new AutoReplyMessageTemplateGenerator(), 2),
    POLICY_EXPIRED(new PolicyExpiredMessageTemplateGenerator(), 3);

    private int dbCode;
    private neveruseswitch.enumcase.message.MessageTemplateGenerator message;

    MessageTemplateGenerator(neveruseswitch.enumcase.message.MessageTemplateGenerator message, int dbCode) {
        this.dbCode = dbCode;
        this.message = message;
    }

    public static neveruseswitch.enumcase.message.MessageTemplateGenerator generateMessage(int dbCode) {
        for(MessageTemplateGenerator currentMessage: values()){
            if(currentMessage.dbCode == dbCode){
                return currentMessage.message;
            }
        }
        throw new RuntimeException("dbCode is unknown");
    }
}
