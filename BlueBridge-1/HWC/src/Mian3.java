import java.util.Scanner;

public class Mian3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String str1=str.substring(0, str.length()/2);
		String str2=str.substring(str.length()/2,str.length());
		System.out.println(str1+","+str2+","+str.length());
	}
}
