package com.zfg.Mapper;

import java.util.List;

import com.zfg.Model.Dept;

public interface DeptMapper {

	//��ѯ����
	public List<Dept> queryAll();
	
	//��ӷ���
	public int addDept(Dept dt);
	
	//�޸ķ���
	public int updateDept(Dept dt);
	
	//ɾ������
	public int delDept(int id);
}
