package proxydecorator;

import java.util.List;

/**
 * Created by Kanstantsin_Makarau on 27-Nov-15.
 */
public interface BankService {
    void createAccount(BankClient bankClient);
    List<BankClient> getClientList();
}
