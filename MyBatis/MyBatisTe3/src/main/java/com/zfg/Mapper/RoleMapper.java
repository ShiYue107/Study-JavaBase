package com.zfg.Mapper;

import java.util.List;

import com.zfg.Model.Role;

public interface RoleMapper {
	
	//��ѯ����
	public List<Role> queryAllRole();
	
	//ͨ��id��ѯ
	public List<Role> queryAllRoleById(int id);
}	
