package com.lq.lq1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author IT_Koma
 * @version 1.0
 * @date 2021/3/15 11:29
 *
 * 第一行为整数n，表示数的个数。
 * 第二行有n个数，为给定的n个数，每个数的绝对值都小于10000。
 * 输出格式
 * 输出三行，每行一个整数。第一行表示这些数中的最大值，第二行表示这些数中的最小值，第三行表示这些数的和。
 */
public class Main10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }
        Arrays.sort(arr);
        System.out.println(arr[arr.length - 1]);
        System.out.println(arr[0]);
        System.out.println(sum);
    }
}
