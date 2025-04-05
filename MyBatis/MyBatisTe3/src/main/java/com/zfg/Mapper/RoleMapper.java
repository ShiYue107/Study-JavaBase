package com.zfg.Mapper;

import java.util.List;

import com.zfg.Model.Role;

public interface RoleMapper {
	
	//查询所有
	public List<Role> queryAllRole();
	
	//通过id查询
	public List<Role> queryAllRoleById(int id);
}	
