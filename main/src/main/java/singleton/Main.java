package singleton;

/**
 * Created by Kanstantsin_Makarau on 11-Sep-15.
 *
 * instance: http://habrahabr.ru/post/27108/
 */
public class Main {
    public static void main(String[] args){
        SimpleSingleton simpleSingleton = SimpleSingleton.getInstance();
        simpleSingleton.info();

        ClassicMultithreadingSingleton classicMultithreadingSingleton = ClassicMultithreadingSingleton.getInstance();
        classicMultithreadingSingleton.info();

        TheBestSingleton theBestSingleton = TheBestSingleton.getInstance();
        theBestSingleton.info();
    }
}
