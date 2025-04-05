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
@WebServlet("/updateWangFei")
public class UpdateWangFeiServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=utf-8");
		
		//获取SqlSession、WangFMapper
		SqlSession sqlSession = SqlSessionBase.getSqlSession();
		WangFMapper wfMap = sqlSession.getMapper(WangFMapper.class);
		
		//接收数据
		int id = Integer.parseInt(req.getParameter("id"));
		String number = req.getParameter("number");
		String password = req.getParameter("password");
		double balance = Double.parseDouble(req.getParameter("balance"));
		String descs = req.getParameter("descs");
		
		WangFei wf = new WangFei();
		wf.setId(id);
		wf.setNumber(number);
		wf.setPassword(password);
		wf.setBalance(balance);
		wf.setDescs(descs);
		int result = wfMap.updateWangFei(wf);
		sqlSession.commit();
		sqlSession.close();
		if (result > 0) {
			req.getRequestDispatcher("allInfo").forward(req, resp);
		}else {
			req.getRequestDispatcher("error.jsp").forward(req, resp);
		}
	}

}
