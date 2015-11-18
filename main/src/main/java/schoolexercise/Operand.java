package schoolexercise;

/**
 * Created by Kanstantsin_Makarau on 18-Nov-15.
 */
public enum Operand {
    MINUS("-"),
    PLUS("+");

    private final String sing;

    Operand(String sing) {
        this.sing = sing;
    }

    @Override
    public String toString() {
        return sing;
    }
}
