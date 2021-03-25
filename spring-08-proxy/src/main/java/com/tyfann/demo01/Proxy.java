package com.tyfann.demo01;

/**
 * @author tyfann
 * @date 2021/3/25 5:23 下午
 */
public class Proxy {

    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    public void rent(){
        seeHouse();
        host.rent();
        signContract();
        chargeHouse();
    }

    public void seeHouse(){
        System.out.println("中介带你看房");
    }

    public void chargeHouse(){
        System.out.println("收中介费");
    }

    public void signContract(){
        System.out.println("签合同");
    }
}
