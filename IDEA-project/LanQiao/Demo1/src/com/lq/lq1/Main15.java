package com.lq.lq1;

import java.util.Scanner;

/**
 * @author IT_Koma
 * @version 1.0
 * @date 2021/3/16 9:44
 *
 * 给定圆的半径r，求圆的面积。
 */
public class Main15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double arae = Math.PI * r * r;
        System.out.printf("%.7f",arae);
    }
}
