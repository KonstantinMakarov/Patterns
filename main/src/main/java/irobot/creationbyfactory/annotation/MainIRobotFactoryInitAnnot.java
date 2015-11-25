package irobot.creationbyfactory.annotation;

import irobot.creationbyfactory.annotation.entity.IRobot;
import irobot.creationbyfactory.annotation.entity.creator.ObjectFactory;

/**
 * Created by Kanstantsin_Makarau on 19-Nov-15.
 */
public class MainIRobotFactoryInitAnnot {
    public static void main(String[] args) throws Exception {
        IRobot iRobot = ObjectFactory.getInstance().create(IRobot.class);
        iRobot.cleanRoom();
    }
}
