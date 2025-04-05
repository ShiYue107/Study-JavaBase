package com.lq.demo4;

public class Main2 {

    public static void main(String[] args) {
        int [][] matrix ={
                {1,2,3,4,100},
                {5,6,7,0,101},
                {10,0,11,15,102},
                {13,55,58,31,103},
        };
        solve(matrix);
        Util.printMatrix(matrix);
    }
    public static void solve(int [][]matrix){
        int M = matrix.length;
        int N =matrix[0].length;
        //记录哪些行出现了0
        int [] rowRecord=new int [M];
        //记录哪些列出现了0
        int [] colRecord=new int [N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (matrix[i][j]==0){
                    rowRecord[i]=1;
                    colRecord[j]=1;
                }
            }
        }
        for (int row = 0; row < M; row++) {
            for (int col = 0; col < N; col++) {
                if (rowRecord[row]==1||colRecord[col]==1){
                    matrix[row][col]=0;
                }
            }
        }
    }
}
