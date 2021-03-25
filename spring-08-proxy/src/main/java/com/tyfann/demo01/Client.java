package com.tyfann.demo01;

/**
 * @author tyfann
 * @date 2021/3/25 5:25 下午
 */
public class Client {
    public static void main(String[] args) {
        Host host = new Host();

        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}
