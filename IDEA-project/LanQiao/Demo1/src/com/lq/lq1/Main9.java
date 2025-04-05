package com.lq.lq1;

import java.util.Scanner;

/**
 * @author IT_Koma
 * @version 1.0
 * @date 2021/3/15 11:09
 *
 * 如果a在数列中出现了，输出它第一次出现的位置(位置从1开始编号)，否则输出-1。
 */
public class Main9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int a = sc.nextInt();
        int find =findIndex(arr,a);
        if (find > 0 ){
            System.out.println(find);
        }else {
            System.out.println(-1);
        }
    }

    public static int findIndex(int [] arr,int a){
        for (int i = 0; i < arr.length; i++) {
            int index = i +1;
            if (a == arr[i]){
                return index;
            }
        }
        return 0;
    }
}
