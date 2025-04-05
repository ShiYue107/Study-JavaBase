package com.lq.lq1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author IT_Koma
 * @version 1.0
 * @date 2021/3/13 15:48
 *
 * 给定一个长度为n的数列，将这个数列按从小到大的顺序排列。
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 1 && n <= 20) {
            int [] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            //方法一:调用sort快速排序
//            Arrays.sort(arr);

            //方法二:冒泡排序
            for (int i = 0; i < arr.length-1; i++) {
                for (int j = 0; j < arr.length-1-i; j++) {
                    int temp = 0;
                    if (arr[j] > arr[j+1]){
                        temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}