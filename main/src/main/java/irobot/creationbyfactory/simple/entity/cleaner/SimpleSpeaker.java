package irobot.creationbyfactory.simple.entity.cleaner;


import irobot.creationbyfactory.simple.entity.speaker.Speaker;

/**
 * Created by Kanstantsin_Makarau on 19-Nov-15.
 */
public class SimpleSpeaker implements Speaker {

    public void speak(String message) {
        System.out.println(message);
    }
}
