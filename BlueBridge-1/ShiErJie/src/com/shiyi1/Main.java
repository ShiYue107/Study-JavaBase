package com.shiyi1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("\t��ӭ�����������ϵͳ");
		System.out.println("*******************************");
		System.out.println("\t1.�鿴��Ʒ\n\t2. �ҵĹ��ﳵ\n\t3. �������\n\t4. ע��");
		System.out.println("*******************************");
		Scanner sc=new Scanner(System.in);
		System.out.print("������ѡ�");
		int num=sc.nextInt();
		switch (num) {
		case 1:
			System.out.println("�鿴��Ʒ>����鿴��Ʒ���棡");
			break;
		case 2:
			System.out.println("�鿴��Ʒ>�����ҵĹ��ﳵ���棡");
			break;
		case 3:
			System.out.println("�鿴��Ʒ>���빺�������棡");
			break;
		case 4:
			System.out.println("ϵͳ��ע����");
			break;
		default:
			System.out.println("�����ӣ��ú����룡");
			break;
		}
	}
}
