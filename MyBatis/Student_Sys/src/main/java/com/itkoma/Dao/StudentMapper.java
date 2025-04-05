package com.itkoma.Dao;

import java.util.List;

import com.itkoma.Model.Student;

public interface StudentMapper {

	//查询所有学生信息
	public List<Student> queryAllStu();
	
}
