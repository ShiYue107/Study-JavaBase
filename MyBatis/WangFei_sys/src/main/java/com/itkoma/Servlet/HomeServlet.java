package com.itkoma.Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.itkoma.Dao.WangFMapper;
import com.itkoma.Model.WangFei;
import com.itkoma.Utils.SqlSessionBase;
@WebServlet("/allInfo")
public class HomeServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		SqlSession sqlSession = SqlSessionBase.getSqlSession();
    	WangFMapper wfMap = sqlSession.getMapper(WangFMapper.class);
    	
    	List<WangFei> list = wfMap.queryAll();
    	for (WangFei wangFei : list) {
			System.out.println(wangFei);
		}
    	req.setAttribute("list", list);
    	req.getRequestDispatcher("index.jsp").forward(req, resp);
	}

}
