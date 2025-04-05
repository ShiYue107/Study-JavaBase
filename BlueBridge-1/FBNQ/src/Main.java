import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(f(num));
	}
	public static int f(int n) {
		if(n==3) {
			return 2;
		}
		if(n<3) {
			return 1;
		}
		return f(n-1)+f(n-2);
	}
}
