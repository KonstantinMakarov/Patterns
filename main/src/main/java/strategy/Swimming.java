package strategy;

/**
 * Created by Kanstantsin_Makarau on 15-Sep-15.
 */
public class Swimming {
    private StyleOfSwimming swimming;

    public Swimming(StyleOfSwimming swimming){
        this.swimming = swimming;
    }

    public void setSwimming(StyleOfSwimming swimming) {
        this.swimming = swimming;
    }

    public String info(){
        return swimming.swim();
    }
}
