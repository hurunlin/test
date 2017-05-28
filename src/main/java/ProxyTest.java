import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by 701 on 2017/3/11.
 */
public class ProxyTest implements InvocationHandler {

    private Object object;

    public ProxyTest(Object object) {
        this.object = object;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Before invocation");
        Object obj = method.invoke(object,args);
        System.out.println("Before invocation");
        return obj;
    }


}




