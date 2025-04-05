package TestJavaSan;

import java.util.Scanner;

public class EmployeeSalary {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入5名员工的工资：");
		int[]money=new int [5];
		for (int i = 0; i < money.length; i++) {
			System.out.println((i+1)+"名员工薪资：");
			money[i] = sc.nextInt();
		}
		System.out.println("请输入需要加薪的员工序号：");
		int num = sc.nextInt()-1;
		System.out.println("请输入所加薪资：");
		int num1 = sc.nextInt();
		if (num<0||num>=5) {
			System.out.println("输入的员工序号不存在！操作失败！");
		}else {
			int end = money[num]+num1;
			System.out.println("加薪后薪资：");
			System.out.println(end);
		}
	}
	
}
