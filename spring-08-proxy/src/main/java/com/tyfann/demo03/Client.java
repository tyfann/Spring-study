package com.tyfann.demo03;

/**
 * @author tyfann
 * @date 2021/3/25 7:48 下午
 */
public class Client {
    public static void main(String[] args) {
        Host host = new Host();

        ProxyInvocationHandler handler = new ProxyInvocationHandler();
        handler.setRent(host);
        Rent proxy = (Rent) handler.getProxy();

        proxy.rent();
    }
}
