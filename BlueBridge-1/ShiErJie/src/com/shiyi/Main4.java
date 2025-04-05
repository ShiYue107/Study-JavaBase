package com.shiyi;

import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for (int i = 1; i <=n; i++) {
			for (int k =0; k<=n-i; k++) {
				System.out.print("*");
			}
			for (int j = 0; j <(2*i-1); j++) {
				System.out.print(" ");
			}
			for (int k =0; k<=n-i; k++) {
				System.out.print("*");			
			}
			System.out.println();
		}
		for (int a = 2; a <n+1; a++) {
			for (int b = 0; b <a; b++) {
				System.out.print("*");
			}
			int num=n;
			for (int j =0; j <(2*num-(2*a-1)); j++) {
				System.out.print(" ");
			}
			for (int b = 0; b <a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
