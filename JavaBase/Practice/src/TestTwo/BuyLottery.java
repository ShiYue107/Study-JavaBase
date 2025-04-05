package TestTwo;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BuyLottery {
	int [][]arrayNum = new int [5][5];//��ѡ
	int [][]optionNum=new int [5][5];//��ѡ
	int []awardNum=new int[5];
	String[]no3=new String[5];
	String[]no2=new String[5];
	String[]no1=new String[5];
	//��ѡ
	public void opLottery() {
		System.out.println("��ѡ��");
		System.out.println("������Ҫ��ע��(���5ע)");
		Scanner sc=new Scanner(System.in);
		int howNum=sc.nextInt();
		optionNum=new int [howNum][5];
		for (int i = 0; i < optionNum.length; i++) {
			for (int j = 0; j < optionNum[i].length; j++) {
				System.out.println("������"+(i+1)+"ע�ĵ�"+(j+1)+"�����룺");
				int num=sc.nextInt();
			}
			Arrays.sort(optionNum[i]);
		}
	}
	//��ѡ
	public void pcLottery() {
		System.out.println("��ѡ����");
		Random rdm=new Random();
		for (int i = 0; i < arrayNum.length; i++) {
			for (int j = 0; j < arrayNum[i].length; j++) {
				int value=rdm.nextInt(33);
				while (true) {
					if (arrayIf(arrayNum[i], value)) {
						value=rdm.nextInt(33);
					}else {
						break;
					}
				}
				arrayNum[i][j]=value;
			}
			Arrays.sort(arrayNum[i]);
		}
	}
	//�ж��ظ�
	public boolean arrayIf(int[]array,int value) {
		boolean no=false;
		for (int i = 0; i < array.length; i++) {
			if (array[i]==value) {
				no=true;
				break;
			}
		}
		return no;
	}
	
	//�н�����
	public void drawLotty() {
		Random rdm=new Random();
		for (int i = 0; i < arrayNum.length; i++) {
			int value=rdm.nextInt(33);
			while (true) {
				if (arrayIf(awardNum, value)) {
					value=rdm.nextInt(33);
				}else {
					break;
				}
			}
			awardNum[i]=value;
		}
		Arrays.sort(awardNum);
	}
	//����
	public void getLottery() {
		for (int i = 0; i < arrayNum.length; i++) {
			int sum=0;
			for (int j = 0; j < awardNum.length; j++) {
				if (arrayIf(arrayNum[i], awardNum[j])) {
					sum++;
				}else {
					continue;
				}
			}
			switch (sum) {
			case 3:
				no3[i]=Arrays.toString(arrayNum[i]);
				break;
			case 4:
				no2[i]=Arrays.toString(arrayNum[i]);
				break;
			case 5:
				no1[i]=Arrays.toString(arrayNum[i]);
				break;
	
			default:
				break;
			}
		}
		for (int i = 0; i < optionNum.length; i++) {
			int sum=0;
			for (int j = 0; j < arrayNum.length; j++) {
				if (arrayIf(optionNum[i], awardNum[j])) {
					sum++;
				}else {
					continue;
				}
			}
			switch (sum) {
			case 3:
				no3[i]=Arrays.toString(optionNum[i]);
				break;
			case 4:
				no2[i]=Arrays.toString(optionNum[i]);
				break;
			case 5:
				no1[i]=Arrays.toString(optionNum[i]);
				break;
	
			default:
				break;
			}
		}
		showRes();
	}
	
	public void showRes() {
		System.out.println("��ѡ����Ϊ��");
		for (int i = 0; i < arrayNum.length; i++) {
			System.out.println(Arrays.toString(arrayNum[i]));
		}
		System.out.println("��ѡ����Ϊ��");
		for (int i = 0; i < optionNum.length; i++) {
			System.out.println(Arrays.toString(optionNum[i]));
		}
		System.out.println("�������룺");
		System.out.println(Arrays.toString(awardNum));
		System.out.println("һ�Ƚ����룺");
		System.out.println(Arrays.toString(no1));
		System.out.println("���Ƚ����룺");
		System.out.println(Arrays.toString(no2));
		System.out.println("���Ƚ����룺");
		System.out.println(Arrays.toString(no3));
	}
	
	public void start() {
		System.out.println("*******************************************");
		System.out.println("                   ��ӭ�������ֲ�Ʊϵͳ                        ");
		System.out.println("         ��0-32֮��ѡ��5���������һע��Ʊ  \n\t��ѡ��������ע     ");
		System.out.println("*******************************************");
		String agin;
		do {
			System.out.println("��ѡ����:\t1.��ѡ\t2.��ѡ           ");
			Scanner sc = new Scanner(System.in);
			int choose = sc.nextInt();
			switch (choose) {
			case 1:
				pcLottery();//��ѡ
				break;
			case 2:
				opLottery();//��ѡ
				break;
			default:
				System.out.println("����������������룡");
				start();
				break;
			}
			drawLotty();
			getLottery();
			clean();
			System.out.println("�Ƿ�����һ��? y/n");
			agin = sc.next();
		}while(agin.equals("y"));
	}
	//���
	public void clean() {
		Arrays.fill(no1, null);
		Arrays.fill(no2, null);
		Arrays.fill(no3, null);
	}
}






















