package dome03;

import java.util.Scanner;

public class privateBarracks {
	Scanner sc=new Scanner(System.in);
	static int count;
	static int index=0;
	private String name;
	private int selfCount;
	String [] arr1=new String[3];
	int [] arr2=new int[3];
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if (name.length()<4||name.length()>8) {
			System.out.println("您输入的名称不符，长度在4~8位之间");
			System.out.println("请输入"+index+"个兵营的名字：");
			this.setName(sc.next());
		}
		this.name = name;
	}
	public int getSelfCount() {
		return selfCount;
	}
	public void setSelfCount(int selfCount) {
		if (selfCount<100||selfCount>500) {
			System.out.println("您输入的数量不符，数据值在100~500位之间");
			System.out.println("请输入"+index+"个兵营已创建的士兵总数：");
			this.setSelfCount(sc.nextInt());
			
		}
		this.selfCount = selfCount;
	}
	public void oprtator() {
		for (int i = 0; i < 3; i++) {
			Scanner imput=new Scanner(System.in);
			privateBarracks pbas=new privateBarracks();
			index++;
			System.out.println("请输入第"+(i+1)+"个兵营的名字：");
			pbas.setName(imput.next());
			arr1[i]=pbas.getName();
			System.out.println("请输入第"+(i+1)+"个兵营已创建的士兵总数：");
			pbas.setSelfCount(imput.nextInt());
			arr2[i]=pbas.getSelfCount();
			privateBarracks.count+=pbas.getSelfCount();
		}
		System.out.println("当前创造3个兵营的士兵总数是"+count);
		System.out.println("每个兵营的名字及创建的士兵人数如下：");
		for (int j = 0; j < 3; j++) {
			System.out.println("兵营"+(j+1)+"信息:"+arr1[j]+" 创建士兵："+arr2[j]);
		}
	}	
}
