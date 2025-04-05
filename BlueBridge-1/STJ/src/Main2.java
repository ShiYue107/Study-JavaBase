import java.util.Scanner;

public class Main2 {
	static int num=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		f(n);
		System.out.println(num);
	}
	public static void f(int n) {
		if(n==0) {
			num++;
			return;
//			return 1;
		}
		f(n-1);
		if(n>1) {
			f(n-2);
		}
//		if(n==1) {
//			return 1;
//		}
//		return f(n-1)+f(n-2);
	}
}
