package irobot;

import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.util.Date;

/**
 * Created by Kanstantsin_Makarau on 19-Nov-15.
 */
public class ClockBehavior implements Clock {
    public void sayCurrentTime() {
        System.out.println(new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss.SSS").format(System.currentTimeMillis()));
    }
}
