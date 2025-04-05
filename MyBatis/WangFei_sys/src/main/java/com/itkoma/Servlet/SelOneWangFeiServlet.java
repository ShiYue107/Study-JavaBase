package com.itkoma.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.itkoma.Dao.WangFMapper;
import com.itkoma.Model.WangFei;
import com.itkoma.Utils.SqlSessionBase;
@WebServlet("/selOneWangFei")
public class SelOneWangFeiServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=utf-8");
		
		//获取SqlSession、WangFMapper
		SqlSession sqlSession = SqlSessionBase.getSqlSession();
		WangFMapper wfMap = sqlSession.getMapper(WangFMapper.class);
		
		//获取要修改的数据
		int id = Integer.parseInt(req.getParameter("id"));
		WangFei wf = wfMap.selOneById(id);
		
		//将查询到的数据添加到属性中
		req.setAttribute("WangFei", wf);
		
		req.getRequestDispatcher("updateWangFei.jsp").forward(req, resp);
		
	}

}
