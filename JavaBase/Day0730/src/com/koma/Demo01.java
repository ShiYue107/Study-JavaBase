package com.koma;

import java.util.Random;
import java.util.Scanner;

public class Demo01 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入随机数的起始值：");
		int start =sc.nextInt();
		System.out.println("请输入随机数的结束值：");
		int end =sc.nextInt();
		int num = suan(start, end);
		System.out.println(num);
	}
	public static int suan(int start,int end) {
		Random rand = new Random();
		int revose=rand.nextInt(end-start+1)+start;
		return revose;
	}

}
