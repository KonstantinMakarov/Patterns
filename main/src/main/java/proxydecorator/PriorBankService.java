package proxydecorator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Kanstantsin_Makarau on 27-Nov-15.
 */
@Benchmark
public class PriorBankService implements BankService {
    private List<BankClient> clientList = new ArrayList<>();

    public void createAccount(BankClient bankClient) {
        clientList.add(bankClient);
    }

    public List<BankClient> getClientList() {
        return Collections.unmodifiableList(clientList);
    }
}
