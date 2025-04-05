package com.dbd.servlet;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.dbd.dao.AdminDao;
import com.dbd.dao.UserDao;
import com.dbd.pojo.Admin;
import com.dbd.pojo.User;


/**
* @author IT_Koma
* @date 2021年5月24日 下午11:07:27
* @version 1.0
* 类说明
*/
@WebServlet("/adminLogin")
public class AdminServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//设置编码集
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		
		String userName = req.getParameter("userName");
		String password = req.getParameter("password");
		
		Admin admin = AdminDao.adminLogin(userName, password);
		List<User> list = UserDao.queryAll();
		req.setAttribute("admin", admin);
		req.setAttribute("list", list);
		if (admin != null) {
			req.getRequestDispatcher("user.jsp").forward(req, resp);
		} else {
			req.getRequestDispatcher("adminLogin.jsp").forward(req, resp);
		}
	}

}
