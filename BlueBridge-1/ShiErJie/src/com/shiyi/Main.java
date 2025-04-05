package com.shiyi;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入全排列的字符串：");
		String str=sc.nextLine();
		char []num=str.toCharArray();
		pailie(num, 0);
	}
	public static void pailie(char shu[], int k){
        if(k==shu.length){
            for(int i=0;i<shu.length;i++){
                System.out.print(shu[i] + " ");
            }
            System.out.println();
        }
        for(int i=k;i<shu.length;i++){
            //交换
            {char t = shu[k];shu[k] = shu[i];shu[i] = t;}
            //递归，下一个数去排列
            pailie(shu,k+1);
            //交换回来
            {char t = shu[k];shu[k] = shu[i];shu[i] = t;}
        }
    }
}
