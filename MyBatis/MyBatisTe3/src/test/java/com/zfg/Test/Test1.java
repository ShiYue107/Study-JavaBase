package com.zfg.Test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.zfg.Mapper.UserMapper;
import com.zfg.Model.Privilege;
import com.zfg.Model.Role;
import com.zfg.Model.User;

public class Test1 {
	@Test
	public void testSelectAllUserAndRoleAndPrivileges() {
		SqlSession sqlSession = getSqlSession();
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			List<User> userList = userMapper.selAllUserAndPri();
			System.out.println("�û�����"+userList.size());
			System.out.println("======================");
			for (User user : userList) {
				System.out.println("�û�����"+user.getUser_name());
				for (Role role : user.getRoleList()) {
					System.out.println("��ɫ����"+role.getRole_name());
					for (Privilege privilege : role.getPrivilege()) {
						System.out.println("Ȩ������"+privilege.getPrivilege_name());
					}
				}
				System.out.println("======================");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
	}

	private SqlSession getSqlSession() {
		// TODO Auto-generated method stub
		return null;
	}
}
