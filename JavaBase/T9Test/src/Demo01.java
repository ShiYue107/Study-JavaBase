import java.util.Scanner;

/*
	����¼����������������ֵ����Сֵ����ƽ������
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
		System.out.println("����������������");
		Scanner sc=new Scanner(System.in);
		double num1=sc.nextDouble();
		double num2=sc.nextDouble();
		double num3=sc.nextDouble();
		double max = getMax(num1, num2, num3);
		double min = getMin(num1, num2, num3);
		double avg = getAvg(num1, num2, num3);
		System.out.printf("����%.2f,%.2f,%.2f�����ֵ��%.2f,��Сֵ��%.2f,ƽ������%.2f",num1,num2,num3,max,min,avg);
	}
}












