package domeTest;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		CaculatorNum c1=new CaculatorNum();
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入第1个数字：");
		int num1=sc.nextInt();
		c1.setNum1(num1);
		System.out.println("请输入操作符：");
		char operator=sc.next().charAt(0);
		c1.setOperator(operator);
		System.out.println("请输入第2个数字：");
		int num2=sc.nextInt();
		c1.setNum2(num2);
		c1.caculate(operator);
	}
}
