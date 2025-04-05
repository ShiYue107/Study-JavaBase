package com.lq.lq1;

import java.util.Scanner;

/**
 * @author IT_Koma
 * @version 1.0
 * @date 2021/3/15 9:20
 *
 * 输入一行，包含两个整数n和m，分别表示你要输出的图形的行数的列数。
 */

public class Main11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        char[][] ch = new char[26][26];
        for (int i = 0; i < n; i++) {
            char c = 'A';
            for (int j = i; j < m; j++) {
                ch[i][j] = c++;
            }
            c = 'A';
            for (int j = i-1; j >= 0; j--) {
                ch[i][j] = ++c;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(ch[i][j]);
            }
            System.out.println();
        }
    }
}

