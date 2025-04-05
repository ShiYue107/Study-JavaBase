package TestTwo;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//���ֲ�Ʊ����ϵͳ
public class Lottery {
	//��ѡ����
	int [][] machineSelectionNodes = new int[5][5];
	//��ѡ����
	int [][] optionalSelectionNodes = new int[5][5];
	//�н�����
	int [] awardNums = new int [5];
	//���Ƚ�
	String[] no3 = new String[5];
	//���Ƚ�
	String[] no2 = new String[5];
	//һ�Ƚ�
	String[] no1 = new String[5];
			
	//��ѡ����
	public void optionalSelection() {
		System.out.println("��ѡ:");
		System.out.println("������Ҫ��ע:(���5ע)");
		Scanner sc = new Scanner(System.in);
		int howNum = sc.nextInt();
		optionalSelectionNodes = new int[howNum][5];
		//��������һά���飨����ÿһע��Ʊ��
		for (int i = 0; i < optionalSelectionNodes.length; i++) {
			//������ǰһά���������Ԫ�أ�ÿһע��Ʊ�еľ������֣�
			for (int j = 0; j < optionalSelectionNodes[i].length; j++) {
				/*
				 * while(true) { //�ж����ɵ�������Ƿ��ڵ�ǰ�����д��� if(container(machineSelectionNodes[i],
				 * value)) { value = ran.nextInt(33); }else { break; } }
				 */
				System.out.println("�������"+(i+1)+"ע�ĵ�"+(j+1)+"������:");
				int value = sc.nextInt();
				optionalSelectionNodes[i][j] = value;
			}
			Arrays.sort(optionalSelectionNodes[i]);//�������С��������
		}
	}
	
	//��ѡ����----->5עһ�����������5ע��Ʊ�����ɵ�ÿһע��Ʊ�е����ֲ����ظ�     0-32֮������
	public void machineSelection() {
		System.out.println("��ѡ:");
		Random ran = new Random();
		//��������һά���飨����ÿһע��Ʊ��
		for (int i = 0; i < machineSelectionNodes.length; i++) {
			//������ǰһά���������Ԫ�أ�ÿһע��Ʊ�еľ������֣�
			for (int j = 0; j < machineSelectionNodes[i].length; j++) {
				//�����������
				int value = ran.nextInt(33);
				while(true) {
					//�ж����ɵ�������Ƿ��ڵ�ǰ�����д���
					if(container(machineSelectionNodes[i], value)) {
						value = ran.nextInt(33);
					}else {
						break;
					}
				}
				//��ֵ  һ��һ������ĸ�ֵ      [0][0]   [0][1]   [0][2]
				machineSelectionNodes[i][j] = value;
			}
			Arrays.sort(machineSelectionNodes[i]);//�������С��������
		}
	}
	//��֤һ�����������Ƿ����һ����ֵ
	public boolean container(int[]array,int value) {
		boolean flag = false;//Ĭ������Ϊ������
		for (int i = 0; i < array.length; i++) {
			if(array[i]==value) {
				flag = true;
				break;
			}
		}
		return flag;
	}
	//ҡ��
	public void drawLottery() {
		Random ran = new Random();
		for (int i = 0; i < awardNums.length; i++) {
			int value = ran.nextInt(33);
			while(true) {
				if(container(awardNums, value)) {
					value = ran.nextInt(33);
				}else {
					break;
				}
			}
			awardNums[i] = value;
		}
		Arrays.sort(awardNums);
	}
	//����
	public void getLottery() {
		//����ѡ�Ľ�
		for (int i = 0; i < machineSelectionNodes.length; i++) {//����ÿһע��Ʊ
			int count = 0;//��¼��������
			for (int j = 0; j < awardNums.length; j++) {//����5���н�����
				if(container(machineSelectionNodes[i], awardNums[j])) {
					count++;
				}else {
					continue;
				}
			}
			switch (count) {
			case 3:
				no3[i] = Arrays.toString(machineSelectionNodes[i]);
				break;
			case 4:
				no2[i] = Arrays.toString(machineSelectionNodes[i]);
				break;
			case 5:
				no1[i] = Arrays.toString(machineSelectionNodes[i]);
				break;
			default:
				break;
			}
		}
		//����ѡ�Ľ�
		for (int i = 0; i < optionalSelectionNodes.length; i++) {//����ÿһע��Ʊ
			int count = 0;//��¼��������
			for (int j = 0; j < awardNums.length; j++) {//����5���н�����
				if(container(optionalSelectionNodes[i], awardNums[j])) {
					count++;
				}else {
					continue;
				}
			}
			switch (count) {
			case 3:
				no3[i] = Arrays.toString(optionalSelectionNodes[i]);
				break;
			case 4:
				no2[i] = Arrays.toString(optionalSelectionNodes[i]);
				break;
			case 5:
				no1[i] = Arrays.toString(optionalSelectionNodes[i]);
				break;
			default:
				break;
			}
		}
		showResult();//չʾ���β��ŵĹ���Ϳ�����Ϣ
	}
	//չʾ��Ʊ��Ϣ
	public void showResult() {
		System.out.println("��ѡ����Ϊ:");
		for (int i = 0; i < machineSelectionNodes.length; i++) {
			System.out.println(Arrays.toString(machineSelectionNodes[i]));
		}
		System.out.println("��ѡ����Ϊ:");
		for (int i = 0; i < optionalSelectionNodes.length; i++) {
			System.out.println(Arrays.toString(optionalSelectionNodes[i]));
		}
		System.out.println("��������:");
		System.out.println(Arrays.toString(awardNums));
		System.out.println("һ�Ƚ�����:");
		System.out.println(Arrays.toString(no1));
		System.out.println("���Ƚ�����:");
		System.out.println(Arrays.toString(no2));
		System.out.println("���Ƚ�����:");
		System.out.println(Arrays.toString(no3));
	}
	//���г���
	public void start() {
		System.out.println("*******************************************");
		System.out.println("                    ��ӭ�������ֲ�Ʊϵͳ                        ");
		System.out.println("                ��0-32֮��ѡ��5���������һע��Ʊ       ");
		System.out.println("********************************************");
		String agin;
		do {
			System.out.println("��ѡ����:      1.��ѡ              2.��ѡ           ");
			Scanner sc = new Scanner(System.in);
			int choose = sc.nextInt();
			switch (choose) {
			case 1:
				machineSelection();//��ѡ
				break;
			case 2:
				optionalSelection();//��ѡ
				break;
			default:
				System.out.println("�������");
				break;
			}
			drawLottery();//ҡ��
			getLottery();//����
			clean();//����н���Ϣ
			System.out.println("�Ƿ�����һ��? y/n");
			agin = sc.next();
		}while(agin.equals("y"));
	}
	//����н���Ϣ
	public void clean() {
		Arrays.fill(no1, null);
		Arrays.fill(no2, null);
		Arrays.fill(no3, null);
	}
}
