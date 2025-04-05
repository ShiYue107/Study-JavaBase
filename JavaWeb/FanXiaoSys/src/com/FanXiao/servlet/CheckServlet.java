package com.FanXiao.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.FanXiao.dao.CheckInfoDao;
import com.FanXiao.pojo.CheckInfo;
@WebServlet("/queryAll")
public class CheckServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//设置编码集
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		
		//接收查询到的数据
		List<CheckInfo> list = new CheckInfoDao().queryAll();
		//将接收到的数据添加到属性中
		req.setAttribute("list", list);
		//请求转发
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}

}
