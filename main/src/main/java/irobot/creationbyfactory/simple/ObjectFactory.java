package irobot.creationbyfactory.simple;

import org.reflections.Reflections;

import java.util.Set;

/**
 * Created by Kanstantsin_Makarau on 19-Nov-15.
 */
public class ObjectFactory {

    private static volatile ObjectFactory objectFactory;
    private Reflections reflections;

    private ObjectFactory(){
        reflections = new Reflections("irobot");
    }

    public static ObjectFactory getInstance() {
        if(objectFactory == null){
            synchronized (ObjectFactory.class) {
                if (objectFactory == null) {
                    return new ObjectFactory();
                }
            }
        }
        return  objectFactory;
    }

    public <T> T create(Class<T> type) throws Exception {
        T t;
        if(type.isInterface()){
            Set<Class<? extends T>> subTypes = reflections.getSubTypesOf(type);
            if(subTypes.size() != 1) {
                throw new RuntimeException("Can't create instance " + type.getName() + ", because several impl exist.");
            } else {
                t = subTypes.iterator().next().newInstance();
            }
        } else{
            t = type.newInstance();
        }
        return t;
    }

}
