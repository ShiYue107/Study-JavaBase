package com.come_7.java;

import java.util.Scanner;

public class TestCom {
	// ��һ��
//	public static void main(String[] args) {
//		BigInteger a=new BigInteger("7");
//		BigInteger b=new BigInteger("1921");
//		BigInteger c=a.pow(2020).mod(b);
//		System.out.println(c);
//		
//	}
	// �ڶ���
//	public static void main(String[] args) {
//		String str="YeRikGSunlRzgDlvRwYkXkrGWWhXaA";
//		System.out.println(str);
//	}
	// ������
		/**
		 * ��ʼʱ��С����������������ֵ��Ϊ 10000�����С���ܲ���ÿ�������
		600 �����������С����Ϣ��ÿ�������� 300 ����������������ĺ����Ӷ��Ǿ��ȱ仯�ġ�
		С��������һ���ӡ���Ϣһ���ӡ�����һ���ӡ�����Ϣһ���ӡ������ѭ
		�������ĳ��ʱ��С������������ 0������ֹͣ������
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
	//������
	/*
	 * ���� ��Ϊ10
	 */
	//������
	/*
	 * 
	 */
	//������
	/*
	 * ����һ���ַ��������������ַ����������ٸ���д��ĸ�����ٸ�Сд��
		ĸ�����ٸ����֡�
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
	//������
	/*
	 * ��һ�����У����еĵ�һ������ n�������ÿ������ǰһ�������� 2������
		�����������ֵΪ�������
	 */
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		while(n!=0) {
//			System.out.print(n+" ");
//			n/=2;
//		}
//	}
	//�ڰ���
	/*
	 * ��ƽ������һЩ��ά�ĵ���
	��Щ��ı�ž����ά����ı��һ�������ϵ�������Ϊ�� 1 ���� n �У�
	����������Ϊ�� 1 ���� m �У�ÿһ����������кź��к�����ʾ��
	�����и���վ�ڵ� 1 �е� 1 �У�Ҫ�ߵ��� n �е� m �С�ֻ�����һ��������ߡ�
	ע�⣬����кź���������ż��������������һ���С�
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
	//�ھ���
	/*
	 * С��������һ�ָ���ȫ��д��ĸ��ɵ��ַ�������ķ���������ÿһ����
	д��ĸ��С������ת�������� 26 ��Ӣ����ĸ����ţ��� A �� 1, B �� 2, ... Z ��26��
	����һ���ַ������ܱ�ת����һ���������У�
	���� ABCXYZ �� 123242526��
	���ڸ���һ��ת������������У�С���뻹ԭ��ԭ�����ַ�������Ȼ�����Ļ�ԭ�п���
	���ڶ�������������ַ�����С��ϣ���ҳ������ֵ��������ַ�����
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
	//��ʮ��
	/*
	 * �����������Ϊ n ������ A1, A2, �� �� �� , An������Դ���ѡ�������� Ai �� Aj
	(i ������ j)��Ȼ�� Ai �� Aj һǰһ��ƴ��һ���µ����������� 12 �� 345 ��
	��ƴ�� 12345 �� 34512 ��ע�⽻�� Ai �� Aj ��˳�����Ǳ���Ϊ 2 ��ƴ���������� Ai = Aj ʱ��
	��������ж�����ƴ������ƴ��������С�ڵ��� K��
	 */
//	public static void main(String[] args) {
//		
//	}
}
