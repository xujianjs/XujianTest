package com.test.proxyMode;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @创建人: $AUTHOR$
 * @描述: Cglib子类代理工厂         对UserTarget在内存中动态构建一个子类对象
 * @创建时间: 19:55$ 2018/6/23$
 * @修改原因:
 * 上面的静态代理和动态代理模式都是要求目标对象是实现一个接口的目标对象, 但是有时候目标对象只是一个单独的对象, 并没有实现任何的接口,
 * 这个时候就可以使用以目标对象子类的方式类实现代理, 这种方法就叫做:Cglib代理
 * Cglib代理,也叫作子类代理,它是在内存中构建一个子类对象从而实现对目标对象功能的扩展.
 * @描述:
 * JDK的动态代理有一个限制,就是使用动态代理的对象必须实现一个或多个接口,如果想代理没有实现接口的类,就可以使用Cglib实现.
 * Cglib是一个强大的高性能的代码生成包, 它可以在运行期扩展java类与实现java接口.它广泛的被许多AOP的框架使用, 例如Spring AOP和synaop,为他们提供方法的interception(拦截)
 * Cglib包的底层是通过使用一个小而块的字节码处理框架ASM来转换字节码并生成新的类.不鼓励直接使用ASM,因为它要求你必须对JVM内部结构包括class文件的格式和指令集都很熟悉.
 *
 */
public class CglibProxy implements MethodInterceptor {
    //维护目标对象
    private Object target;
    public CglibProxy(Object target) {
        this.target = target;
    }

    //给目标对象创建一个代理对象
    public Object getProxyInstance() {
        //1.工具类(增强工具)
        Enhancer enhancer = new Enhancer();
        //2.设置父类
        enhancer.setSuperclass(target.getClass());
        //3.设置回调函数
        enhancer.setCallback(this);
        //4.创建子类(代理对象)
        return enhancer.create();


    }

    //通过监听(拦截)子类(即代理对象)的方法调用  来代理目标对象的方法执行
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("Cglib代理模式开启.......................");
        Object invoke = method.invoke(target, objects);
        System.out.println("Cglib代理模式执行完毕.......................");
        return invoke;
    }
}
