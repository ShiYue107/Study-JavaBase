package TestJavaSan;

import java.util.Scanner;

public class EmployeeSalary {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������5��Ա���Ĺ��ʣ�");
		int[]money=new int [5];
		for (int i = 0; i < money.length; i++) {
			System.out.println((i+1)+"��Ա��н�ʣ�");
			money[i] = sc.nextInt();
		}
		System.out.println("��������Ҫ��н��Ա����ţ�");
		int num = sc.nextInt()-1;
		System.out.println("����������н�ʣ�");
		int num1 = sc.nextInt();
		if (num<0||num>=5) {
			System.out.println("�����Ա����Ų����ڣ�����ʧ�ܣ�");
		}else {
			int end = money[num]+num1;
			System.out.println("��н��н�ʣ�");
			System.out.println(end);
		}
	}
	
}
