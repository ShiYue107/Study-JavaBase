package com.zfg.Mapper;

import java.util.List;

import com.zfg.Model.Dept;

public interface DeptMapper {

	//查询方法
	public List<Dept> queryAll();
	
	//添加方法
	public int addDept(Dept dt);
	
	//修改方法
	public int updateDept(Dept dt);
	
	//删除方法
	public int delDept(int id);
}
