package temlatemethod.goodcase.mailsender;

/**
 * Created by Kanstantsin_Makarau on 25-Nov-15.
 */
public abstract class AbstractMailSender {
    protected abstract void addBody();          //method have to be protected
    protected abstract void addSubject();
    protected abstract void addFrom();
    protected abstract void addTo();
    protected abstract void verify();
    protected abstract void sendMail();

    public final void deliver(){
        addBody();
        addSubject();
        addFrom();
        addTo();
        verify();
        sendMail();
    }
}
