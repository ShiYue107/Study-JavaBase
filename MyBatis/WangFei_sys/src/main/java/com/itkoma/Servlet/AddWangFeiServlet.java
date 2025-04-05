package com.itkoma.Servlet;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.itkoma.Dao.WangFMapper;
import com.itkoma.Model.WangFei;
import com.itkoma.Utils.SqlSessionBase;
@WebServlet("/addWF")
public class AddWangFeiServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=utf-8");
		SqlSession sqlSession = SqlSessionBase.getSqlSession();
		WangFMapper wfMap = sqlSession.getMapper(WangFMapper.class);
		
		//接收参数
		String number = req.getParameter("number");
		String password = req.getParameter("password");
		double balance = Double.parseDouble(req.getParameter("balance"));
		String descs = req.getParameter("descs");
		//创建对象Map
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("number", number);
		map.put("password", password);
		map.put("balance", balance);
		map.put("descs", descs);
		//调用新增方法
		int result = wfMap.addWangFei(map);
		sqlSession.commit();
		sqlSession.close();
		if (result > 0) {
			req.getRequestDispatcher("allInfo").forward(req, resp);
		}else {
			req.getRequestDispatcher("addWangFei.jsp").forward(req, resp);
		}
	}

}
