package com.tyfann.demo01;

/**
 * @author tyfann
 * @date 2021/3/25 5:23 下午
 */
public class Host implements Rent{
    @Override
    public void rent() {
        System.out.println("房东要出租房子!");
    }
}
