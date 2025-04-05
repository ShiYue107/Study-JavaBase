package com.come_7.java;

import java.util.Scanner;

public class TestCom {
	// 第一题
//	public static void main(String[] args) {
//		BigInteger a=new BigInteger("7");
//		BigInteger b=new BigInteger("1921");
//		BigInteger c=a.pow(2020).mod(b);
//		System.out.println(c);
//		
//	}
	// 第二题
//	public static void main(String[] args) {
//		String str="YeRikGSunlRzgDlvRwYkXkrGWWhXaA";
//		System.out.println(str);
//	}
	// 第三题
		/**
		 * 初始时，小明充满体力，体力值计为 10000。如果小明跑步，每分钟损耗
		600 的体力。如果小明休息，每分钟增加 300 的体力。体力的损耗和增加都是均匀变化的。
		小明打算跑一分钟、休息一分钟、再跑一分钟、再休息一分钟……如此循
		环。如果某个时刻小明的体力到达 0，他就停止锻炼。
		 */
//	public static void main(String[] args) {
//		int start=10000;
//		int conter=0;
//		while (start>0) {
//			start-=300;
//			conter+=2;
//		}
//		int time=conter;
//		System.out.println(time);
//	}
	//第四题
	/*
	 * 疫情 答案为10
	 */
	//第五题
	/*
	 * 
	 */
	//第六题
	/*
	 * 输入一个字符串，请输出这个字符串包含多少个大写字母，多少个小写字
		母，多少个数字。
	 */
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		String str=sc.next();
//		int dx=0;
//		int xx=0;
//		int sz=0;
//		for (int i = 0; i < str.length(); i++) {
//			char ch=str.charAt(i);
//			if(ch>=48&&ch<=57) {
//				sz++;
//			}else if(ch>=65&&ch<=90) {
//				dx++;
//			}else if(ch>=97&&ch<=122) {
//				xx++;
//			}
//		}
//		System.out.println(dx+"\n"+xx+"\n"+sz);
//	}
	//第七题
	/*
	 * 有一个序列，序列的第一个数是 n，后面的每个数是前一个数整除 2，请输
		出这个序列中值为正数的项。
	 */
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		while(n!=0) {
//			System.out.print(n+" ");
//			n/=2;
//		}
//	}
	//第八题
	/*
	 * 在平面上有一些二维的点阵。
	这些点的编号就像二维数组的编号一样，从上到下依次为第 1 至第 n 行，
	从左到右依次为第 1 至第 m 列，每一个点可以用行号和列号来表示。
	现在有个人站在第 1 行第 1 列，要走到第 n 行第 m 列。只能向右或者向下走。
	注意，如果行号和列数都是偶数，不能走入这一格中。
	*/
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int m=sc.nextInt();
//		sc.close();
//		int [][] dp=new int [n][m];
//		if(n%2==0&&m%2==0) {
//			System.out.println(0);
//		}
//	}
	//第九题
	/*
	 * 小明发明了一种给由全大写字母组成的字符串编码的方法。对于每一个大
	写字母，小明将它转换成它在 26 个英文字母中序号，即 A → 1, B → 2, ... Z →26。
	这样一个字符串就能被转化成一个数字序列：
	比如 ABCXYZ → 123242526。
	现在给定一个转换后的数字序列，小明想还原出原本的字符串。当然这样的还原有可能
	存在多个符合条件的字符串。小明希望找出其中字典序最大的字符串。
	 */
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		String str=sc.next();
//		StringBuffer stb=new StringBuffer();
//		for (int i = 0; i < str.length(); i++) {
//			int k=str.charAt(i)-'0';
//			if(k<=2) {
//				int t=k*10+str.charAt(i+1)-'0';
//				if(t<26) {
//					stb.append((char)('A'+t-1));
//					i++;
//					continue;
//				}
//			}
//			stb.append((char)('A'+k-1));
//		}
//		System.out.println(stb.toString());
//	}
	//第十题
	/*
	 * 给定义个长度为 n 的数组 A1, A2, · · · , An。你可以从中选出两个数 Ai 和 Aj
	(i 不等于 j)，然后将 Ai 和 Aj 一前一后拼成一个新的整数。例如 12 和 345 可
	以拼成 12345 或 34512 。注意交换 Ai 和 Aj 的顺序总是被视为 2 种拼法，即便是 Ai = Aj 时。
	请你计算有多少种拼法满足拼出的整数小于等于 K。
	 */
//	public static void main(String[] args) {
//		
//	}
}
