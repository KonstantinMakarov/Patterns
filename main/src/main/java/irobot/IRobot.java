package irobot;

/**
 * Created by Kanstantsin_Makarau on 19-Nov-15.
 */
public class IRobot implements VacuumCleaner, Clock {
    private VacuumCleaner vacuumCleanerBehavior = new VacuumCleanerBehavior();  //spring has to be there
    private Clock clockBehavior = new ClockBehavior();

    public void cleanRoom() throws Exception {
        vacuumCleanerBehavior.cleanRoom();
    }

    public void sayCurrentTime() {
        clockBehavior.sayCurrentTime();
    }
}
