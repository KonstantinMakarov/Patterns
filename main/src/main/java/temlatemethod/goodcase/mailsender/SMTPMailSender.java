package temlatemethod.goodcase.mailsender;

/**
 * Created by Kanstantsin_Makarau on 25-Nov-15.
 */
public class SMTPMailSender extends AbstractMailSender {
    @Override
    protected void addBody() {
        System.out.println("smtp addBody");
    }

    @Override
    protected void addSubject() {
        System.out.println("smtp addSubject");
    }

    @Override
    protected void addFrom() {
        System.out.println("smtp addFrom");
    }

    @Override
    protected void addTo() {
        System.out.println("smtp addTo");
    }

    @Override
    protected void verify() {
        System.out.println("smtp verify");
    }

    @Override
    protected void sendMail() {
        System.out.println("smtp sendMail");
    }
}
