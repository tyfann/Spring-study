package com.tyfann.demo04;

import com.tyfann.demo02.UserService;
import com.tyfann.demo02.UserServiceImpl;

/**
 * @author tyfann
 * @date 2021/3/25 8:02 下午
 */
public class Client {
    public static void main(String[] args) {
        ProxyInvocationHandler handler = new ProxyInvocationHandler();
        UserServiceImpl userService = new UserServiceImpl();
        handler.setObject(userService);
        UserService proxy = (UserService) handler.getProxy();
//        proxy.add();
        proxy.delete();
    }
}
