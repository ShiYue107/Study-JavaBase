package com.zf.Mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.zf.Model.Role;

public interface RoleMapper {
	
	//查询所有Role
	public List<Role> queryAllRole();
	
	//查询所有Role
	public List<Role> queryAllRoleById(int id);
	
	//查询RoleByRole
	public List<Role> queryAllByRole(Role re);
	
	//通过所给的id查询Role
	public List<Role> queryAllByIds(int [] arr);
	
	//通过id或给定的标记查询Role
	public List<Role> queryAllByIdsRoEnab(@Param("ids")int [] ids,
			@Param("enabled")int enabled);
	
	//批量增加数据
	public int addRole(List<Role> list);
	
	//通过map批量修改
	public int updateRoleByMap(@Param("updateMap")HashMap<String, Object> reMap);
}	
