package com.lq.demo4;

public class Main1 {

    public static void main(String[] args) {
        int[][]matrix={
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,100,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25},
        };
        print(matrix);
    }
    public static void print(int [][] matrix){

        int leftUpRow=0,leftUpCol=0,rightDownRow=matrix.length-1,rightDownCol=matrix[0].length-1;
        while (leftUpRow <= rightDownRow && leftUpCol <= rightDownCol) {
            int r = leftUpRow, c = leftUpCol;
            //上面一条边
            while (c <= rightDownCol) {
                System.out.print(matrix[r][c++] + " ");
            }
            //恢复
            c = rightDownCol;
            r++;
            //右边的一条边
            while (r <= rightDownRow) {
                System.out.print(matrix[r++][c] + " ");
            }
            //恢复
            r = rightDownRow;
            c--;
            //下面一条边
            while (c >= leftUpCol) {
                System.out.print(matrix[r][c--] + " ");
            }
            //恢复
            c = leftUpCol;
            r--;
            while (r >= leftUpCol) {
                System.out.print(matrix[r--][c] + " ");
            }
            leftUpCol++;leftUpRow++;rightDownCol--;rightDownRow--;
        }
    }
}
