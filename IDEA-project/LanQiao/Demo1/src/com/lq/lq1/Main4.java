package com.lq.lq1; /**
 * @author IT_Koma
 * @version 1.0
 * @date 2021/3/13 0:44
 */

import java.util.Scanner;

/**
 * 给出一个非负整数，将它表示成十六进制的形式。
 */
public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Integer.toHexString(n));
    }
}
