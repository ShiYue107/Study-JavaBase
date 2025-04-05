package com.liuyan.Dao;

import com.liuyan.model.Login;

public interface LoginDao {
	//用户进行登录
	public Login userLogin(String name,String password);
	//用户进行注册
	public boolean UserRegister(Login login);
	//用户进行注销
	public Boolean deleteUser(String name);
}
