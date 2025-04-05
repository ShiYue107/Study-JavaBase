package com.liuyan.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.liuyan.Dao.UserLoginImpl;
import com.liuyan.model.Login;
@WebServlet("/userRegister")
public class UserRegiusterServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 设置编码集
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		//接收页面值
		String name = req.getParameter("userName");
		String password = req.getParameter("password");
		int userType = Integer.parseInt(req.getParameter("userType"));
		//创建login对象
		Login login = new Login(0,name,password,userType);
		//调用daoImpl中的注册方法
		boolean flag = new UserLoginImpl().UserRegister(login);
		//判断有没有注册成功
		if(flag) {
			req.setAttribute("msg", "注册成功！");
			req.getRequestDispatcher("UserLogin.jsp").forward(req, resp);
		}else {
			req.setAttribute("msg", "注册失败！");
			req.getRequestDispatcher("error.jsp").forward(req, resp);
		}
	}

}
