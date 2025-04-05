package com.exam.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.exam.dao.UserDao;
import com.exam.pojo.User;

@WebServlet("/UserMangerServlet")
public class UserMangerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UserMangerServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String account =request.getParameter("account");
		String pwd=request.getParameter("password");
		UserDao uD=new UserDao();
		User u=uD.queryUser(account, pwd);
		if(u==null) {
			String msg="对不起，账号或密码不正确";
			request.setAttribute("msg", msg);
			request.getRequestDispatcher("login.jsp").forward(request,	response);
		}else {
			HttpSession session =request.getSession();
			session.setAttribute("account", u.getAccount());
			session.setAttribute("type", u.getType());
			response.sendRedirect("query.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
