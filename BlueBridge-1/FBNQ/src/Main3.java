import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int n1=1,n2=1;
		for (int i =3; i <=r; i++) {
			int t=n1;
			n1=n2;
			n2=n2+t;
		}
		System.out.println(n2);
	}

}
