package com.ngocnv.aop;

import java.lang.reflect.Proxy;

/**
 * Created by framgia on 08/11/2016.
 */
public class MainProxy {

    public static void main(String[] args) {
        BasicFuncImpl basicFunc = new BasicFuncImpl();

        BasicFunc proxied =
                (BasicFunc) Proxy.newProxyInstance(MainProxy.class.getClassLoader(), basicFunc.getClass().getInterfaces(), new MyInvocationHandler(basicFunc));

        proxied.method1();
    }
}
