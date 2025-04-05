package Test0405;

import java.util.Scanner;

public class TestTwo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [] nums=new int[20];
		int number=0;
		for (int i = 0; i < nums.length; i++) {
			int temp=sc.nextInt();
			if (temp==0) {
				sc.close();
				break;
			}
			nums[i]=temp;
			number++;
		}
		for (int i = number; i >=0 ; i--) {
			System.out.print(nums[i]+" ");
		}
	}
}
