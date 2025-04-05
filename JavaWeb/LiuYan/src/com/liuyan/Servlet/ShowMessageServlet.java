package com.liuyan.Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.liuyan.Dao.MessageDaoImpl;
import com.liuyan.model.Message;
@WebServlet("/showMsg")
public class ShowMessageServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// ���ñ��뼯
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		//��Dao�л�ȡ����
		List<Message> listMsg = new MessageDaoImpl().queryAllMsg();
		//����Ϣ���ݸ�ָ��ҳ��
		req.setAttribute("list", listMsg);
		//ָ��ҳ��
		req.getRequestDispatcher("main.jsp").forward(req, resp);
		
	}

}
