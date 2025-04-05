package com.zf.Mapper;

import java.util.List;

import com.zf.Model.User;

public interface UserMapper {

	//查询所有方法
	public List<User> queryAllUser();
	
	//添加方法
	public int addUser(User user);
	
	//修改方法
	public int updateUser(User user);
	
	//通过id删除方法
	public int delUser(int id);
}
