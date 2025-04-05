package com.liuyan.Servlet;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.liuyan.Dao.MessageDaoImpl;
import com.liuyan.model.Login;
import com.liuyan.model.Message;
@WebServlet("/addMsg")
public class AddMessageServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//���ñ��뼯
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		//��ҳ���������
		HttpSession session = req.getSession();
		Login login = (Login)session.getAttribute("login");
		System.out.println(login);
		String name = login.getName();
		Date time = new Date(System.currentTimeMillis());
		String title = req.getParameter("title");
		String message = req.getParameter("content");
		System.out.println(name+","+title+"��"+message);
		//�����յ������ݴ����Dao
		
		  Message msg = new Message(0,null,time,title,message); boolean flag = new
		  MessageDaoImpl().addMessage(msg); if(flag) { req.setAttribute("msg",
		  "���Գɹ���"); req.getRequestDispatcher("showMsg").forward(req, resp); }else {
		  req.setAttribute("msg", "���� ʧ�ܣ�");
		  req.getRequestDispatcher("error.jsp").forward(req, resp); }
		 
	}

}
