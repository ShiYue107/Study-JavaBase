package domeTest;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		CaculatorNum c1=new CaculatorNum();
		Scanner sc=new Scanner(System.in);
		System.out.println("�������1�����֣�");
		int num1=sc.nextInt();
		c1.setNum1(num1);
		System.out.println("�������������");
		char operator=sc.next().charAt(0);
		c1.setOperator(operator);
		System.out.println("�������2�����֣�");
		int num2=sc.nextInt();
		c1.setNum2(num2);
		c1.caculate(operator);
	}
}
