package com.lq.lq1;

/**
 * @author IT_Koma
 * @version 1.0
 * @date 2021/3/13 22:06
 *
 * 153是一个非常特殊的数，它等于它的每位数字的立方和，
 * 即153=1*1*1+5*5*5+3*3*3。编程求所有满足这种条件的三位十进制数。
 */
public class Main7 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int temp = i;
            int ge =temp%10;
            int shi = temp/10%10;
            int bai = temp/100;
            if ((ge*ge*ge + shi*shi*shi + bai*bai*bai)==i){
                System.out.println(i);
            }
        }
    }
}
