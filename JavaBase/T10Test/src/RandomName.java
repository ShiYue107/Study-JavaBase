import java.util.Random;
import java.util.Scanner;

public class RandomName {
	
	static Random rand=new Random();
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		String[] name=new String[5];
		for (int i = 0; i < name.length; i++) {
			System.out.println("请输入第"+(i+1)+"名员工的姓名：");
			name[i]=sc.next();
		}
		int index=rand.nextInt(name.length);
		System.out.println("当选组长的员工是："+name[index]);
	}
}
