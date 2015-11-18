package schoolexercise;

import java.util.Random;

import static schoolexercise.Operand.MINUS;

/**
 * Created by Kanstantsin_Makarau on 18-Nov-15.
 */
public class FirstClassMinusGenerator implements ExerciseGenerator {
    private Random random = new Random();
    private Exercise exercise = new Exercise();

    public Exercise generateExercise() {
        exercise.setLeftElement(random.nextInt(10));
        exercise.setRightElement(random.nextInt(10));
        exercise.setOperand(MINUS);
        exercise.setResult(exercise.getLeftElement() - exercise.getRightElement());

        return exercise;
    }
}
