package com.tyfann.demo04;

import com.tyfann.demo03.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author tyfann
 * @date 2021/3/25 7:44 下午
 */
public class ProxyInvocationHandler implements InvocationHandler {
    //被代理的接口
    private Object obj;

    public void setObject(Object obj) {
        this.obj = obj;
    }

    //生成得到代理类
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                obj.getClass().getInterfaces(),this);
    }

    //处理代理实例，并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //动态代理的本质，就是使用反射机制实现
        log(method.getName());
        Object result = method.invoke(obj,args);
        return null;
    }

    public void log(String msg){
        System.out.println("执行了"+msg+"方法");
    }


}
