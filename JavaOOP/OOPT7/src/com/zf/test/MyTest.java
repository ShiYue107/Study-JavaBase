package com.zf.test;

import java.util.Scanner;

public class MyTest {
	public static void main(String[] args) {
		UserInfoSys user=new UserInfoSys();
		Scanner sc=new Scanner(System.in);
		while (true) {
			System.out.println("�����������/��1����� ��2��ɾ�� ��3����ѯ");
			int number=sc.nextInt();
			switch (number) {
			case 1:
				user.addUser();
				break;
			case 2:
				user.deleUser();
				break;
			case 3:
				user.celeUser();
				break;
			default:
				System.out.println("�����������������롣");
				continue;
			}
		}
	}
}
