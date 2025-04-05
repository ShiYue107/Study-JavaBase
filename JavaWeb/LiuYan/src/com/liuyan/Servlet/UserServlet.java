package com.liuyan.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.liuyan.Dao.LoginDao;
import com.liuyan.Dao.UserLoginImpl;
import com.liuyan.model.Login;

@WebServlet("/userLogin")
public class UserServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//设置编码集
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		//接收值
		String name = req.getParameter("userName");
		String password = req.getParameter("password");
		//调用登录方法
		LoginDao dao = new UserLoginImpl();
		Login login = dao.userLogin(name, password);
		//判断值
		if(login!=null) {
			HttpSession session = req.getSession();
			session.setAttribute("login", login);
			//页面的跳转：重定向方式进行页面的跳转
			resp.sendRedirect("showMsg");
		}else {
			req.setAttribute("msg", "用户名或密码错误！");
			req.getRequestDispatcher("error.jsp").forward(req, resp);
		}
	}

}
