package com.ngocnv.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by framgia on 08/11/2016.
 */
public class MyInvocationHandler implements InvocationHandler{


    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }


    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long a = System.currentTimeMillis();
        Object result = method.invoke(target, args);
        System.out.println("Total time taken: " +(System.currentTimeMillis() - a));
        return result;
    }
}
