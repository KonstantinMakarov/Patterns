package neveruseswitch.enumcase;

import neveruseswitch.DBUtil;

/**
 * Created by Kanstantsin_Makarau on 12-Nov-15.
 */
public class MainEnumCase {
    public static void main(String[] args){
        int dbCode = DBUtil.getMailId();
        neveruseswitch.enumcase.message.MessageTemplateGenerator message = MessageTemplateGenerator.generateMessage(dbCode);
        sendMessage(message.getBody());
    }

    private static void sendMessage(String message) {
        //50 lines of business code
        System.out.println(message);
    }

}
