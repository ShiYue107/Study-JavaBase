package com.zfg.Mapper;

import java.util.List;

import com.zfg.Model.Privilege;
import com.zfg.Model.User;

public interface UserMapper {

	//��ѯ���з���
	public List<User> queryAllUser();
	
	//��ӷ���
	public int addUser(User user);
	
	//�޸ķ���
	public int updateUser(User user);
	
	//ͨ��idɾ������
	public int delUser(int id);
	
	//��ѯ�û���Ȩ��
	public List<User> selAllUserAndPri();
}
