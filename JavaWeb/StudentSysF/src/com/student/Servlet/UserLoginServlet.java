package com.student.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.student.Dao.UserDao;
import com.student.Model.User;
@WebServlet("/userLogin")
public class UserLoginServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//设置编码集
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		//接收数据
		String name=req.getParameter("name");
		String password=req.getParameter("password");
		//调用相关方法
		User user=new UserDao().userLogin(name, password);
		if(user!=null) {
			HttpSession session =req.getSession();
			session.setAttribute("user", user);
			resp.sendRedirect("showStudent");
		}else {
			req.setAttribute("msg", "账号或密码");
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		}
	}
}
