package com.zf.test;

import java.util.Arrays;
import java.util.Scanner;

public class StringOperator {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in); 
		//���봿�ַ���
		System.out.println("�����봿�ַ�����");
		String chun =sc.next();
		//�����ǰ�ַ���
		System.out.println("��ǰ�ַ�����"+chun);
		//�����ǰ�ַ�������
		System.out.println("��ǰ�ַ����ĳ��ȣ�"+chun.length());
		//�ַ���ת����
		char [] arr=chun.toCharArray();
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		//������ִ��������ַ�
		char max='1';
		//������ֵĴ���
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
		System.out.println("���ִ���������ĸ�ǣ�"+max+" ������"+maxIndex);
		
		String newString = chun.replace(max, '-');
		
		System.out.println("�ַ�"+max+"���滻���µ��ַ�����"+newString);
		
		System.out.println("���ַ�������-���в�ֺ�����������");
		
		String [] newArr=newString.split("-");
		
		for (int i = 0; i < newArr.length; i++) {
			System.out.println(newArr[i]);
		}
		
	}
}
