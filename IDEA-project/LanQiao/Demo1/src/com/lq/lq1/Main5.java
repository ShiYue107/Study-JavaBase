package com.lq.lq1;

import java.util.Scanner;

/**
 * @author IT_Koma
 * @version 1.0
 * @date 2021/3/13 0:48
 *
 * 输入一个正整数n， 编程求所有这样的五位和六位十进制数，满足各位数字之和等于n 。
 */
public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num >=1 && num <=54) {
            for (int i = 10000; i < 1000000; i++) {//10001
                String s = i + "";//将int转为String
                String s1 = new StringBuffer(s).reverse().toString();//借用StringBuffer反转s得到s1
                if (s1.equals(s)) {
//                    System.out.println(i);
                    int temp = i;
                    int yu = 0;//各个位数之和
                    while (temp > 0) {
                        yu += temp % 10;
                        temp /= 10;
                        if (yu == num) {
                            System.out.println(i);
                        }
                    }
                }
            }
        }
    }
}
