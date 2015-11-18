package schoolexercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Kanstantsin_Makarau on 18-Nov-15.
 */
public class Examiner {
    private Random random = new Random();
    private List<ExerciseGenerator> exerciseList = new ArrayList<ExerciseGenerator>();

    public Examiner(){
        exerciseList.add(new FirstClassMinusGenerator());
        exerciseList.add(new FirstClassPlusGenerator());
    }

    public Exercise getRandomExercise() {
        int randomExerciseNumber = random.nextInt(exerciseList.size());
        return exerciseList.get(randomExerciseNumber).generateExercise();
    }
}
