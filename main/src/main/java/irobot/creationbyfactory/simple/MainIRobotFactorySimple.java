package irobot.creationbyfactory.simple;

import irobot.creationbyfactory.simple.entity.IRobot;

/**
 * Created by Kanstantsin_Makarau on 19-Nov-15.
 */
public class MainIRobotFactorySimple {
    public static void main(String[] args) throws Exception {
        IRobot iRobot = new IRobot();
        iRobot.cleanRoom();
    }
}
