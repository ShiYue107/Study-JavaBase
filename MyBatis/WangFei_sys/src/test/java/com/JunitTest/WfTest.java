package com.JunitTest;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.itkoma.Dao.WangFMapper;
import com.itkoma.Model.WangFei;

public class WfTest {

	@Test
	public void updateTest() {
		SqlSession sqlSession = SqlSessionBase.getSqlSession();
		WangFMapper wfMap = sqlSession.getMapper(WangFMapper.class);
		int id = 3;
		WangFei wf =wfMap.selOneById(id);
		System.out.println(wf);
		WangFei updateWf = new WangFei();
		updateWf.setId(wf.getId());
		updateWf.setNumber(wf.getNumber());
		updateWf.setPassword(wf.getPassword());
		updateWf.setBalance(987.97);
		updateWf.setDescs("这是修改后的数据");
		
		int result = wfMap.updateWangFei(updateWf);
		if (result > 0) {
			System.out.println("数据修改成功！");
		}
		sqlSession.commit();
		sqlSession.close();
	}
	
	@Test
	public void deleteTest() {
		SqlSession sqlSession = SqlSessionBase.getSqlSession();
		WangFMapper wfMap = sqlSession.getMapper(WangFMapper.class);
		int result = wfMap.delWangFei(2);
		if (result > 0) {
			System.out.println("数据删除成功！");
		}
		sqlSession.commit();
		sqlSession.close();
	}
	
	@Test
	public void insertTest() {
		SqlSession sqlSession = SqlSessionBase.getSqlSession();
		WangFMapper wfMap = sqlSession.getMapper(WangFMapper.class);
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("number", "hfsauhusa");
		map.put("password", "2654155");
		map.put("balance", 253.22);
		map.put("descs", "gjhgjhgf");
		int result = wfMap.addWangFei(map);
		if (result > 0) {
			System.out.println("数据添加成功！");
		}
		sqlSession.commit();
		sqlSession.close();
	}
	@Test
	public void selTest() {
		SqlSession sqlSession = SqlSessionBase.getSqlSession();
		WangFMapper wfMap = sqlSession.getMapper(WangFMapper.class);
		
		List<WangFei> list = wfMap.queryAll();
		
		for (WangFei wangFei : list) {
			System.out.println(wangFei);
		}
		sqlSession.close();
	}
}
