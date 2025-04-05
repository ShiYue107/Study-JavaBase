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
		// 设置编码集
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		//从Dao中获取数据
		List<Message> listMsg = new MessageDaoImpl().queryAllMsg();
		//将信息传递给指定页面
		req.setAttribute("list", listMsg);
		//指定页面
		req.getRequestDispatcher("main.jsp").forward(req, resp);
		
	}

}
