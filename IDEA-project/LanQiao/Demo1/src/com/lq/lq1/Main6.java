package com.lq.lq1;

/**
 * @author IT_Koma
 * @version 1.0
 * @date 2021/3/13 0:49
 *
 * 1221是一个非常特殊的数，它从左边读和从右边读是一样的，编程求所有这样的四位十进制数。
 */
public class Main6 {
    public static void main(String[] args) {
//        int num = 1001;
//        String str = num +"";
//        String str1 = str.substring(0,2);
//        String str2 = str.substring(2,4);
//        StringBuilder str3 = new StringBuilder(str2).reverse();
//        System.out.println(str1+","+str2+","+str3);

        for (int i = 1000; i < 10000; i++) {
            String s = i +"";
            String s1 = new StringBuffer(s).reverse().toString();
            if (s1.equals(s)){
                System.out.println(i);
            }
        }
    }
}
