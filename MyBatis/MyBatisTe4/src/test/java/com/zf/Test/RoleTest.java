package com.zf.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.zf.Mapper.RoleMapper;
import com.zf.Model.Role;

public class RoleTest {
	//查询测试1
	@Test
	public void selRPrivilege() {
		String resource = "mybatis-config.xml";
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			SqlSession sqlSession = sqlSessionFactory.openSession();
			RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
			
			int [] arr= {1,2,3,4,5,6};
			
			List<Role> list = roleMapper.queryAllByIds(arr);
			
			for (Role role : list) {
				System.out.println(role);
			}
			
			sqlSession.close();
			inputStream.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//查询测试2
	@Test
	public void selRPrivilege1() {
		String resource = "mybatis-config.xml";
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			SqlSession sqlSession = sqlSessionFactory.openSession();
			RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
			
			int [] ids= {1,2,3,4,5,6};
			int enabled = 2;
			
			List<Role> list = roleMapper.queryAllByIdsRoEnab(ids,enabled);
			
			for (Role role : list) {
				System.out.println(role);
			}
			
			sqlSession.close();
			inputStream.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//测试批量添加
	@Test
	public void addRoleTest() {
		String resource = "mybatis-config.xml";
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			SqlSession sqlSession = sqlSessionFactory.openSession();
			RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
			
			List<Role> list = new ArrayList<Role>();
			for (int i = 0; i < 2; i++) {
				Role re = new Role();
				re.setRole_name("zhangsan"+i);
				re.setEnabled(1);
				list.add(re);
			}
			
			int result = roleMapper.addRole(list);
			sqlSession.commit();
			sqlSession.close();
			inputStream.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//批量修改测试
	@Test
	public void updateRoleTest() {
		String resource = "mybatis-config.xml";
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			SqlSession sqlSession = sqlSessionFactory.openSession();
			RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
			
			HashMap<String, Object> updateMap = new HashMap<String, Object>();
			updateMap.put("id", 23);
			updateMap.put("role_name", "扫地僧");
			updateMap.put("enabled", 2);
			int result = roleMapper.updateRoleByMap(updateMap);
			sqlSession.commit();
			sqlSession.close();
			inputStream.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
