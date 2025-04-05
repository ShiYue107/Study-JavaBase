package com.eryi;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int []arr=new int[num];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
//		for (int i = 0; i < arr.length-1; i++) {
//			for (int j = 0; j < arr.length-i-1; j++) {
//				if (arr[j]>arr[j+1]) {
//					int temp=arr[j];
//					arr[j]=arr[j+1];
//					arr[j+1]=temp;
//				}
//			}
//		}
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]+" ");
//		}
		Arrays.sort(arr);
		for (int j : arr) {
			System.out.print(j+" ");
		}
	}
}
