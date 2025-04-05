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
			System.out.println("�������"+(i+1)+"λ���и����ĵ÷֣�");
			csores[i]=sc.nextDouble();
		}
		double max = getMax(csores);
		double min = getMin(csores);
		double sum = getSum(csores);
		sum=sum-max-min;
		System.out.printf("ȥ��һ����߷֣�%.1f,һ����ͷ֣�%.1f,ѡ�ֵ÷֣�%.1f",max,min,sum);
	}
	
	public static void main(String[] args) {
		getCsores();
	}
}










