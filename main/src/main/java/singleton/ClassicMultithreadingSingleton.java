package singleton;

/**
 * Created by Kanstantsin_Makarau on 15-Sep-15.
 */
public class ClassicMultithreadingSingleton {
    private static ClassicMultithreadingSingleton classicMultithreadingSingleton;

    private ClassicMultithreadingSingleton(){
    }

    public static synchronized ClassicMultithreadingSingleton getInstance(){
        if(classicMultithreadingSingleton == null){
            classicMultithreadingSingleton = new ClassicMultithreadingSingleton();
        }
        return classicMultithreadingSingleton;
    }

    public void info(){
        System.out.println("Classic multithreading");
    }
}
