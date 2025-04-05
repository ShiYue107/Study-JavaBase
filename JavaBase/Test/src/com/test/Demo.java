package com.test;

import java.util.Scanner;

public class Demo {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int [] nums=new int[100];
		int sum=0;
		for (int i = 0; i < nums.length; i++) {
			int temp=sc.nextInt();
			if (temp!=1) {
				if (temp%7==1||temp%7==6) {
					nums[i]=temp;
				}else {
					continue;
				}
			sum++;	
			}else {
				sc.close();
				break;
			}
		}
	}
}
