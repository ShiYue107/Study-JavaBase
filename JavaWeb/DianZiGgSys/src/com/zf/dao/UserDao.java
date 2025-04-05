package com.zf.dao;

import com.zf.pojo.User;

public interface UserDao {

	public static final int FEMALE = 1;//代表女性
	public static final int MALE = 2;//代表男性
	public User findUser(String uName);//根据用户名查找论坛用户
	public User findUser(int uId);//根据用户ID查找论坛用户
	public int addUser(User user);//增加论坛用户，返回增加个数
	public int updateUser(User user);//修改论坛用户的信息，返回修改个数
	
}
