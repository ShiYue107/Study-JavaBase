package com.zf.test;

public class caiNums {
	
	public static int[] arrayToString() {
		//������̬����
		int [] arr={12,13,15,20,22};
		return arr;
	}
	
	public static StringBuffer arrToString2(int[] arr) {
		StringBuffer sb=new StringBuffer();
		//��sb�������߿�
		sb.append("[");
		for (int i = 0; i < arr.length; i++) {
			//���������������һ������sb�����Ԫ�غͶ���
			if (i!=arr.length-1) {
				sb.append(arr[i]).append(",");
			}else {
				//�������������һ����ֱ����sb�����Ԫ��
				sb.append(arr[i]);
			}
		}
		//��sb�������߿�
		sb.append("]");
		
		return sb;
	}
	public static void main(String[] args) {
		StringBuffer sb = caiNums.arrToString2(caiNums.arrayToString());
		System.out.println(sb);
	}
}
