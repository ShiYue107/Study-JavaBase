import java.util.Scanner;

public class Mian2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String strn= new StringBuilder(str).reverse().toString();
		if (str.equals(strn)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
}
