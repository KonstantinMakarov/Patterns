package irobot.creationbyfactory.annotation.entity.creator;

import irobot.creationbyfactory.annotation.entity.initial.Inject;

import java.lang.reflect.Field;

/**
 * Created by Kanstantsin_Makarau on 23-Nov-15.
 */
public class InjectObjectConfigure implements ObjectConfigure {
    public void configureObject(Object object) throws Exception {
        Class<?> type = object.getClass();
        Field[] fields = type.getDeclaredFields();
        for(Field field : fields){
            if(field.isAnnotationPresent(Inject.class)){
                field.setAccessible(true);
                field.set(object, ObjectFactory.getInstance().create(field.getType()));
            }
        }
    }
}
