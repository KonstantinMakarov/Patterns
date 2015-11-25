package temlatemethod.badcase;

/**
 * Created by Kanstantsin_Makarau on 25-Nov-15.
 */
public class MainTemplateMethodBadCase {
    public static void main(String[] args) {
        Mail.Builder mailBuilder = new Mail.Builder();
        Mail mail = mailBuilder.body("Hello").subject("Welcome").fromAddress("Kostya").toAddress("Alex").build();
    }
}
