package irobot;

/**
 * Created by Kanstantsin_Makarau on 19-Nov-15.
 */
public class IRobot {
    private Cleaner cleaner = new VacuumCleaner();  //spring has to be there
    private Speaker speaker = new SimpleSpeaker();

    public void cleanRoom() throws Exception {
        speaker.speak("Started");
        cleaner.cleanRoom();
        speaker.speak("Finished");
    }

}
