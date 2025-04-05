package com.lq.lq1;

import java.util.Scanner;

/**
 * @author IT_Koma
 * @version 1.0
 * @date 2021/3/13 22:30
 *
 *  杨辉三角
 */
public class Main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printInt(n);
    }

    private static void printInt(int n) {
       int [][] yH = new int[n][n];
        for (int i = 0; i < n; i++) {
            yH[i][0] = 1;
            yH[i][i] = 1;
            if (i >= 2){
                for (int j = 1; j < i; j++) {
                    yH[i][j] = yH[i-1][j]+yH[i-1][j-1];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int k = 1; k < n-i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(yH[i][j]);
                if (j != i) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
