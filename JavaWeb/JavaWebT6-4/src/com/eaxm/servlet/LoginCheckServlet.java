package com.eaxm.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eaxm.data.User;
import com.eaxm.service.UserCheck;

/**
 * Servlet implementation class LoginCheckServlet
 */
@WebServlet("/LoginCheckServlet")
public class LoginCheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("GBK");
		String name=request.getParameter("name");
		String pwd=request.getParameter("pwd");
		User user=new User();
		user.setName(name);
		user.setPwd(pwd);
		UserCheck uc=new UserCheck();
		if(uc.validate(user)) {
			request.setAttribute("user", user);
			RequestDispatcher dis=request.getRequestDispatcher("LoginSuccess.jsp");
			dis.forward(request, response);
		}else {
			response.sendRedirect("LoginCheck.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(request, response);
	}

}
