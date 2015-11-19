package irobot.creationbyfactory.entity;

import irobot.creationbyfactory.ObjectFactory;
import irobot.creationbyfactory.entity.cleaner.Cleaner;
import irobot.creationbyfactory.entity.speaker.Speaker;

/**
 * Created by Kanstantsin_Makarau on 19-Nov-15.
 */
public class IRobot {
    private Cleaner cleaner;
    private Speaker speaker;

    public IRobot() throws Exception {
        speaker = ObjectFactory.getInstance().create(Speaker.class);
        cleaner = ObjectFactory.getInstance().create(Cleaner.class);
    }

    public void cleanRoom() throws Exception {
        speaker.speak("I've started");
        cleaner.cleanRoom();
        speaker.speak("I've finished");
    }

}
