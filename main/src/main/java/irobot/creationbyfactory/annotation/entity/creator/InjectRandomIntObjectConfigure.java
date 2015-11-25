package irobot.creationbyfactory.annotation.entity.creator;

import irobot.creationbyfactory.annotation.entity.initial.InjectRandomInt;
import org.reflections.Reflections;

import java.lang.reflect.Field;
import java.util.Random;

/**
 * Created by Kanstantsin_Makarau on 23-Nov-15.
 */
public class InjectRandomIntObjectConfigure implements ObjectConfigure {
    private    Reflections reflections = new Reflections();
    private Random random = new Random();
    public void configureObject(Object object) throws Exception {
        Class<?> type = object.getClass();
        Field[] fields = type.getDeclaredFields();
        for(Field field : fields){
            InjectRandomInt annotation = field.getAnnotation(InjectRandomInt.class);
            if(annotation != null){
                if(field.getType() != Integer.TYPE){
                    throw new RuntimeException("Field type is not Integer/int");
                }
                int max = annotation.max();
                int min = annotation.min();
                field.setAccessible(true);
                field.setInt(object, min + random.nextInt(max - min));
            }
        }

    }
}
