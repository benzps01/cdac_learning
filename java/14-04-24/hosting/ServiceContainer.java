package hosting;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@SuppressWarnings("unchecked")
public class ServiceContainer {

    public static <I, J extends I> I getService(Class<I> iface, Class<J> impl) throws Exception {
        System.out.println("Configuring environment for " + impl.getSimpleName() + " service.");
        /*
         * This code snippet is typically used when you want to
         * create a proxy object for an implementation (impl) that
         * should be instantiated once per method call (i.e., per invocation).
         * If impl is annotated with @OnePerCall, the proxy will intercept method
         * invocations and ensure that a new instance of impl is created for each method
         * call.
         * This approach is useful for managing resources or ensuring state isolation
         * when working with objects that should not be reused across multiple method
         * calls.
         */
        if (impl.isAnnotationPresent(OnePerCall.class)) {
            var proxyHandler = new InvocationHandler() {
                public Object invoke(Object proxyObject, Method targetMethod, Object[] args) throws Exception {
                    Object targetObject = impl.getConstructor().newInstance();
                    return targetMethod.invoke(targetObject, args);
                }
            };
            /*
             * (J) This cast is necessary because Proxy.newProxyInstance returns a generic
             * Object type (Object), and we want to treat the returned proxy instance
             * as an instance of J.
             */

            /*
             * The dynamic proxy created by Proxy.newProxyInstance intercepts method
             * invocations on the proxy object and delegates them to the proxyHandler.
             * Inside the invoke method of proxyHandler, the actual method invocation
             * is performed on a new instance (targetObject) of the implementation class
             * (impl), ensuring that a new instance is used for each method call
             * if the @OnePerCall annotation is present.
             */
            return (I) Proxy.newProxyInstance(impl.getClassLoader(), impl.getInterfaces(), proxyHandler);
        }
        return impl.getConstructor().newInstance();
    }
}
