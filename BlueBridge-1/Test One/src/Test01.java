import java.lang.reflect.Method;
import java.util.Scanner;
public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		//一个数的阶乘
//		System.out.println("请输入一个数：");
//		int cet = 1;
//		int i =1;
//		int num  = sc.nextInt();
//		while (i<=num) {
//			cet*=i;
//			i++;
//		}
//		System.out.println("数字"+num+"的阶乘为："+cet);
		//高精度加法
//		System.out.println("请输入两个数：");
//		long num1 = sc.nextLong();
//		long num2 = sc.nextLong();
//		long sum = num1 + num2;
//		System.out.println("这两个数的和为："+sum);
		//Huffuan树
		
		//时间转换
//		System.out.println("请输入一个整数t(0<=t<=86399)");
//		int t = sc.nextInt();
//		int num = t;
//		while (num<0||num>86400) {
//			System.out.println("请输入一个整数t(0<=t<=8639)");
//			t = sc.nextInt();
//			num = t;
//		}
//		int h = num/3600;
//		int m = (num - (h*3600))/60;
//		int s = num - (h*3600)-(m*60);
//		System.out.println(h+":"+m+":"+s);
		
		//3月3日
		//A+B问题
//		System.out.println("请输入A,B(-10000<A,B<10000)");
//		int A = sc.nextInt();
//		int B = sc.nextInt();
//		if (A<-1000||A>10000||B<-1000||B>10000) {
//			System.out.println("请输入A,B(-10000<A,B<10000)");
//			A = sc.nextInt();
//			B = sc.nextInt();
//		}
//		int sum = A+B;
//		System.out.println(sum);
		
		//序列求和
//		System.out.println("请输入整数n【1-1000000】");
//		int num = sc.nextInt();
//		int fce = 0;
//		for (int i = 0; i <= num; i++) {
//			fce+=i;
//		}
//		System.out.println(fce);
		
		// 圆的面积
//		System.out.print("请输入圆的半径：");
//		double π = 3.1415926731;
//		int radius = sc.nextInt();
//		double area = π*radius;
//		System.out.printf("%.7f",area );
		
		//Fibonacci数列
//		System.out.print("请输入n:");
//		int n = sc.nextInt();
//		int f1 = 1;
//		int f2 = 1;	
//		int Fn = 0;
//		if (n<=2) {
//			Fn = 1;
//		} else {
//			for (int i = 0; i < n-2; i++) {
//				int temp = f2;
//				f2 = (f1+f2)%10007;
//				f1 = temp;
//			}
//			Fn = f2;
//		}
//		System.out.println(Fn);
		
		//九九阶乘
//		name(9);
	}
	public static void name(int a) {
		if (a==1) {
			System.out.print(1+"*"+1+"="+1);
			System.out.println();
		}
		else {
			name(a-1);
			for (int i = 1; i <=a; i++) {
				System.out.print(a+"*"+i+"="+(i*a)+"\t");
			}
			System.out.println();
		}
	}
	
}
