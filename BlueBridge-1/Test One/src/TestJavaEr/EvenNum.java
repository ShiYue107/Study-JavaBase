package TestJavaEr;
import java.util.Scanner;

public class EvenNum {
	int num1,num2;
	public void even(int num1,int num2) {
		for (int i = num1; i <=num2; i++) {
			if (i%2==0) {

				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������ʼ���֣�");
		int num1= sc.nextInt();
		System.out.println("������������֣�");
		int num2= sc.nextInt();
		EvenNum en = new EvenNum();
		System.out.println("���������ż��Ϊ��");
		en.even(num1, num2);

	}
}
