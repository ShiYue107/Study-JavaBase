package com.itkoma.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.itkoma.Dao.WangFMapper;
import com.itkoma.Utils.SqlSessionBase;
@WebServlet("/delWangFei")
public class DeleteWangFeiServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=utf-8");
		SqlSession sqlSession = SqlSessionBase.getSqlSession();
		WangFMapper wfMap = sqlSession.getMapper(WangFMapper.class);
		int id = Integer.parseInt(req.getParameter("id"));
		
		int result = wfMap.delWangFei(id);
		sqlSession.commit();
		sqlSession.close();
		if (result > 0) {
			req.getRequestDispatcher("allInfo").forward(req, resp);
		}else {
			req.getRequestDispatcher("error.jsp").forward(req, resp);
		}
	}

}
