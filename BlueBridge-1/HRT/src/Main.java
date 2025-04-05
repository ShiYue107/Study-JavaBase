import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String y=sc.next();
		String m=sc.next();
		String k=sc.next();
		int n=sc.nextInt();
		f(y,m,k,n);
	}
	public static void f(String y,String m,String k,int n) {
		if(n==1) {
			System.out.println(y+"->"+m);
			return;
		}
		f(y,k,m,n-1);
		f(y,m,k,1);
		f(k,m,y,n-1);
	}
}
