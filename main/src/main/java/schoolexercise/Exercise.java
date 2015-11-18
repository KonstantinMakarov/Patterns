package schoolexercise;

/**
 * Created by Kanstantsin_Makarau on 18-Nov-15.
 */
public class Exercise {
    private double leftElement;
    private double rightElement;
    private Operand operand;
    private double result;

    public double getLeftElement() {
        return leftElement;
    }

    public void setLeftElement(double leftElement) {
        this.leftElement = leftElement;
    }

    public double getRightElement() {
        return rightElement;
    }

    public void setRightElement(double rightElement) {
        this.rightElement = rightElement;
    }

    public Operand getOperand() {
        return operand;
    }

    public void setOperand(Operand operand) {
        this.operand = operand;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return leftElement + " " + operand + " " + rightElement + " = " + result;
    }
}
