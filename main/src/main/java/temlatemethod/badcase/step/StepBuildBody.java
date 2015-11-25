package temlatemethod.badcase.step;

import temlatemethod.badcase.Mail;

/**
 * Created by Kanstantsin_Makarau on 25-Nov-15.
 */
public class StepBuildBody implements Step{
    public void execute(Mail mail) {
        System.out.println("Create body with value " + mail.getBody());
    }
}
