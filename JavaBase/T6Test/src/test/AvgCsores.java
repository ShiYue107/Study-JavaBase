package test;

import java.util.Scanner;

public class AvgCsores {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������ѧ����������");
		String name=sc.next();
		int sum=0;
		double avg=0;
		for (int i = 0; i < 5; i++) {
			System.out.println("�������"+(i+1)+"�ſγ̵ĳɼ���");
			int csoers=sc.nextInt();
			sum+=csoers;
		}
		avg=sum/5.0;
		System.out.printf("ѧ��%s���Ե�ƽ���ɼ���%.2f",name,avg);
	}
}
