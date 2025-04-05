package dome02;

import java.util.Scanner;

public class Barracks {
	static int count;
	String name;
	int selfCount;
	public void oprtator() {
		Scanner sc=new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			Barracks bas=new Barracks();
			System.out.println("请输入第"+(i+1)+"个兵营的名字：");
			this.name=sc.next();
			System.out.println("请输入第"+(i+1)+"个兵营的士兵的总数：");
			this.selfCount=sc.nextInt();
			Barracks.count+=this.selfCount;
		}
		System.out.println("当前创造3个兵营的士兵总数是"+Barracks.count);
	
	}
}
