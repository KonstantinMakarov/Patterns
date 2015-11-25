package irobot.creationbyfactory.annotation.entity.speaker;

/**
 * Created by Kanstantsin_Makarau on 19-Nov-15.
 */
public class SimpleSpeaker implements Speaker {

    public void speak(String message) {
        System.out.println(message);
    }
}
