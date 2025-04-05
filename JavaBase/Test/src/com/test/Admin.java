package com.test;

public class Admin {
    String name;
    String useid;
    String pswrod;
    String phone;

    public void login() {
        System.out.println(name+"登录成功！！");
    }
    public void show() {
        System.out.println("姓名："+name+"，账号："+useid+
                "，密码："+pswrod+",电话"+phone);
    }
}
