package proxydecorator;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.InvocationHandler;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by Kanstantsin_Makarau on 27-Nov-15.
 */
public class BenchmarkObjectConfigure implements ObjectConfigure {
    @Override
    public <T, E extends T> E configureObject(final T currentObject, Class<T> originalObject) throws Exception {
        if(originalObject.isAnnotationPresent(Benchmark.class)){
            Object proxy = Enhancer.create(originalObject, null, new MethodInterceptor() {
                @Override
                public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws
                        Throwable {
                    System.out.println("Hello");
                    long before = System.nanoTime();
                    Object invoke = method.invoke(currentObject, args);
                    long after = System.nanoTime();
                    System.out.println(after-before);
                    return invoke;
                }
            });
            return (E) proxy;
        }
        return (E) currentObject;
    }
}
