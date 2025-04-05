import java.util.Scanner;

/*
	键盘录入三个数，求出最大值，最小值，和平均数。
 */
public class Demo01 {
	
	public static double getMax(double num1,double num2,double num3) {
		if (num1>num2&&num1>num3) {
			return num1;
		}else if (num2>num1&&num2>num3) {
			return num2;
		}else {
			return num3;
		}
	}
	
	public static double getMin(double num1,double num2,double num3) {
		if (num1<num2&&num1<num3) {
			return num1;
		}else if (num2<num1&&num2<num3) {
			return num2;
		}else {
			return num3;
		}
	}
	
	public static double getAvg(double num1,double num2,double num3) {
		return (num1+num2+num3)/3.0;
	}
	public static void main(String[] args) {
		System.out.println("请您输入三个数：");
		Scanner sc=new Scanner(System.in);
		double num1=sc.nextDouble();
		double num2=sc.nextDouble();
		double num3=sc.nextDouble();
		double max = getMax(num1, num2, num3);
		double min = getMin(num1, num2, num3);
		double avg = getAvg(num1, num2, num3);
		System.out.printf("数字%.2f,%.2f,%.2f的最大值是%.2f,最小值是%.2f,平均数是%.2f",num1,num2,num3,max,min,avg);
	}
}












