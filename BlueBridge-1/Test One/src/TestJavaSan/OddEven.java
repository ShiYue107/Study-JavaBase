package TestJavaSan;

import java.util.Scanner;

public class OddEven {
	public int odd(int num) {
		int num1 = num;
		int sum = 0;
		for (int i = 1; i <=num1; i++) {
			if (i%2!=0) {
				System.out.print(i+",");
				sum+=i;
			}
		}
		return sum;
	}
	public int even(int num) {
		int num1 = num;
		int sum = 0;
		for (int i = 1; i <=num1; i++) {
			if (i%2==0) {
				System.out.print(i+",");
				sum+=i;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个数字：");
		int num = sc.nextInt();
		OddEven oe=new OddEven();
		System.out.print("1-"+num+"之间的奇数有：");
		int oddNum=oe.odd(num);
		System.out.print("奇数和为"+oddNum);
		System.out.println();
		System.out.print("1-"+num+"之间的偶数有：");
		int evenNum=oe.even(num);
		System.out.print("偶数和为"+evenNum);
	}
}
