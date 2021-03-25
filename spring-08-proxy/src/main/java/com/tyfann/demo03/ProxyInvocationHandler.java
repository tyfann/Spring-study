package com.tyfann.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author tyfann
 * @date 2021/3/25 7:44 下午
 */
public class ProxyInvocationHandler implements InvocationHandler {
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                rent.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //动态代理的本质，就是使用反射机制实现

        seeHouse();
        Object result = method.invoke(rent,args);
        chargeHouse();
        return null;
    }

    public void seeHouse(){
        System.out.println("中介带看房子");
    }

    public void chargeHouse(){
        System.out.println("收中介费");
    }
}
