package com.lq.lq1;

import java.util.Scanner;

/**
 * @author IT_Koma
 * @version 1.0
 * @date 2021/3/16 9:19
 *
 * Fibonacci数列的递推公式为：Fn=Fn-1+Fn-2，其中F1=F2=1。
 */
public class Main14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println(f(n));
    }

    public static int f(int n){
        if (n < 3){
            return 1;
        }
        if (n == 3){
            return 2;
        }else {
            return (f(n -1) + f(n -2))%10007;
        }
    }
}
