package com.zf.test2;

import java.util.Scanner;

public class RandomNums {
	//��ʼ��
	public static void caiNum() {
		Scanner sc=new Scanner(System.in);
		int num=(int)(Math.random()*100+1);
		do {
			System.out.println("���������µ�����");
			int number=sc.nextInt();
			if (num<number) {
				System.out.println("�´��ˣ�");
				continue;
			}if (num>number) {
				System.out.println("��С�ˣ�");
				continue;
			}else {
				System.out.println("��ϲ�㣬�¶��ˣ�");
				return;
			}
		} while (true);
	}
	
	//��̬�����
	static {
		System.out.println("-----��ӭ�������ֲ�����-----");
		System.out.println("�뿪ʼ��������");
	}
	public static void main(String[] args) {
		RandomNums.caiNum();
	}
}
