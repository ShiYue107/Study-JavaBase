package com.eryi;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
				Scanner in=new Scanner(System.in);
				int n=in.nextInt();
				int[] arr=new int[999];
				//����
				int count =0;
				//ѭ��������
				for(int i=2;i<n;i++){
					//Ĭ����������
					int prime=1;
					//ѭ���ж��Ƿ���������
					for(int j=2;j<i;j++){
						//�ж��Ƿ�����
						if(i%j==0){
							//������������
							prime=0;
							break;
						}
					}
					//1Ϊ����
					if(prime==1){
						//�洢����
						arr[count]=i;
						//������1
						count++;
					}
				}
				System.out.println(count);
				for(int i=0;i<count;i++){
					System.out.print(arr[i]+" ");
				}
	}
}
