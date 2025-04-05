package com.dbd.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dbd.dao.UserDao;
import com.dbd.pojo.User;

/**
* @author IT_Koma
* @date 2021年5月24日 下午10:31:26
* @version 1.0
* 类说明
*/
@WebServlet("/reg")
public class RegServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//设置编码集
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String phone = req.getParameter("phone");
		String mail = req.getParameter("mail");
		Date date = new Date();
		
		User user = new User(0, username, password, phone, mail, date);
		int result = UserDao.addUser(user);
		
		if (result>0) {
			req.getRequestDispatcher("index.jsp").forward(req, resp);
		} else {
			req.getRequestDispatcher("reg.jsp").forward(req, resp);
		}
	}
}
