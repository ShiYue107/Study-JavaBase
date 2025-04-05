package com.lq.demo4;

public class Util {
    public static void printMatrix(int [][] matrix){
        for (int [] arr:matrix) {
            for (int e :arr) {
                System.out.print(e+"\t");
            }
            System.out.println();
        }
    }
}
