package com.zf.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInfoSys {
	
	Scanner sc = new Scanner(System.in);
	List list = new ArrayList();

	// ����û�
	public List addUser() {
		System.out.println("�������û��ı�ţ�");
		String no = sc.next();
		System.out.println("�������û���������");
		String name = sc.next();
		System.out.println("�������û����Ա�");
		String sex = sc.next();
		list.add(new UserInfo(no, name, sex).toString());
		if (list.size() > 0) {
			System.out.println("��ӳɹ���");
		} else {
			System.out.println("���ʧ�ܣ���");
		}
		showInfo();
		return list;
	}

	// ɾ���û�
	public List deleUser() {
		UserInfo uo=new UserInfo();
		System.out.println("������Ҫɾ���û���������");
		String name=sc.next();
		for (int i = 0; i < list.size(); i++) {
			if (uo.getNaem().equals(name)) {
				this.list.remove(i);
				System.out.println("ɾ���ɹ�");
			}else {
				System.out.println("ɾ��ʧ��");
			}
		}
		return list;
	}

	// ��ѯ�û�
	public void celeUser() {
		int num;
		System.out.println("��1������Ų�ѯ ��2����������ѯ ��3�����Ա��ѯ");
		num = sc.nextInt();
		if (num==1) {
			System.out.println("�������ţ�");
			String no=sc.next();
			for (int i = 0; i < list.size(); i++) {
				UserInfo userInfo=(UserInfo)list.get(i);
				if (userInfo.getNo().equals(no)) {
					System.out.println("��ѯ�����û���Ϣ��"+userInfo.toString());
					break;
				}
			}
		}else if (num==2) {
			System.out.println("������������");
			String name=sc.next();
			List uiList =new ArrayList();
			for (int i = 0; i < list.size(); i++) {
				UserInfo userInfo=(UserInfo)list.get(i);
				if (userInfo.getNaem().equals(name)) {
					uiList.add(userInfo);
				}
			}
			System.out.println("��ѯ�����û���Ϣ��"+uiList);
		}else if (num==3) {
			System.out.println("�������Ա�");
			String sex=sc.next();
			List uiList=new ArrayList();
			for (int i = 0; i < list.size(); i++) {
				UserInfo userInfo=(UserInfo)list.get(i);
				if (userInfo.getSex().equals(sex)) {
					uiList.add(userInfo);
				}
			}
			System.out.println("��ѯ�����û���Ϣ��"+uiList);
		}
	}

	// ��ʾ��ǰϵͳ�����û�
	public void showInfo() {
		System.out.println("��ǰϵͳ�����û���" + list);
	}
}
