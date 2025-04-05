import java.util.Scanner;

public class Main2 {
//1 1 3 4 7 ............	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(f(1, 1, 3, n));
	}
	public static int f(int n1,int n2,int c,int n) {
		if(c==n) {
			return n1+n2;
		}
		return f(n2,n1+n2,c+1,n);
	}
}
