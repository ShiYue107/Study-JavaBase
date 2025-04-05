import java.util.Scanner;

public class GetCsores {
	
	public static double getMax(double [] arr) {
		double max=arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}
	
	public static double getMin(double [] arr) {
		double min=arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min>arr[i]) {
				min=arr[i];
			}
		}
		return min;
	}
	
	public static double getSum(double [] arr) {
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		return sum;
	}
	
	public static void getCsores() {
		Scanner sc=new Scanner(System.in);
		double [] csores=new double[6];
		for (int i = 0; i < csores.length; i++) {
			System.out.println("请输入第"+(i+1)+"位裁判给出的得分：");
			csores[i]=sc.nextDouble();
		}
		double max = getMax(csores);
		double min = getMin(csores);
		double sum = getSum(csores);
		sum=sum-max-min;
		System.out.printf("去掉一个最高分：%.1f,一个最低分：%.1f,选手得分：%.1f",max,min,sum);
	}
	
	public static void main(String[] args) {
		getCsores();
	}
}










