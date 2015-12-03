package proxydecorator;

import org.reflections.Reflections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by Kanstantsin_Makarau on 19-Nov-15.
 */
public class ObjectFactory {

    private static volatile ObjectFactory objectFactory;
    private Reflections reflections;
    List<ObjectConfigure> objectConfigureList = new ArrayList<>();

    private ObjectFactory() throws Exception {
        reflections = new Reflections("proxydecorator");
        Set<Class<? extends ObjectConfigure>> impls = reflections.getSubTypesOf(ObjectConfigure.class);
        for(Class<? extends ObjectConfigure> impl : impls){
            objectConfigureList.add(impl.newInstance());
        }
    }

    public static ObjectFactory getInstance() throws Exception {
        if(objectFactory == null){
            synchronized (ObjectFactory.class) {
                if (objectFactory == null) {
                    return objectFactory = new ObjectFactory();
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
                type = (Class<T>) subTypes.iterator().next();
            }
        }
        t = type.newInstance();
        for(ObjectConfigure objectConfigure : objectConfigureList){
            t = objectConfigure.configureObject(t, type);
        }
        return t;
    }

}
