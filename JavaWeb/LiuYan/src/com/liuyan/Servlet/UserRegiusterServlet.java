package com.liuyan.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.liuyan.Dao.UserLoginImpl;
import com.liuyan.model.Login;
@WebServlet("/userRegister")
public class UserRegiusterServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// ���ñ��뼯
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		//����ҳ��ֵ
		String name = req.getParameter("userName");
		String password = req.getParameter("password");
		int userType = Integer.parseInt(req.getParameter("userType"));
		//����login����
		Login login = new Login(0,name,password,userType);
		//����daoImpl�е�ע�᷽��
		boolean flag = new UserLoginImpl().UserRegister(login);
		//�ж���û��ע��ɹ�
		if(flag) {
			req.setAttribute("msg", "ע��ɹ���");
			req.getRequestDispatcher("UserLogin.jsp").forward(req, resp);
		}else {
			req.setAttribute("msg", "ע��ʧ�ܣ�");
			req.getRequestDispatcher("error.jsp").forward(req, resp);
		}
	}

}
