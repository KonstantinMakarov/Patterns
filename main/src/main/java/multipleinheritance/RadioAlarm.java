package multipleinheritance;

/**
 * Created by Kanstantsin_Makarau on 17-Nov-15.
 */
public class RadioAlarm implements Radio, Alarm{
    private Radio radio;
    private Alarm alarm;

    public RadioAlarm(){

    }

    public void setRadio(Radio radio) {
        this.radio = radio;
    }

    public void setAlarm(Alarm alarm) {
        this.alarm = alarm;
    }

    public void setAlarmTime() {
        alarm.setAlarmTime();
    }

    public void stopAlarm() {
        alarm.stopAlarm();
    }

    public void setChannel() {
        radio.setChannel();
    }

    public void setVolume() {
        radio.setVolume();
    }
}
