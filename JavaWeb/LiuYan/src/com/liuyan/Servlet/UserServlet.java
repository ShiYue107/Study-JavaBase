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
		//���ñ��뼯
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		//����ֵ
		String name = req.getParameter("userName");
		String password = req.getParameter("password");
		//���õ�¼����
		LoginDao dao = new UserLoginImpl();
		Login login = dao.userLogin(name, password);
		//�ж�ֵ
		if(login!=null) {
			HttpSession session = req.getSession();
			session.setAttribute("login", login);
			//ҳ�����ת���ض���ʽ����ҳ�����ת
			resp.sendRedirect("showMsg");
		}else {
			req.setAttribute("msg", "�û������������");
			req.getRequestDispatcher("error.jsp").forward(req, resp);
		}
	}

}
