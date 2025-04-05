package com.exam.dao;

import com.exam.pojo.User;

public class UserDao {
	public User queryUser(String account,String pwd) {
		if(account.endsWith("admin")&&pwd.equals("123456")) {
			User u=new User();
			u.setAccount(account);
			u.setPwd(pwd);
			u.setType(1);
			return u;
		}else if(account.endsWith("zhang")&&pwd.equals("123456")){
			User u=new User();
			u.setAccount(account);
			u.setPwd(pwd);
			u.setType(0);
			return u;
		}else {
			return null;
		}
	}
}
