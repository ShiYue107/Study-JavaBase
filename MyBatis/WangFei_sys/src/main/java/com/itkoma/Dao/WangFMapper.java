package com.itkoma.Dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.itkoma.Model.WangFei;


public interface WangFMapper {

	//查询方法
	public List<WangFei> queryAll();
		
	//修改方法
	public int updateWangFei(WangFei wf);
		
	//新增方法
	public int addWangFei(HashMap<String, Object> map);
	
	//通过id删除方法
	public int delWangFei(int id);
	
	//通过id查询单条数据
	public WangFei selOneById(int id);
}
