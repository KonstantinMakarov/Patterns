package irobot.creationbyfactory;

import irobot.creationbyfactory.entity.IRobot;

/**
 * Created by Kanstantsin_Makarau on 19-Nov-15.
 */
public class MainIRobot {
    public static void main(String[] args) throws Exception {
        IRobot iRobot = new IRobot();
        iRobot.cleanRoom();
    }
}
