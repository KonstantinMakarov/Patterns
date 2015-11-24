package immutable.goodcase;

import immutable.goodcase.verifier.EpamClientVerifier;
import org.reflections.Reflections;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kanstantsin_Makarau on 24-Nov-15.
 */
public final class EpamClient {
    private final String name;
    private final int bonusPoints;
    private final int debt;

    private EpamClient(String name, int bonusPoints, int debt) {
        this.name = name;
        this.bonusPoints = bonusPoints;
        this.debt = debt;
    }

    public static class Builder{
        private String name;
        private int bonusPoints;
        private int debt;
        List<EpamClientVerifier> verifierList = new ArrayList<EpamClientVerifier>();

        public Builder() throws Exception {
            Reflections reflections = new Reflections("immutable.goodcase");
            for (Class<? extends EpamClientVerifier> aClass : reflections.getSubTypesOf(EpamClientVerifier.class)) {
                verifierList.add(aClass.newInstance());
            }
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder bonusPoints(int bonusPoints) {
            this.bonusPoints = bonusPoints;
            return this;
        }

        public Builder debt(int debt) {
            this.debt = debt;
            return this;
        }

        public EpamClient build(){
            EpamClient epamClient = new EpamClient(name, bonusPoints, debt);
            verify(epamClient);
            clean();
            return epamClient;
        }

        private void clean() {
            name = null;
            bonusPoints = 0;
            debt = 0;
        }

        private void verify(EpamClient epamClient) {
            for(EpamClientVerifier verifier : verifierList){
                verifier.verify(epamClient);
            }
        }
    }

    public String getName() {
        return name;
    }

    public int getBonusPoints() {
        return bonusPoints;
    }

    public int getDebt() {
        return debt;
    }

    @Override
    public String toString() {
        return "EpamClient{" +
                "name='" + name + '\'' +
                ", bonusPoints=" + bonusPoints +
                ", debt=" + debt +
                '}';
    }
}
