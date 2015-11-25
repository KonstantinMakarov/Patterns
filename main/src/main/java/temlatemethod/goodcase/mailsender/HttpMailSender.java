package temlatemethod.goodcase.mailsender;

/**
 * Created by Kanstantsin_Makarau on 25-Nov-15.
 */
public class HttpMailSender extends AbstractMailSender {
    @Override
    protected void addBody() {
        System.out.println("http addBody");
    }

    @Override
    protected void addSubject() {
        System.out.println("http addSubject");
    }

    @Override
    protected void addFrom() {
        System.out.println("http addFrom");
    }

    @Override
    protected void addTo() {
        System.out.println("http addTo");
    }

    @Override
    protected void verify() {
        System.out.println("http verify");
    }

    @Override
    protected void sendMail() {
        System.out.println("http sendMail");
    }
}
