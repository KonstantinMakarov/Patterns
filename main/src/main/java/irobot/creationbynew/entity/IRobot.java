package irobot.creationbynew.entity;

import irobot.creationbynew.entity.cleaner.Cleaner;
import irobot.creationbynew.entity.cleaner.SimpleSpeaker;
import irobot.creationbynew.entity.speaker.Speaker;
import irobot.creationbynew.entity.speaker.VacuumCleaner;

/**
 * Created by Kanstantsin_Makarau on 19-Nov-15.
 */
public class IRobot {
    private Cleaner cleaner = new VacuumCleaner();
    private Speaker speaker = new SimpleSpeaker();

    public void cleanRoom() throws Exception {
        speaker.speak("Started");
        cleaner.cleanRoom();
        speaker.speak("Finished");
    }

}
