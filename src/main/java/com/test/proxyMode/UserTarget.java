package com.test.proxyMode;

/**
 * @创建人: $AUTHOR$
 * @描述:本身就是类的目标对象(被代理对象)
 * @创建时间: 19:59$ 2018/6/23$
 * @修改原因:
 */
public class UserTarget {
    public void save() {
        System.out.println("开始保存................");
    }
}
