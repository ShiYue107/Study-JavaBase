package com.zf.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInfoSys {
	
	Scanner sc = new Scanner(System.in);
	List list = new ArrayList();

	// 添加用户
	public List addUser() {
		System.out.println("请输入用户的编号：");
		String no = sc.next();
		System.out.println("请输入用户的姓名：");
		String name = sc.next();
		System.out.println("请输入用户的性别：");
		String sex = sc.next();
		list.add(new UserInfo(no, name, sex).toString());
		if (list.size() > 0) {
			System.out.println("添加成功！");
		} else {
			System.out.println("添加失败！！");
		}
		showInfo();
		return list;
	}

	// 删除用户
	public List deleUser() {
		UserInfo uo=new UserInfo();
		System.out.println("请输入要删除用户的姓名：");
		String name=sc.next();
		for (int i = 0; i < list.size(); i++) {
			if (uo.getNaem().equals(name)) {
				this.list.remove(i);
				System.out.println("删除成功");
			}else {
				System.out.println("删除失败");
			}
		}
		return list;
	}

	// 查询用户
	public void celeUser() {
		int num;
		System.out.println("【1】按编号查询 【2】按姓名查询 【3】按性别查询");
		num = sc.nextInt();
		if (num==1) {
			System.out.println("请输入编号：");
			String no=sc.next();
			for (int i = 0; i < list.size(); i++) {
				UserInfo userInfo=(UserInfo)list.get(i);
				if (userInfo.getNo().equals(no)) {
					System.out.println("查询到的用户信息："+userInfo.toString());
					break;
				}
			}
		}else if (num==2) {
			System.out.println("请输入姓名：");
			String name=sc.next();
			List uiList =new ArrayList();
			for (int i = 0; i < list.size(); i++) {
				UserInfo userInfo=(UserInfo)list.get(i);
				if (userInfo.getNaem().equals(name)) {
					uiList.add(userInfo);
				}
			}
			System.out.println("查询到的用户信息："+uiList);
		}else if (num==3) {
			System.out.println("请输入性别：");
			String sex=sc.next();
			List uiList=new ArrayList();
			for (int i = 0; i < list.size(); i++) {
				UserInfo userInfo=(UserInfo)list.get(i);
				if (userInfo.getSex().equals(sex)) {
					uiList.add(userInfo);
				}
			}
			System.out.println("查询到的用户信息："+uiList);
		}
	}

	// 显示当前系统所有用户
	public void showInfo() {
		System.out.println("当前系统所有用户：" + list);
	}
}
