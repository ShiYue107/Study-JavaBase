package com.zf.Mapper;

import java.util.List;

import com.zf.Model.User;

public interface UserMapper {

	//��ѯ���з���
	public List<User> queryAllUser();
	
	//��ӷ���
	public int addUser(User user);
	
	//�޸ķ���
	public int updateUser(User user);
	
	//ͨ��idɾ������
	public int delUser(int id);
}
