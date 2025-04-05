import java.util.Scanner;

public class Mian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		for (int i = 0; i < str.length()/2; i++) {
			if(str.charAt(i)!=str.charAt(str.length()-1-i)) {
				System.out.println("false!");
				return;
			}
		}
		System.out.println("true!");
	}

}
