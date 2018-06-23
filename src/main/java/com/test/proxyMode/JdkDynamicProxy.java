package com.test.proxyMode;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @创建人: $AUTHOR$
 * @描述:jdk动态代理中代理不需要实现接口  但是目标对象必须实现接口
 * @创建时间: 19:21$ 2018/6/23$
 * @修改原因:由于静态代理对象需要与目标对象实现一样的接口,所以会有很多代理类,类太多.同时,一旦接口增加方法,目标对象与代理对象都要维护.
 */
public class JdkDynamicProxy {
    //维护一个目标对象
    private Object target;
    public JdkDynamicProxy(Object target) {
        this.target = target;
    }

    //给目标对象生成代理
    public Object getProxyInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("开启jdk动态代理模式.............");
                        Object invoke = method.invoke(target,args);//调用要加上目标对象target
                        System.out.println("jdk动态代理模式执行完毕.............");
                        return invoke;
                    }
                });
    }

}
