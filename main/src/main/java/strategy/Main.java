package strategy;

/**
 * Created by Kanstantsin_Makarau on 15-Sep-15.
 *
 * instance: http://www.javenue.info/post/12
 */
public class Main {
    public static void main(String[] args){
        Swimming swimming = new Swimming(new BreaststrokeSwimming());
        System.out.println(swimming.info());

        swimming.setSwimming(new ButterflySwimming());
        System.out.println(swimming.info());

        swimming.setSwimming(new FreestyleSwimming());
        System.out.println(swimming.info());
    }
}
