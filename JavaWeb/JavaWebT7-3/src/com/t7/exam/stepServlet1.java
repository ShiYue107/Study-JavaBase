package com.t7.exam;



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.*;

/**
 * Servlet implementation class stepServlet1
 */
@WebServlet("/stepServlet1")
public class stepServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public stepServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		PrintWriter out=response.getWriter();
		out.append("<from name='form1' method='post'action='stepServlet2'>");
		out.append("在线用户注册向导--基本信息填写<br>");
		out.append("用户名：<input type='text'name='txtUserName'><br>");
		out.append("密码：<input type='text'name='txtUserPwd'><br>");
		out.append("邮箱：<input type='text'name='txte-mail'><br>");
		out.append("用户名：<p><input type='submit'name='Submit' value='下一步'></p></form>");
	}

}
