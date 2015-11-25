package temlatemethod.goodcase;

import temlatemethod.goodcase.mailsender.AbstractMailSender;
import temlatemethod.goodcase.mailsender.HttpMailSender;
import temlatemethod.goodcase.mailsender.SMTPMailSender;

/**
 * Created by Kanstantsin_Makarau on 25-Nov-15.
 */
public class MainTemplateMethodGoodCase {
    public static void main(String[] args) {
        AbstractMailSender mailSender = new HttpMailSender();
        mailSender.deliver();
        mailSender = new SMTPMailSender();
        mailSender.deliver();
    }
}
