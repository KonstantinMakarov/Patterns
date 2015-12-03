package proxydecorator;

/**
 * Created by Kanstantsin_Makarau on 27-Nov-15.
 */
@Benchmark
public class BankClient {
    private String name;

    public BankClient(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BankClient{" +
                "name='" + name + '\'' +
                '}';
    }
}
