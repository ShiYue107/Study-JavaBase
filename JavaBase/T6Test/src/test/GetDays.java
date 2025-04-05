package test;

import java.util.Scanner;

public class GetDays {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入年月日：");
		int year=sc.nextInt();
		int month=sc.nextInt();
		int day=sc.nextInt();
		int days=0;
		for (int i = 1; i <month; i++) {
			switch (i) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:	
				days+=31;
				break;
			case 2:
				if ((year%100!=0&&year%4==0)||year%400==0) {
					days+=29;
				}else {
					days+=28;
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11:	
				days+=30;
				break;	
			default:
				break;
			}
		}
		days+=day;
		System.out.printf("%d年%d月%d日是当前年的第%d天",year,month,day,days);
	}
}
