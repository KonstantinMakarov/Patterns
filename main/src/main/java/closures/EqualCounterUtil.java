package closures;

import java.util.List;

/**
 * Created by Kanstantsin_Makarau on 26-Nov-15.
 */
public class EqualCounterUtil {
    public static <T> int countDuplicates(List<T> objectList, T object, Equalator<T> equalator) {
        int counter = 0;
        for (T currentObject : objectList){
            if(equalator.isEquals(currentObject, object)){
                counter++;
            }
        }
        return counter;
    }
}
