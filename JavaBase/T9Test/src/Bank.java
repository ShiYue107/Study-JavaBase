import java.util.Random;
import java.util.Scanner;

public class Bank {
	static Scanner sc=new Scanner(System.in);
	
	public static int qu(int balance) {
		System.out.println("*******ȡ��*******");
		System.out.println("��������ȡ���");
		int money=sc.nextInt();
		if (balance<money) {
			System.out.println("��������,ȡ��ʧ�ܣ�");
		}else {
			balance-=money;
		}
		return balance;
	}
	
	public static int cun(int balance) {
		System.out.println("*******���*******");
		System.out.println("�����������");
		int money=sc.nextInt();
		balance+=money;
		return balance;
	}
	
	public static void cha(int balance) {
		System.out.println("*******��ѯ*******");
		System.out.println("�������Ϊ��"+balance);
	}
	
	public static void bankStart() {
		System.out.println("*****��ӭʹ�ñ�����*****\n�������ࣺ\n��1���鿴���\n��2��ȡ��\n��3��"
				+ "���\n��0���˳�");
		Random rand=new Random();
		int balance=rand.nextInt(20000)+1;
		int num;
		do {
			System.out.println("��ѡ��");
			num = sc.nextInt();
			switch (num) {
			case 1:
				cha(balance);
				break;
			case 2:
				balance=qu(balance);
				break;
			case 3:
				balance=cun(balance);
				break;
			case 0:
				System.out.println("��ӭ�´�ʹ�ã�");
				break;
			default:
				System.out.println("��������");
				break;
			}
		} while (num!=0);
	}
	
	public static void main(String[] args) {
		bankStart();
	}
}





