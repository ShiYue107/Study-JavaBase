package com.zf.Mapper;

import java.util.List;

import com.zf.Model.Role;

public interface RoleMapper {
	
	//查询所有Role
	public List<Role> queryAllRole();
	
	//查询所有Role
	public List<Role> queryAllRoleById(int id);
}	
