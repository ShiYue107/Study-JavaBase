package com.zf.test;

import java.util.Arrays;
import java.util.Scanner;

public class StringOperator {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in); 
		//输入纯字符串
		System.out.println("请输入纯字符串：");
		String chun =sc.next();
		//输出当前字符串
		System.out.println("当前字符串："+chun);
		//输出当前字符串长度
		System.out.println("当前字符串的长度："+chun.length());
		//字符串转数组
		char [] arr=chun.toCharArray();
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		//定义出现次数最多的字符
		char max='1';
		//定义出现的次数
		int index=1;
		int maxIndex=0;
		//ovslloveshdsyx
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i]==arr[i+1]) {
				index++;
			}
			if (arr[i]!=arr[i+1]) {
				if (index>maxIndex) {
					maxIndex=index;
					max=arr[i];
				}
				index=1;
			}
		}
		System.out.println("出现次数最多的字母是："+max+" 次数："+maxIndex);
		
		String newString = chun.replace(max, '-');
		
		System.out.println("字符"+max+"被替换后新的字符串："+newString);
		
		System.out.println("将字符串按照-进行拆分后的数组遍历：");
		
		String [] newArr=newString.split("-");
		
		for (int i = 0; i < newArr.length; i++) {
			System.out.println(newArr[i]);
		}
		
	}
}
