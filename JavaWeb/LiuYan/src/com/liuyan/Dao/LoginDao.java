package com.liuyan.Dao;

import com.liuyan.model.Login;

public interface LoginDao {
	//�û����е�¼
	public Login userLogin(String name,String password);
	//�û�����ע��
	public boolean UserRegister(Login login);
	//�û�����ע��
	public Boolean deleteUser(String name);
}
