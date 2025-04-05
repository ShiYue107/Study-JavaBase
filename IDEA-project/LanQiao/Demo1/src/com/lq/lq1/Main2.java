package com.lq.lq1; /**
 * @author IT_Koma
 * @version 1.0
 * @date 2021/3/10 19:10
 */

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
//  二进制是:Integer.toBinaryString(n));
//  八进制是:Integer.toOctalString(n));
//  十六进制是:Integer.toHexString(n));
//  三进制是:"Integer.toString(n, 3));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
            int [] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                String shiLiu = sc.next();
                int shiLiuJ = Integer.valueOf(shiLiu,16);
                String ba = Integer.toOctalString(shiLiuJ);
                int baJ = Integer.parseInt(ba);
                arr[i] = baJ;
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
}

