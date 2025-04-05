package com.test;

public class UseAdmin {
    public static void main(String[] args) {
        Admin s1 = new Admin();
        s1.name="小僵尸";
        s1.useid= "13141516";
        s1.pswrod="aa1231";
        s1.phone="112354";
        s1.login();
        s1.show();
    }
}
