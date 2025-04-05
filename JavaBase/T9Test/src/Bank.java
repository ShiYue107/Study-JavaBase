import java.util.Random;
import java.util.Scanner;

public class Bank {
	static Scanner sc=new Scanner(System.in);
	
	public static int qu(int balance) {
		System.out.println("*******取款*******");
		System.out.println("请您输入取款金额：");
		int money=sc.nextInt();
		if (balance<money) {
			System.out.println("您的余额不足,取款失败！");
		}else {
			balance-=money;
		}
		return balance;
	}
	
	public static int cun(int balance) {
		System.out.println("*******存款*******");
		System.out.println("请您输入存款金额：");
		int money=sc.nextInt();
		balance+=money;
		return balance;
	}
	
	public static void cha(int balance) {
		System.out.println("*******查询*******");
		System.out.println("您的余额为："+balance);
	}
	
	public static void bankStart() {
		System.out.println("*****欢迎使用本银行*****\n服务种类：\n【1】查看余额\n【2】取款\n【3】"
				+ "存款\n【0】退出");
		Random rand=new Random();
		int balance=rand.nextInt(20000)+1;
		int num;
		do {
			System.out.println("请选择：");
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
				System.out.println("欢迎下次使用！");
				break;
			default:
				System.out.println("输入有误！");
				break;
			}
		} while (num!=0);
	}
	
	public static void main(String[] args) {
		bankStart();
	}
}





