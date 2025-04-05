package com.zf.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.zf.Mapper.DeptMapper;
import com.zf.Model.Dept;

public class DeptTest {
	//查询
	@Test
	public void selDept() {
		String resource = "mybatis-config.xml";
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			SqlSession sqlSession = sqlSessionFactory.openSession();
			DeptMapper deptMapper = sqlSession.getMapper(DeptMapper.class);
			
			List<Dept> list = deptMapper.queryAll();
			
			for (Dept dept : list) {
				System.out.println(dept);
			}
			
			sqlSession.close();
			inputStream.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//添加
	@Test
	public void addDept() {
		String resource = "mybatis-config.xml";
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			SqlSession sqlSession = sqlSessionFactory.openSession();
			DeptMapper deptMapper = sqlSession.getMapper(DeptMapper.class);
			
			Dept dt = new Dept();
			dt.setId(0);
			dt.setDept_name("杠精部");
			int result = deptMapper.addDept(dt);
			if (result > 0) {
				System.out.println("数据添加成功！");
			}
			sqlSession.commit();
			sqlSession.close();
			inputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//修改
	@Test
	public void updatDept() {
		String resource = "mybatis-config.xml";
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			SqlSession sqlSession = sqlSessionFactory.openSession();
			DeptMapper deptMapper = sqlSession.getMapper(DeptMapper.class);
			Dept dt = new Dept();
			dt.setId(2);
			dt.setDept_name("̧卫生部");
			int result = deptMapper.updateDept(dt);
			if (result >0 ) {
				System.out.println("数据修改成功！");
			}
			sqlSession.commit();
			sqlSession.close();
			inputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//删除
	@Test
	public void delDept() {
		String resource = "mybatis-config.xml";
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			SqlSession sqlSession = sqlSessionFactory.openSession();
			DeptMapper deptMapper = sqlSession.getMapper(DeptMapper.class);
			
			int result = deptMapper.delDept(9);
			if (result > 0 ) {
				System.out.println("数据删除成功！");
			}
			sqlSession.commit();
			sqlSession.close();
			inputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
