package temlatemethod.badcase.step;

import temlatemethod.badcase.Mail;

/**
 * Created by Kanstantsin_Makarau on 25-Nov-15.
 */
public class StepAddFrom implements Step {
    public void execute(Mail mail) {
        System.out.println("Create FROM field with value " + mail.getFromAddress());
    }
}
