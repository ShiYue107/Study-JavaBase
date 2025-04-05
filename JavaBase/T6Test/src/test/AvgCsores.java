package test;

import java.util.Scanner;

public class AvgCsores {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入学生的姓名：");
		String name=sc.next();
		int sum=0;
		double avg=0;
		for (int i = 0; i < 5; i++) {
			System.out.println("请输入第"+(i+1)+"门课程的成绩：");
			int csoers=sc.nextInt();
			sum+=csoers;
		}
		avg=sum/5.0;
		System.out.printf("学生%s考试的平均成绩：%.2f",name,avg);
	}
}
