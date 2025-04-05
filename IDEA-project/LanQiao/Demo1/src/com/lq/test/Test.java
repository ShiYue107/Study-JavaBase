package com.lq.test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author IT_Koma
 * @version 1.0
 * @date 2021/3/13 16:15
 * 数组反转
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("==========================================");
        int min = 0;
        int max = arr.length-1;
        for (int i = 0; i < (arr.length)/2; i++) {
            int temp = arr[min];
            arr[min] = arr[max];
            arr[max] = temp;
            max--;
            min++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
