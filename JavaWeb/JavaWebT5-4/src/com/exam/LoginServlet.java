package com.exam;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String userName=request.getParameter("username");
		String pwd=request.getParameter("password");
		if(userName==null||pwd==null||"".equals(userName.trim())
				||"".equals(pwd.trim())){
			request.setAttribute("errorMessage", "账号或密码不能为空");
			request.getRequestDispatcher("login.jsp").forward(request, response);;
		}else if("admin".equals(userName)&&"abc".equals(pwd)) {
			request.getSession().setAttribute("administrator",userName);
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}else {
			request.setAttribute("errorMessage", "账号或密码不正确");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

}
