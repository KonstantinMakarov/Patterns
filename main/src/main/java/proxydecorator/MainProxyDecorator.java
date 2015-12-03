package proxydecorator;

/**
 * Created by Kanstantsin_Makarau on 27-Nov-15.
 */
public class MainProxyDecorator {
    public static void main(String[] args) throws Exception {
        ObjectFactory.getInstance().create(BankService.class).getClientList();
    }
}
