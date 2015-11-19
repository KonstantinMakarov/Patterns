package irobot.creationbyfactory.entity.cleaner;


import irobot.creationbyfactory.entity.speaker.Speaker;

/**
 * Created by Kanstantsin_Makarau on 19-Nov-15.
 */
public class SimpleSpeaker implements Speaker {

    public void speak(String message) {
        System.out.println(message);
    }
}
