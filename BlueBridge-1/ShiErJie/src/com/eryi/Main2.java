package com.eryi;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
				Scanner in=new Scanner(System.in);
				int n=in.nextInt();
				int[] arr=new int[999];
				//计数
				int count =0;
				//循环找质数
				for(int i=2;i<n;i++){
					//默认设置质数
					int prime=1;
					//循环判断是否有整除数
					for(int j=2;j<i;j++){
						//判断是否整除
						if(i%j==0){
							//整除则不是质数
							prime=0;
							break;
						}
					}
					//1为质数
					if(prime==1){
						//存储质数
						arr[count]=i;
						//计数加1
						count++;
					}
				}
				System.out.println(count);
				for(int i=0;i<count;i++){
					System.out.print(arr[i]+" ");
				}
	}
}
