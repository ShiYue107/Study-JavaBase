package com.shiyi1;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("������������Ʒ�Ľ�");
		double money=sc.nextDouble();
		System.out.println("��ѡ���Żݻ������");
		System.out.println("1.����50Ԫ����1Ԫ�ɻ���һƿ�ɿڿ���\n"
				+ "2.����100Ԫ����2Ԫ�ɻ���һƿϴ�ྫ\n3.����200Ԫ����5Ԫ�ɻ���һƿ����˿ϴ��ˮ\n"
				+ "4.����300Ԫ����10Ԫ�ɻ���һ������ţ��\n0.������");
		System.out.print("��ѡ�����ͣ�");
		int choose=sc.nextInt();
		switch (choose) {
		case 1:
			if (money>=50) {
				money+=1;
				System.out.println("���������ܽ�"+money+"\n�ɹ�������һƿ�ɿڿ���");
				break;
			}else {
				System.out.println("�������ѽ��û����50Ԫ��");
				System.out.println("���������ܽ�"+money);
				break;
			}
		case 2:
			if (money>=100) {
				money+=1;
				System.out.println("���������ܽ�"+money+"\n�ɹ�������һƿϴ�ྫ");
				break;
			}else {
				System.out.println("�������ѽ��û����100Ԫ��");
				System.out.println("���������ܽ�"+money);
				break;
			}
		case 3:
			if (money>=200) {
				money+=1;
				System.out.println("���������ܽ�"+money+"\n�ɹ�������һƿ����˿ϴ��ˮ");
				break;
			}else {
				System.out.println("�������ѽ��û����200Ԫ��");
				System.out.println("���������ܽ�"+money);
				break;
			}
		case 4:
			if (money>=300) {
				money+=1;
				System.out.println("���������ܽ�"+money+"\n�ɹ�������һ������ţ��");
				break;
			}else {
				System.out.println("�������ѽ��û����300Ԫ��");
				System.out.println("���������ܽ�"+money);
				break;
			}
		case 0:
			System.out.println("���������ܽ�"+money);
			break;
		default:
			System.out.println("������");
			break;
		}
	}
}
