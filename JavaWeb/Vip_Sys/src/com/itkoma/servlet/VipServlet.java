package com.itkoma.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itkoma.dao.VipDao;
import com.itkoma.model.Vip;
@WebServlet("/queryAllVip")
public class VipServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//设置编码集
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		
		String name = req.getParameter("name");
		String gender = req.getParameter("gender");
		//调用查询方法
		List<Vip> list = new VipDao().queryAll(name,gender);
		
		req.setAttribute("list", list);
		
		req.getRequestDispatcher("index.jsp").forward(req, resp);
		
	}
}
