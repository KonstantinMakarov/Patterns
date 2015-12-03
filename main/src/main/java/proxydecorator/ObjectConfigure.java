package proxydecorator;

/**
 * Created by Kanstantsin_Makarau on 23-Nov-15.
 */
public interface ObjectConfigure {
    <T, E extends T> E  configureObject(T currentObject, Class<T> originalObject) throws Exception;
}
