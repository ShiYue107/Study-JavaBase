import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int mun=sc.nextInt();
//		int g=mun%10;
//		int s=mun/10%10;
//		int b=mun/100;
//		if(g*g*g* +b*b*b +s*s*s==mun) {
//			System.out.println("true");
//		}else {
//			System.out.println("false");
//		}
		
		name(mun);
	}
	public static void name(int n) {
		if(n==1) {
			System.out.print(1+"*"+1+"="+1);
			System.out.println();
		}else {
			name(n-1);
			for (int i = 1; i <=n; i++) {
				System.out.print(n+"*"+i+"="+(n*i)+"\t");
			}
			System.out.println();
		}
	}
}
