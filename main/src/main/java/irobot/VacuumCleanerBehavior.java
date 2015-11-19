package irobot;

/**
 * Created by Kanstantsin_Makarau on 19-Nov-15.
 */
public class VacuumCleanerBehavior implements VacuumCleaner {
    public void cleanRoom() throws Exception {
        System.out.println("I've started cleaning!");
        Thread.sleep(2000);
        System.out.println("OK, I'm steal cleaning...");
        Thread.sleep(2000);
        System.out.println("I've finished cleaning!");
    }
}
