package com.test;

import java.util.Scanner;

public class Customer {
    String name;
    String phone;
    int age;
    String useid;
    String password;
    double money;

    public void pay(){
        System.out.println("请输入付款数：");
        Scanner sc = new Scanner(System.in);
        double pay = sc.nextInt();
        money-=pay;
        System.out.println("需要付款："+pay+"，付款后"+name+"的账户余额为："+money);
    }

    public static void main(String[] args) {
        Customer use1 = new Customer();
        use1.name= "张美兰";
        use1.age=20;
        use1.useid="1234569";
        use1.password="1231231";
        use1.phone="1234567890";
        use1.money=100000;
        use1.pay();
    }
}
