package com.zf.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zf.dao.UserDao;
import com.zf.impl.UserDaoImpl;
import com.zf.pojo.User;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String operate = req.getParameter("operate");
		String targetUrl = "";
		UserDao userDao = new UserDaoImpl();
		switch (operate) {
		case "login":
			String uName = req.getParameter("uName");
			String uPass = req.getParameter("uPass");
			User user = (User)(req.getSession().getAttribute("user"));
			String msg = "";
			if(user == null) {
				user = userDao.findUser(uName);
				if(user != null && user.getuPass().equals(uPass)) {
					targetUrl = "start.jsp";
				}else {
					msg = "用户名或密码错误";
					targetUrl = "error.jsp"+msg;
				}
			}else {
				msg = "重复登录";
				targetUrl = "error.jsp"+msg;
			}
			break;
		case "reg":
			uName = req.getParameter("uName");
			uPass = req.getParameter("uPass");
			String head = req.getParameter("head");
			int gender = Integer.parseInt(req.getParameter("gender"));
			user = (User)req.getSession().getAttribute("user");
			if(uName != null && uPass !=null) {
				user = new User();
				user.setuName(uName);
				user.setuPass(uPass);
				user.setHead(head);
				user.setGender(gender);
				int num = userDao.addUser(user);
				if(num==1) {
					targetUrl = "stsrt.jsp";
				}else if(num==0){
					msg = "该用户已存在";
					targetUrl = "/error.jsp?msg="+msg;
				}
			}
			break;
		case "logout":
			req.getSession().removeAttribute("user");
			targetUrl = "start.jsp";
			break;
		default:
			break;
		}
		req.getRequestDispatcher(targetUrl).forward(req, resp);
	}
}
