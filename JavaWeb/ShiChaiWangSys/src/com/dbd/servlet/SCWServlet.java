package com.dbd.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dbd.Utils.DBUtils;
import com.dbd.dao.UserDao;
import com.dbd.pojo.User;

/**
* @author IT_Koma
* @date 2021年3月22日 下午4:43:04
* @version 1.0
* 类说明
*/
@WebServlet("/home")
public class SCWServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//设置编码集
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		
		String userName = req.getParameter("userName");
		String password = req.getParameter("password");
		
		User user = UserDao.loginOne(userName, password);
		req.setAttribute("user", user);
		if (user != null) {
			req.getRequestDispatcher("main.jsp").forward(req, resp);
		} else {
			req.getRequestDispatcher("index.jsp").forward(req, resp);
		}
	}
}
