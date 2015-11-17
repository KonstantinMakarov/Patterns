package neveruseswitch.badcase;

import neveruseswitch.DBUtil;

/**
 * Created by Kanstantsin_Makarau on 12-Nov-15.
 */
public class MainBadCase {
    public static void main(String[] args){
        int dbCode = DBUtil.getMailId();
        String message;
        switch (dbCode) {
            case 1:
                message = "<html>Welcome new user!</html>";
                break;
            case 2:
                message = "<html>You policy is expired.</html>";
                break;
            case 3:
                message = "<html>You policy is expired</html>";
                break;
            default:
                throw new RuntimeException("This dbCode is absent");
        }
        sendMessage(message);
    }

    private static void sendMessage(String message) {
        //50 lines of business code
        System.out.println(message);
    }

}
