package singleton;

/**
 * Created by Kanstantsin_Makarau on 15-Sep-15.
 */
public class TheBestSingleton {
    private static volatile TheBestSingleton theBestSingleton;  //mark as volatile

    private TheBestSingleton(){
    }

    public static TheBestSingleton getInstance(){
        if(theBestSingleton == null){
            synchronized (TheBestSingleton.class){  //synchronize when instance is null
                if(theBestSingleton == null) {  //use double check
                    return theBestSingleton = new TheBestSingleton();
                }
            }
        }
        return theBestSingleton;
    }

    public void info(){
        System.out.println("The beast variant");
    }
}
