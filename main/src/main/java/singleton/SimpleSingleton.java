package singleton;

/**
 * Created by Kanstantsin_Makarau on 15-Sep-15.
 */
public class SimpleSingleton {
    private static SimpleSingleton classicSingleton;

    private SimpleSingleton(){
    }

    public static SimpleSingleton getInstance(){
        if(classicSingleton == null){
            return classicSingleton = new SimpleSingleton();
        }
        return classicSingleton;
    }

    public void info(){
        System.out.println("Simple");
    }
}
