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
			System.out.println("�������"+(i+1)+"����Ӫ�����֣�");
			this.name=sc.next();
			System.out.println("�������"+(i+1)+"����Ӫ��ʿ����������");
			this.selfCount=sc.nextInt();
			Barracks.count+=this.selfCount;
		}
		System.out.println("��ǰ����3����Ӫ��ʿ��������"+Barracks.count);
	
	}
}
