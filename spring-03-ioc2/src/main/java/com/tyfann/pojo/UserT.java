package com.tyfann.pojo;

/**
 * @author tyfann
 * @date 2021/3/24 9:28 下午
 */
public class UserT {
    private String name;

    public UserT() {
        System.out.println("UserT被创建了!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("name="+name);
    }
}
