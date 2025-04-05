package com.lq.lq1;

import java.util.Scanner;

/**
 * @author IT_Koma
 * @version 1.0
 * @date 2021/3/16 9:59
 *
 * 求1+2+3+...+n的值。
 */
public class Main16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        for (int i = 1; i <= n ; i++) {
            sum+=i;
        }
        System.out.println(sum);
   }
}
