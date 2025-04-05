package com.lq.demo5;

/**
 * date: 2021/9/1 21:32
 *
 * @version 1.0
 * @author: it_koma
 * @since JDK 1.8
 */
public class MyMain {

    public static void main(String[] args) {

        String s1 = new String("s1");
        String s2 = new String("s2");
        String s3 = s1+s2;

        s3.intern();
        String s4 = "s1s2";
        System.out.println(s3==s4);
    }
}
