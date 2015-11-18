package multipleinheritance;

/**
 * Created by Kanstantsin_Makarau on 17-Nov-15.
 */
public class AlarmImpl implements Alarm {
    public void setAlarmTime() {
        System.out.println("setAlarmTime");
    }

    public void stopAlarm() {
        System.out.println("stopAlarm");
    }
}
