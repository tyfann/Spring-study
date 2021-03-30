package com.tyfann.diy;

/**
 * @author tyfann
 * @date 2021/3/29 7:38 下午
 */
public class DiyPointCut {
    public void before(){
        System.out.println("=======方法执行前========");
    }
    public void after(){
        System.out.println("=======方法执行后========");
    }
}
