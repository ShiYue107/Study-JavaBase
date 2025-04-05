package com.lq.test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int M=sc.nextInt();
        int N=sc.nextInt();
        int [][]A=new int[M][N];
        int [][]B=new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                B[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[0][i]+" ");
        }
    }

}
