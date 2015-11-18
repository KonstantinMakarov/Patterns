package multipleinheritance;

/**
 * Created by Kanstantsin_Makarau on 17-Nov-15.
 */
public class MainRadioAlarm {
    public static void main(String[] args){
        RadioAlarm radioAlarm = new RadioAlarm();
        radioAlarm.setAlarm(new AlarmImpl());
        radioAlarm.setRadio(new RadioImpl());
        radioAlarm.setAlarmTime();
        radioAlarm.setChannel();
        radioAlarm.setVolume();
        radioAlarm.stopAlarm();
    }
}
