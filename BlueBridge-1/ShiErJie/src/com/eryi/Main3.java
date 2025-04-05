package com.eryi;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int max=0;
		int [] arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		for (int i = 0; i <m; i++) {
			max+=arr[i];
		}
		System.out.println(max);
	}
}
