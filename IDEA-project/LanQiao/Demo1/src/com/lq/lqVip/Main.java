package com.lq.lqVip;

import java.util.Scanner;

/**
 * @author IT_Koma
 * @version 1.0
 * @date 2021/3/22 19:25
 */
public class Main {
    static int count = 0;// 解法计数
    static int[][] arry;// 棋盘
    static int n;// 皇后数

    public static void findQueen(int row, int color) {
        if (row == n) {
            // 搜寻到最后一行，即放完一种颜色的皇后了
            if (color == 2) {//放完白，开始放黑
                findQueen(0, 3);
            } else {//黑放完了，计划数+1,我这里将放置形式也输出了
                count++;
                print();
            }
            return;
        }
        for (int coulm = 0; coulm < n; coulm++) {
            // 检查是否可放置，标记为自己的颜色
            if (cheack(row, coulm,color)) {
                arry[row][coulm] = color;
                // 放置下一个皇后
                findQueen(row + 1, color);
                // 当下一个皇后无处可放的情况时执行，将此处的皇后清除
                // 若没有发生这种情况，将不会执行，直接通过return结束
                arry[row][coulm] = 1;
            }
        }

    }

    public static void print() {
        System.out.println("第" + count + "种方法：");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arry[i][j] == 1)
                    System.out.print("◇");//没有放棋子的位置
                else if(arry[i][j] == 0)
                    System.out.print("X");//不能放棋子的位置
                else if(arry[i][j] == 2)
                    System.out.print("○");//白皇后
                else if(arry[i][j] == 3)
                    System.out.print("●");//黑皇后
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean cheack(int a, int b, int color) {
        //是否可以放置
        if (arry[a][b] != 1) {
            return false;
        }
        for (int i = 0; i < n; i++) {
            // 列测试
            if (arry[i][b] == color)
                return false;
        }
        for (int i = a - 1, j = b - 1; i >= 0 & j >= 0; i--, j--) {
            // 左对角线
            if (arry[i][j] == color)
                return false;
        }
        for (int i = a - 1, j = b + 1; i >= 0 & j < n; i--, j++) {
            // 右对角线
            if (arry[i][j] == color)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arry = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arry[i][j] = sc.nextInt();
            }
        }

        findQueen(0,2);//2白3黑
        System.out.println("共" + count + "种方法");

        long endTime = System.currentTimeMillis(); // 获取结束时间
        System.out.println("程序运行时间：" + (endTime - startTime) + "ms");
    }
}
