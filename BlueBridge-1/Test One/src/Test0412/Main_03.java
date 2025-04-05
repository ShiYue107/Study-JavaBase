package Test0412;

import java.util.Scanner;

public class Main_03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int L=sc.nextInt();
        int [][] nums=new int[2][n];
        for (int i=0;i<2;i++){
            for (int j=0;j<n;j++){
                nums[i][j]=sc.nextInt();
            }
        }
        System.out.println();
    }
}
