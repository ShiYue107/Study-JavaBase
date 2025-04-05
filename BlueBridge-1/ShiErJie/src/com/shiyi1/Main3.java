package com.shiyi1;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个三位数：");
		int num = sc.nextInt();
		int g = num % 10;
		int s = num / 10 % 10;
		int b = num / 100;
		if (g*g*g+s*s*s+b*b*b==num) {
			System.out.println(num+"是水仙花数");
		}
	}
}
