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
			System.out.println("����������Ʋ�����������4~8λ֮��");
			System.out.println("������"+index+"����Ӫ�����֣�");
			this.setName(sc.next());
		}
		this.name = name;
	}
	public int getSelfCount() {
		return selfCount;
	}
	public void setSelfCount(int selfCount) {
		if (selfCount<100||selfCount>500) {
			System.out.println("���������������������ֵ��100~500λ֮��");
			System.out.println("������"+index+"����Ӫ�Ѵ�����ʿ��������");
			this.setSelfCount(sc.nextInt());
			
		}
		this.selfCount = selfCount;
	}
	public void oprtator() {
		for (int i = 0; i < 3; i++) {
			Scanner imput=new Scanner(System.in);
			privateBarracks pbas=new privateBarracks();
			index++;
			System.out.println("�������"+(i+1)+"����Ӫ�����֣�");
			pbas.setName(imput.next());
			arr1[i]=pbas.getName();
			System.out.println("�������"+(i+1)+"����Ӫ�Ѵ�����ʿ��������");
			pbas.setSelfCount(imput.nextInt());
			arr2[i]=pbas.getSelfCount();
			privateBarracks.count+=pbas.getSelfCount();
		}
		System.out.println("��ǰ����3����Ӫ��ʿ��������"+count);
		System.out.println("ÿ����Ӫ�����ּ�������ʿ���������£�");
		for (int j = 0; j < 3; j++) {
			System.out.println("��Ӫ"+(j+1)+"��Ϣ:"+arr1[j]+" ����ʿ����"+arr2[j]);
		}
	}	
}
