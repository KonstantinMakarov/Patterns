package irobot.creationbyfactory.annotation.entity;

import irobot.creationbyfactory.annotation.entity.creator.ObjectFactory;
import irobot.creationbyfactory.annotation.entity.cleaner.Cleaner;
import irobot.creationbyfactory.annotation.entity.initial.Inject;
import irobot.creationbyfactory.annotation.entity.initial.InjectRandomInt;
import irobot.creationbyfactory.annotation.entity.speaker.Speaker;

/**
 * Created by Kanstantsin_Makarau on 19-Nov-15.
 */
public class IRobot {
    @Inject
    private Cleaner cleaner;
    @Inject
    private Speaker speaker;
    @InjectRandomInt(min = 0, max = 100)
    private int batteryPercent;

    public void cleanRoom() throws Exception {
        speaker.speak("I've started");
        cleaner.cleanRoom();
        speaker.speak("My battery percent = "+ batteryPercent + "%");
        speaker.speak("I've finished");
    }

}
