package irobot.creationbyfactory.simple.entity;

import irobot.creationbyfactory.simple.ObjectFactory;
import irobot.creationbyfactory.simple.entity.cleaner.Cleaner;
import irobot.creationbyfactory.simple.entity.speaker.Speaker;

import java.util.Random;

/**
 * Created by Kanstantsin_Makarau on 19-Nov-15.
 */
public class IRobot {
    private Cleaner cleaner;
    private Speaker speaker;
    private int batteryPercent;

    public IRobot() throws Exception {
        speaker = ObjectFactory.getInstance().create(Speaker.class);
        cleaner = ObjectFactory.getInstance().create(Cleaner.class);
        batteryPercent = 6 + new Random().nextInt(10);
    }

    public void cleanRoom() throws Exception {
        speaker.speak("I've started");
        cleaner.cleanRoom();
        speaker.speak("My battery percent = "+ batteryPercent + "%");
        speaker.speak("I've finished");
    }

}
